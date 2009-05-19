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

public class ClientAuth implements TBase, java.io.Serializable, Cloneable
{
	private static final TStruct STRUCT_DESC = new TStruct("ClientAuth");
	private static final TField AUTHENTICATION_TYPE_FIELD_DESC = new TField("authentication_type", TType.STRING, (short) 1);
	private static final TField LOCAL_COMMUNICATION_ID_FIELD_DESC = new TField("local_communication_id", TType.STRING, (short) 2);
	private static final TField TOKEN_FIELD_DESC = new TField("token", TType.STRING, (short) 3);
	private static final TField USER_ID_FIELD_DESC = new TField("user_id", TType.STRING, (short) 4);
	private static final TField ROLE_FIELD_DESC = new TField("role", TType.LIST, (short) 5);

	public String authentication_type;
	public static final int AUTHENTICATION_TYPE = 1;
	public String local_communication_id;
	public static final int LOCAL_COMMUNICATION_ID = 2;
	public byte[] token;
	public static final int TOKEN = 3;
	public String user_id;
	public static final int USER_ID = 4;
	public List<String> role;
	public static final int ROLE = 5;

	private final Isset __isset = new Isset();

	private static final class Isset implements java.io.Serializable
	{
	}

	public static final Map<Integer, FieldMetaData> metaDataMap = Collections.unmodifiableMap(new HashMap<Integer, FieldMetaData>()
	{
		{
			put(AUTHENTICATION_TYPE, new FieldMetaData("authentication_type", TFieldRequirementType.OPTIONAL, new FieldValueMetaData(TType.STRING)));
			put(LOCAL_COMMUNICATION_ID, new FieldMetaData("local_communication_id", TFieldRequirementType.DEFAULT, new FieldValueMetaData(TType.STRING)));
			put(TOKEN, new FieldMetaData("token", TFieldRequirementType.DEFAULT, new FieldValueMetaData(TType.STRING)));
			put(USER_ID, new FieldMetaData("user_id", TFieldRequirementType.OPTIONAL, new FieldValueMetaData(TType.STRING)));
			put(ROLE, new FieldMetaData("role", TFieldRequirementType.DEFAULT, new ListMetaData(TType.LIST, new FieldValueMetaData(TType.STRING))));
		}
	});

	static
	{
		FieldMetaData.addStructMetaDataMap(ClientAuth.class, metaDataMap);
	}

	public ClientAuth()
	{
	}

