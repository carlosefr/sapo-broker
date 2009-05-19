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

public class Ping implements TBase, java.io.Serializable, Cloneable
{
	private static final TStruct STRUCT_DESC = new TStruct("Ping");
	private static final TField ACTION_ID_FIELD_DESC = new TField("action_id", TType.STRING, (short) 1);

	public String action_id;
	public static final int ACTION_ID = 1;

	private final Isset __isset = new Isset();

	private static final class Isset implements java.io.Serializable
	{
	}

	public static final Map<Integer, FieldMetaData> metaDataMap = Collections.unmodifiableMap(new HashMap<Integer, FieldMetaData>()
	{
		{
			put(ACTION_ID, new FieldMetaData("action_id", TFieldRequirementType.DEFAULT, new FieldValueMetaData(TType.STRING)));
		}
	});

	static
	{
		FieldMetaData.addStructMetaDataMap(Ping.class, metaDataMap);
	}

	public Ping()
	{
	}

	public Ping(String action_id)
	{
		this();
		this.action_id = action_id;
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public Ping(Ping other)
	{
		if (other.isSetAction_id())
		{
			this.action_id = other.action_id;
		}
	}

	@Override
	public Ping clone()
	{
		return new Ping(this);
	}

	public String getAction_id()
	{
		return this.action_id;
	}

	public void setAction_id(String action_id)
	{
		this.action_id = action_id;
	}

	public void unsetAction_id()
	{
		this.action_id = null;
	}

	// Returns true if field action_id is set (has been asigned a value) and
	// false otherwise
	public boolean isSetAction_id()
	{
		return this.action_id != null;
	}

	public void setAction_idIsSet(boolean value)
	{
		if (!value)
		{
			this.action_id = null;
		}
	}

	public void setFieldValue(int fieldID, Object value)
	{
		switch (fieldID)
		{
		case ACTION_ID:
			setAction_id((String) value);
			break;

		default:
			throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
		}
	}

	public Object getFieldValue(int fieldID)
	{
		switch (fieldID)
		{
		case ACTION_ID:
			return getAction_id();

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
		case ACTION_ID:
			return isSetAction_id();
		default:
			throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
		}
	}

	@Override
	public boolean equals(Object that)
	{
		if (that == null)
			return false;
		if (that instanceof Ping)
			return this.equals((Ping) that);
		return false;
	}

	public boolean equals(Ping that)
	{
		if (that == null)
			return false;

		boolean this_present_action_id = true && this.isSetAction_id();
		boolean that_present_action_id = true && that.isSetAction_id();
		if (this_present_action_id || that_present_action_id)
		{
			if (!(this_present_action_id && that_present_action_id))
				return false;
			if (!this.action_id.equals(that.action_id))
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
			case ACTION_ID:
				if (field.type == TType.STRING)
				{
					this.action_id = iprot.readString();
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
		if (this.action_id != null)
		{
			oprot.writeFieldBegin(ACTION_ID_FIELD_DESC);
			oprot.writeString(this.action_id);
			oprot.writeFieldEnd();
		}
		oprot.writeFieldStop();
		oprot.writeStructEnd();
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder("Ping(");
		boolean first = true;

		sb.append("action_id:");
		if (this.action_id == null)
		{
			sb.append("null");
		}
		else
		{
			sb.append(this.action_id);
		}
		first = false;
		sb.append(")");
		return sb.toString();
	}

	public void validate() throws TException
	{
		// check for required fields
		// check that fields of type enum have valid values
	}

}
