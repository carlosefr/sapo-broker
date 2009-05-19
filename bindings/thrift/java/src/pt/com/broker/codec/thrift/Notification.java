/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package pt.com.broker.codec.thrift;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;

import org.apache.thrift.protocol.*;
import org.apache.thrift.transport.*;

public class Notification implements TBase, java.io.Serializable, Cloneable
{
	private static final TStruct STRUCT_DESC = new TStruct("Notification");
	private static final TField DESTINATION_FIELD_DESC = new TField("destination", TType.STRING, (short) 1);
	private static final TField SUBSCRIPTION_FIELD_DESC = new TField("subscription", TType.STRING, (short) 2);
	private static final TField DESTINATION_TYPE_FIELD_DESC = new TField("destination_type", TType.I32, (short) 3);
	private static final TField MESSAGE_FIELD_DESC = new TField("message", TType.STRUCT, (short) 4);

	public String destination;
	public static final int DESTINATION = 1;
	public String subscription;
	public static final int SUBSCRIPTION = 2;
	public int destination_type;
	public static final int DESTINATION_TYPE = 3;
	public BrokerMessage message;
	public static final int MESSAGE = 4;

	private final Isset __isset = new Isset();

	private static final class Isset implements java.io.Serializable
	{
		public boolean destination_type = false;
	}

	public static final Map<Integer, FieldMetaData> metaDataMap = Collections.unmodifiableMap(new HashMap<Integer, FieldMetaData>()
	{
		{
			put(DESTINATION, new FieldMetaData("destination", TFieldRequirementType.DEFAULT, new FieldValueMetaData(TType.STRING)));
			put(SUBSCRIPTION, new FieldMetaData("subscription", TFieldRequirementType.DEFAULT, new FieldValueMetaData(TType.STRING)));
			put(DESTINATION_TYPE, new FieldMetaData("destination_type", TFieldRequirementType.DEFAULT, new FieldValueMetaData(TType.I32)));
			put(MESSAGE, new FieldMetaData("message", TFieldRequirementType.DEFAULT, new StructMetaData(TType.STRUCT, BrokerMessage.class)));
		}
	});

	static
	{
		FieldMetaData.addStructMetaDataMap(Notification.class, metaDataMap);
	}

	public Notification()
	{
	}