	public ClientAuth(String authentication_type, String local_communication_id, byte[] token, String user_id, List<String> role)
	{
		this();
		this.authentication_type = authentication_type;
		this.local_communication_id = local_communication_id;
		this.token = token;
		this.user_id = user_id;
		this.role = role;
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public ClientAuth(ClientAuth other)
	{
		if (other.isSetAuthentication_type())
		{
			this.authentication_type = other.authentication_type;
		}
		if (other.isSetLocal_communication_id())
		{
			this.local_communication_id = other.local_communication_id;
		}
		if (other.isSetToken())
		{
			this.token = new byte[other.token.length];
			System.arraycopy(other.token, 0, token, 0, other.token.length);
		}
		if (other.isSetUser_id())
		{
			this.user_id = other.user_id;
		}
		if (other.isSetRole())
		{
			List<String> __this__role = new ArrayList<String>();
			for (String other_element : other.role)
			{
				__this__role.add(other_element);
			}
			this.role = __this__role;
		}
	}

	@Override
	public ClientAuth clone()
	{
		return new ClientAuth(this);
	}

	public String getAuthentication_type()
	{
		return this.authentication_type;
	}

	public void setAuthentication_type(String authentication_type)
	{
		this.authentication_type = authentication_type;
	}

	public void unsetAuthentication_type()
	{
		this.authentication_type = null;
	}

	// Returns true if field authentication_type is set (has been asigned a
	// value) and false otherwise
	public boolean isSetAuthentication_type()
	{
		return this.authentication_type != null;
	}

	public void setAuthentication_typeIsSet(boolean value)
	{
		if (!value)
		{
			this.authentication_type = null;
		}
	}

	public String getLocal_communication_id()
	{
		return this.local_communication_id;
	}

	public void setLocal_communication_id(String local_communication_id)
	{
		this.local_communication_id = local_communication_id;
	}

	public void unsetLocal_communication_id()
	{
		this.local_communication_id = null;
	}

	// Returns true if field local_communication_id is set (has been asigned a
	// value) and false otherwise
	public boolean isSetLocal_communication_id()
	{
		return this.local_communication_id != null;
	}

	public void setLocal_communication_idIsSet(boolean value)
	{
		if (!value)
		{
			this.local_communication_id = null;
		}
	}

	public byte[] getToken()
	{
		return this.token;
	}

	public void setToken(byte[] token)
	{
		this.token = token;
	}

	public void unsetToken()
	{
		this.token = null;
	}

	// Returns true if field token is set (has been asigned a value) and false
	// otherwise
	public boolean isSetToken()
	{
		return this.token != null;
	}

	public void setTokenIsSet(boolean value)
	{
		if (!value)
		{
			this.token = null;
		}
	}

	public String getUser_id()
	{
		return this.user_id;
	}

	public void setUser_id(String user_id)
	{
		this.user_id = user_id;
	}

	public void unsetUser_id()
	{
		this.user_id = null;
	}

	// Returns true if field user_id is set (has been asigned a value) and false
	// otherwise
	public boolean isSetUser_id()
	{
		return this.user_id != null;
	}

	public void setUser_idIsSet(boolean value)
	{
		if (!value)
		{
			this.user_id = null;
		}
	}

	public int getRoleSize()
	{
		return (this.role == null) ? 0 : this.role.size();
	}

	public java.util.Iterator<String> getRoleIterator()
	{
		return (this.role == null) ? null : this.role.iterator();
	}

	public void addToRole(String elem)
	{
		if (this.role == null)
		{
			this.role = new ArrayList<String>();
		}
		this.role.add(elem);
	}

	public List<String> getRole()
	{
		return this.role;
	}

	public void setRole(List<String> role)
	{
		this.role = role;
	}

	public void unsetRole()
	{
		this.role = null;
	}

	// Returns true if field role is set (has been asigned a value) and false
	// otherwise
	public boolean isSetRole()
	{
		return this.role != null;
	}

	public void setRoleIsSet(boolean value)
	{
		if (!value)
		{
			this.role = null;
		}
	}

	public void setFieldValue(int fieldID, Object value)
	{
		switch (fieldID)
		{
		case AUTHENTICATION_TYPE:
			setAuthentication_type((String) value);
			break;

		case LOCAL_COMMUNICATION_ID:
			setLocal_communication_id((String) value);
			break;

		case TOKEN:
			setToken((byte[]) value);
			break;

		case USER_ID:
			setUser_id((String) value);
			break;

		case ROLE:
			setRole((List<String>) value);
			break;

		default:
			throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
		}
	}

	public Object getFieldValue(int fieldID)
	{
		switch (fieldID)
		{
		case AUTHENTICATION_TYPE:
			return getAuthentication_type();

		case LOCAL_COMMUNICATION_ID:
			return getLocal_communication_id();

		case TOKEN:
			return getToken();

		case USER_ID:
			return getUser_id();

		case ROLE:
			return getRole();

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
		case AUTHENTICATION_TYPE:
			return isSetAuthentication_type();
		case LOCAL_COMMUNICATION_ID:
			return isSetLocal_communication_id();
		case TOKEN:
			return isSetToken();
		case USER_ID:
			return isSetUser_id();
		case ROLE:
			return isSetRole();
		default:
			throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
		}
	}

	@Override
	public boolean equals(Object that)
	{
		if (that == null)
			return false;
		if (that instanceof ClientAuth)
			return this.equals((ClientAuth) that);
		return false;
	}

	public boolean equals(ClientAuth that)
	{
		if (that == null)
			return false;

		boolean this_present_authentication_type = true && this.isSetAuthentication_type();
		boolean that_present_authentication_type = true && that.isSetAuthentication_type();
		if (this_present_authentication_type || that_present_authentication_type)
		{
			if (!(this_present_authentication_type && that_present_authentication_type))
				return false;
			if (!this.authentication_type.equals(that.authentication_type))
				return false;
		}

		boolean this_present_local_communication_id = true && this.isSetLocal_communication_id();
		boolean that_present_local_communication_id = true && that.isSetLocal_communication_id();
		if (this_present_local_communication_id || that_present_local_communication_id)
		{
			if (!(this_present_local_communication_id && that_present_local_communication_id))
				return false;
			if (!this.local_communication_id.equals(that.local_communication_id))
				return false;
		}

		boolean this_present_token = true && this.isSetToken();
		boolean that_present_token = true && that.isSetToken();
		if (this_present_token || that_present_token)
		{
			if (!(this_present_token && that_present_token))
				return false;
			if (!java.util.Arrays.equals(this.token, that.token))
				return false;
		}

		boolean this_present_user_id = true && this.isSetUser_id();
		boolean that_present_user_id = true && that.isSetUser_id();
		if (this_present_user_id || that_present_user_id)
		{
			if (!(this_present_user_id && that_present_user_id))
				return false;
			if (!this.user_id.equals(that.user_id))
				return false;
		}

		boolean this_present_role = true && this.isSetRole();
		boolean that_present_role = true && that.isSetRole();
		if (this_present_role || that_present_role)
		{
			if (!(this_present_role && that_present_role))
				return false;
			if (!this.role.equals(that.role))
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
			case AUTHENTICATION_TYPE:
				if (field.type == TType.STRING)
				{
					this.authentication_type = iprot.readString();
				}
				else
				{
					TProtocolUtil.skip(iprot, field.type);
				}
				break;
			case LOCAL_COMMUNICATION_ID:
				if (field.type == TType.STRING)
				{
					this.local_communication_id = iprot.readString();
				}
				else
				{
					TProtocolUtil.skip(iprot, field.type);
				}
				break;
			case TOKEN:
				if (field.type == TType.STRING)
				{
					this.token = iprot.readBinary();
				}
				else
				{
					TProtocolUtil.skip(iprot, field.type);
				}
				break;
			case USER_ID:
				if (field.type == TType.STRING)
				{
					this.user_id = iprot.readString();
				}
				else
				{
					TProtocolUtil.skip(iprot, field.type);
				}
				break;
			case ROLE:
				if (field.type == TType.LIST)
				{
					{
						TList _list5 = iprot.readListBegin();
						this.role = new ArrayList<String>(_list5.size);
						for (int _i6 = 0; _i6 < _list5.size; ++_i6)
						{
							String _elem7;
							_elem7 = iprot.readString();
							this.role.add(_elem7);
						}
						iprot.readListEnd();
					}
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
		if (this.authentication_type != null)
		{
			oprot.writeFieldBegin(AUTHENTICATION_TYPE_FIELD_DESC);
			oprot.writeString(this.authentication_type);
			oprot.writeFieldEnd();
		}
		if (this.local_communication_id != null)
		{
			oprot.writeFieldBegin(LOCAL_COMMUNICATION_ID_FIELD_DESC);
			oprot.writeString(this.local_communication_id);
			oprot.writeFieldEnd();
		}
		if (this.token != null)
		{
			oprot.writeFieldBegin(TOKEN_FIELD_DESC);
			oprot.writeBinary(this.token);
			oprot.writeFieldEnd();
		}
		if (this.user_id != null)
		{
			oprot.writeFieldBegin(USER_ID_FIELD_DESC);
			oprot.writeString(this.user_id);
			oprot.writeFieldEnd();
		}
		if (this.role != null)
		{
			oprot.writeFieldBegin(ROLE_FIELD_DESC);
			{
				oprot.writeListBegin(new TList(TType.STRING, this.role.size()));
				for (String _iter8 : this.role)
				{
					oprot.writeString(_iter8);
				}
				oprot.writeListEnd();
			}
			oprot.writeFieldEnd();
		}
		oprot.writeFieldStop();
		oprot.writeStructEnd();
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder("ClientAuth(");
		boolean first = true;

		if (isSetAuthentication_type())
		{
			sb.append("authentication_type:");
			if (this.authentication_type == null)
			{
				sb.append("null");
			}
			else
			{
				sb.append(this.authentication_type);
			}
			first = false;
		}
		if (!first)
			sb.append(", ");
		sb.append("local_communication_id:");
		if (this.local_communication_id == null)
		{
			sb.append("null");
		}
		else
		{
			sb.append(this.local_communication_id);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("token:");
		if (this.token == null)
		{
			sb.append("null");
		}
		else
		{
			int __token_size = Math.min(this.token.length, 128);
			for (int i = 0; i < __token_size; i++)
			{
				if (i != 0)
					sb.append(" ");
				sb.append(Integer.toHexString(this.token[i]).length() > 1 ? Integer.toHexString(this.token[i]).substring(Integer.toHexString(this.token[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this.token[i]).toUpperCase());
			}
			if (this.token.length > 128)
				sb.append(" ...");
		}
		first = false;
		if (isSetUser_id())
		{
			if (!first)
				sb.append(", ");
			sb.append("user_id:");
			if (this.user_id == null)
			{
				sb.append("null");
			}
			else
			{
				sb.append(this.user_id);
			}
			first = false;
		}
		if (!first)
			sb.append(", ");
		sb.append("role:");
		if (this.role == null)
		{
			sb.append("null");
		}
		else
		{
			sb.append(this.role);
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
