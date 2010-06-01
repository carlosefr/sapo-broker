package pt.com.broker.messaging;

import java.util.concurrent.atomic.AtomicBoolean;

import org.jboss.netty.channel.ChannelFuture;
import org.jboss.netty.channel.ChannelFutureListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pt.com.broker.net.BrokerProtocolHandler;
import pt.com.broker.types.ForwardResult;
import pt.com.broker.types.ListenerChannel;
import pt.com.broker.types.NetMessage;
import pt.com.broker.types.ForwardResult.Result;
import pt.com.broker.types.NetAction.DestinationType;
import pt.com.gcs.messaging.Gcs;

/**
 * BrokerQueueListener represents a local queue consumer.
 */
public class BrokerQueueListener extends BrokerListener
{
	private static final Logger log = LoggerFactory.getLogger(BrokerQueueListener.class);

	private static final long RESERVE_TIME = 2 * 60 * 1000; // reserve for 2mn
	private static final String ACK_REQUIRED = "ACK_REQUIRED";

	private static final ForwardResult success = new ForwardResult(Result.SUCCESS, RESERVE_TIME);
	private static final ForwardResult ackNotRequired = new ForwardResult(Result.NOT_ACKNOWLEDGE);
	private final boolean ackRequired;

	private boolean showSuspendedDeliveryMessage;

	private AtomicBoolean isReady = new AtomicBoolean(true);	
	
	public BrokerQueueListener(ListenerChannel lchannel, String destinationName, boolean ackRequired)
	{
		super(lchannel, destinationName);
		this.ackRequired = ackRequired;
		this.showSuspendedDeliveryMessage = true;
	}

	@Override
	public boolean isAckRequired()
	{
		return ackRequired;
	}

	@Override
	public DestinationType getSourceDestinationType()
	{
		return DestinationType.QUEUE;
	}

	@Override
	public DestinationType getTargetDestinationType()
	{
		return DestinationType.QUEUE;
	}
	
	@Override
	protected ForwardResult doOnMessage(NetMessage response)
	{
		final ListenerChannel lchannel = getChannel();

		try
		{
			if (lchannel.isWritable())
			{
				lchannel.write(response);
				isReady.set(true);
			}
			else
			{
				if (isReady())
				{
					ChannelFuture future = lchannel.write(response);
					isReady.set(false);
					if (showSuspendedDeliveryMessage && log.isDebugEnabled())
					{
						log.debug(String.format("Suspending message delivery for queue '%s' to session '%s'.", getsubscriptionKey(), lchannel.getRemoteAddressAsString()));
					}

					future.addListener(new ChannelFutureListener()
					{
						@Override
						public void operationComplete(ChannelFuture future) throws Exception
						{
							isReady.set(true);
							if(lchannel.isWritable())
							{
								if (log.isDebugEnabled())
								{
									log.debug(String.format("Resume message delivery for queue '%s' to session '%s'.", getsubscriptionKey(), lchannel.getRemoteAddressAsString()));
								}								
								showSuspendedDeliveryMessage = true;
							}
							else
							{
								showSuspendedDeliveryMessage = false;
							}
						}
					});
				}
				else
				{
					return failed;
				}
			}

			if (isAckRequired())
				return success;

			return ackNotRequired;
		}
		catch (Throwable e)
		{
			if (e instanceof org.jibx.runtime.JiBXException)
			{
				try
				{
					String mid = response.getAction().getNotificationMessage().getMessage().getMessageId();
					Gcs.ackMessage(getsubscriptionKey(), mid);
					log.warn("Undeliverable message was deleted. Id: '{}'", mid);
				}
				catch (Throwable tx)
				{
					// ignore
				}
			}
			try
			{
				((BrokerProtocolHandler) lchannel.getPipeline().get("broker-handler")).exceptionCaught(lchannel.getChannel(), e, null);
			}
			catch (Throwable t)
			{
				log.error(t.getMessage(), t);
			}
		}

		return failed;
	}

	@Override
	public boolean isReady()
	{
		return isReady.get();
	}

	@Override
	public boolean isActive()
	{
		return true;
	}
}