	public Notification(String destination, String subscription, int destination_type, BrokerMessage message)
	{
		this();
		this.destination = destination;
		this.subscription = subscription;
		this.destination_type = destination_type;
		this.__isset.destination_type = true;
		this.message = message;
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public Notification(Notification other)
	{
		if (other.isSetDestination())
		{
			this.destination = other.destination;
		}
		if (other.isSetSubscription())
		{
			this.subscription = other.subscription;
		}
		__isset.destination_type = other.__isset.destination_type;
		this.destination_type = other.destination_type;
		if (other.isSetMessage())
		{
			this.message = new BrokerMessage(other.message);
		}
	}

	@Override
	public Notification clone()
	{
		return new Notification(this);
	}

	public String getDestination()
	{
		return this.destination;
	}

	public void setDestination(String destination)
	{
		this.destination = destination;
	}

	public void unsetDestination()
	{
		this.destination = null;
	}

	// Returns true if field destination is set (has been asigned a value) and
	// false otherwise
	public boolean isSetDestination()
	{
		return this.destination != null;
	}

	public void setDestinationIsSet(boolean value)
	{
		if (!value)
		{
			this.destination = null;
		}
	}

	public String getSubscription()
	{
		return this.subscription;
	}

	public void setSubscription(String subscription)
	{
		this.subscription = subscription;
	}

	public void unsetSubscription()
	{
		this.subscription = null;
	}

	// Returns true if field subscription is set (has been asigned a value) and
	// false otherwise
	public boolean isSetSubscription()
	{
		return this.subscription != null;
	}

	public void setSubscriptionIsSet(boolean value)
	{
		if (!value)
		{
			this.subscription = null;
		}
	}

	public int getDestination_type()
	{
		return this.destination_type;
	}

	public void setDestination_type(int destination_type)
	{
		this.destination_type = destination_type;
		this.__isset.destination_type = true;
	}

	public void unsetDestination_type()
	{
		this.__isset.destination_type = false;
	}

	// Returns true if field destination_type is set (has been asigned a value)
	// and false otherwise
	public boolean isSetDestination_type()
	{
		return this.__isset.destination_type;
	}

	public void setDestination_typeIsSet(boolean value)
	{
		this.__isset.destination_type = value;
	}

	public BrokerMessage getMessage()
	{
		return this.message;
	}

	public void setMessage(BrokerMessage message)
	{
		this.message = message;
	}

	public void unsetMessage()
	{
		this.message = null;
	}

	// Returns true if field message is set (has been asigned a value) and false
	// otherwise
	public boolean isSetMessage()
	{
		return this.message != null;
	}

	public void setMessageIsSet(boolean value)
	{
		if (!value)
		{
			this.message = null;
		}
	}

	public void setFieldValue(int fieldID, Object value)
	{
		switch (fieldID)
		{
		case DESTINATION:
			setDestination((String) value);
			break;

		case SUBSCRIPTION:
			setSubscription((String) value);
			break;

		case DESTINATION_TYPE:
			setDestination_type((Integer) value);
			break;

		case MESSAGE:
			setMessage((BrokerMessage) value);
			break;

		default:
			throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
		}
	}

	public Object getFieldValue(int fieldID)
	{
		switch (fieldID)
		{
		case DESTINATION:
			return getDestination();

		case SUBSCRIPTION:
			return getSubscription();

		case DESTINATION_TYPE:
			return getDestination_type();

		case MESSAGE:
			return getMessage();

		default:
			throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
		}
	}

	// Returns true if field corresponding to fieldID is set (has been asigned a
	// value) and false otherwise
	public boolean isSet(int fieldID)
	{
		switch (fieldID)
		{
		case DESTINATION:
			return isSetDestination();
		case SUBSCRIPTION:
			return isSetSubscription();
		case DESTINATION_TYPE:
			return isSetDestination_type();
		case MESSAGE:
			return isSetMessage();
		default:
			throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
		}
	}

	@Override
	public boolean equals(Object that)
	{
		if (that == null)
			return false;
		if (that instanceof Notification)
			return this.equals((Notification) that);
		return false;
	}

	public boolean equals(Notification that)
	{
		if (that == null)
			return false;

		boolean this_present_destination = true && this.isSetDestination();
		boolean that_present_destination = true && that.isSetDestination();
		if (this_present_destination || that_present_destination)
		{
			if (!(this_present_destination && that_present_destination))
				return false;
			if (!this.destination.equals(that.destination))
				return false;
		}

		boolean this_present_subscription = true && this.isSetSubscription();
		boolean that_present_subscription = true && that.isSetSubscription();
		if (this_present_subscription || that_present_subscription)
		{
			if (!(this_present_subscription && that_present_subscription))
				return false;
			if (!this.subscription.equals(that.subscription))
				return false;
		}

		boolean this_present_destination_type = true;
		boolean that_present_destination_type = true;
		if (this_present_destination_type || that_present_destination_type)
		{
			if (!(this_present_destination_type && that_present_destination_type))
				return false;
			if (this.destination_type != that.destination_type)
				return false;
		}

		boolean this_present_message = true && this.isSetMessage();
		boolean that_present_message = true && that.isSetMessage();
		if (this_present_message || that_present_message)
		{
			if (!(this_present_message && that_present_message))
				return false;
			if (!this.message.equals(that.message))
				return false;
		}

		return true;
	}

	@Override
	public int hashCode()
	{
		return 0;
	}

	public void read(TProtocol iprot) throws TException
	{
		TField field;
		iprot.readStructBegin();
		while (true)
		{
			field = iprot.readFieldBegin();
			if (field.type == TType.STOP)
			{
				break;
			}
			switch (field.id)
			{
			case DESTINATION:
				if (field.type == TType.STRING)
				{
					this.destination = iprot.readString();
				}
				else
				{
					TProtocolUtil.skip(iprot, field.type);
				}
				break;
			case SUBSCRIPTION:
				if (field.type == TType.STRING)
				{
					this.subscription = iprot.readString();
				}
				else
				{
					TProtocolUtil.skip(iprot, field.type);
				}
				break;
			case DESTINATION_TYPE:
				if (field.type == TType.I32)
				{
					this.destination_type = iprot.readI32();
					this.__isset.destination_type = true;
				}
				else
				{
					TProtocolUtil.skip(iprot, field.type);
				}
				break;
			case MESSAGE:
				if (field.type == TType.STRUCT)
				{
					this.message = new BrokerMessage();
					this.message.read(iprot);
				}
				else
				{
					TProtocolUtil.skip(iprot, field.type);
				}
				break;
			default:
				TProtocolUtil.skip(iprot, field.type);
				break;
			}
			iprot.readFieldEnd();
		}
		iprot.readStructEnd();

		// check for required fields of primitive type, which can't be checked
		// in the validate method
		validate();
	}

	public void write(TProtocol oprot) throws TException
	{
		validate();

		oprot.writeStructBegin(STRUCT_DESC);
		if (this.destination != null)
		{
			oprot.writeFieldBegin(DESTINATION_FIELD_DESC);
			oprot.writeString(this.destination);
			oprot.writeFieldEnd();
		}
		if (this.subscription != null)
		{
			oprot.writeFieldBegin(SUBSCRIPTION_FIELD_DESC);
			oprot.writeString(this.subscription);
			oprot.writeFieldEnd();
		}
		oprot.writeFieldBegin(DESTINATION_TYPE_FIELD_DESC);
		oprot.writeI32(this.destination_type);
		oprot.writeFieldEnd();
		if (this.message != null)
		{
			oprot.writeFieldBegin(MESSAGE_FIELD_DESC);
			this.message.write(oprot);
			oprot.writeFieldEnd();
		}
		oprot.writeFieldStop();
		oprot.writeStructEnd();
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder("Notification(");
		boolean first = true;

		sb.append("destination:");
		if (this.destination == null)
		{
			sb.append("null");
		}
		else
		{
			sb.append(this.destination);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("subscription:");
		if (this.subscription == null)
		{
			sb.append("null");
		}
		else
		{
			sb.append(this.subscription);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("destination_type:");
		sb.append(this.destination_type);
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("message:");
		if (this.message == null)
		{
			sb.append("null");
		}
		else
		{
			sb.append(this.message);
		}
		first = false;
		sb.append(")");
		return sb.toString();
	}

	public void validate() throws TException
	{
		// check for required fields
		// check that fields of type enum have valid values
		if (__isset.destination_type && !DestinationType.VALID_VALUES.contains(destination_type))
		{
			throw new TProtocolException("Invalid value of field 'destination_type'!");
		}
	}

}
