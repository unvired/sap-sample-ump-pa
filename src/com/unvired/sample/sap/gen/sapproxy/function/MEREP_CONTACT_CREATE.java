//	Generated using Unvired Modeller - Build R-4.000.0094
package com.unvired.sample.sap.gen.sapproxy.function;

import java.util.List;

import com.unvired.jco.Function;
import com.unvired.jco.meta.DataElementMeta;
import com.unvired.jco.meta.FieldMeta;
import com.unvired.jco.meta.FunctionDescriptor;
import com.unvired.jco.meta.ParameterMeta;
import com.unvired.jco.meta.StructureMeta;
import com.unvired.jco.meta.TableMeta;
import com.unvired.sample.sap.gen.sapproxy.record.BAPIRET2;
import com.unvired.sample.sap.gen.sapproxy.record.MEREP_PERSON;
import com.unvired.sample.sap.gen.sapproxy.table.MEREP_ADDRESS_List;
import com.unvired.sample.sap.gen.sapproxy.table.MEREP_E_MAIL_List;

public class MEREP_CONTACT_CREATE extends Function
{
	private static final long serialVersionUID = 1L;
	private static FunctionDescriptor funcDesc;

	static
	{
		funcDesc = new FunctionDescriptor("MEREP_CONTACT_CREATE","MEREP_CONTACT_CREATE");
		funcDesc.addParameter(new ParameterMeta(0, "PERSON", "ME Relica: Person (Sample Application)",MEREP_PERSON.METADATA,0));
		funcDesc.addParameter(new ParameterMeta(1, "PERSNUMBER", "ME Replica: Personal number (Sample application)", new DataElementMeta(6, "PERSNUMBER", "ME Replica: Personal number (Sample application)",0,0),1));
		funcDesc.addParameter(new ParameterMeta(2, "RETURN", "Return Parameter",BAPIRET2.METADATA,1));
		funcDesc.addParameter(new ParameterMeta(3, "ADDRESS", "ME Relica: Address (Sample Application)",MEREP_ADDRESS_List.METADATA,3));
		funcDesc.addParameter(new ParameterMeta(4, "E_MAIL", "ME Relica: E-mail addressa (Sample Application)",MEREP_E_MAIL_List.METADATA,3));
	}

	public FunctionDescriptor getFunctionDescriptor()
	{
		return funcDesc;
	}

	public MEREP_CONTACT_CREATE() 
	{
		super("MEREP_CONTACT_CREATE");
	}

	public static void fetch(String parameterName)
	{
		ParameterMeta parameter = funcDesc.getParameter(parameterName);
		if(parameter!=null)
		{
			parameter.setActive(true);
		}
	}

	public static void fetch(String parameterName, String fieldName)
	{
		ParameterMeta parameter = funcDesc.getParameter(parameterName);
		if(parameter!=null)
		{
			List<FieldMeta> fieldMeta = null;
			if (parameter.getType() instanceof StructureMeta)
			{
				fieldMeta = ((StructureMeta)parameter.getType()).getFields();
			}
			else if(parameter.getType() instanceof TableMeta)
			{
				fieldMeta = ((TableMeta)parameter.getType()).getFields();
			}
			if(fieldMeta!=null)
			{
				for (FieldMeta field : fieldMeta)
				{
					field.setActive(true);
				}
			}
		}
	}

	public static void fetchPERSON()
	{
		ParameterMeta parameter = funcDesc.getParameter("PERSON");
		parameter.setActive(true);
		List<FieldMeta> fieldMeta = ((StructureMeta)parameter.getType()).getFields();
		if(fieldMeta!=null)
		{
			for (FieldMeta field : fieldMeta)
			{
				field.setActive(true);
			}
		}
	}

	public static void fetchPERSON(String fieldName)
	{
		ParameterMeta parameter = funcDesc.getParameter("PERSON");
		parameter.setActive(true);
		List<FieldMeta> fieldMeta = ((StructureMeta)parameter.getType()).getFields();
		if(fieldMeta!=null)
		{
			for (FieldMeta field : fieldMeta)
			{
				if(field.getName().equalsIgnoreCase(fieldName))
				{
					field.setActive(true);
					break;
				}
			}
		}
	}

	public static void fetchPERSNUMBER()
	{
		ParameterMeta parameter = funcDesc.getParameter("PERSNUMBER");
		if(parameter!=null)
		{
			parameter.setActive(true);
		}
	}

	public static void fetchRETURN()
	{
		ParameterMeta parameter = funcDesc.getParameter("RETURN");
		parameter.setActive(true);
		List<FieldMeta> fieldMeta = ((StructureMeta)parameter.getType()).getFields();
		if(fieldMeta!=null)
		{
			for (FieldMeta field : fieldMeta)
			{
				field.setActive(true);
			}
		}
	}

	public static void fetchRETURN(String fieldName)
	{
		ParameterMeta parameter = funcDesc.getParameter("RETURN");
		parameter.setActive(true);
		List<FieldMeta> fieldMeta = ((StructureMeta)parameter.getType()).getFields();
		if(fieldMeta!=null)
		{
			for (FieldMeta field : fieldMeta)
			{
				if(field.getName().equalsIgnoreCase(fieldName))
				{
					field.setActive(true);
					break;
				}
			}
		}
	}

	public static void fetchADDRESS()
	{
		ParameterMeta parameter = funcDesc.getParameter("ADDRESS");
		parameter.setActive(true);
		List<FieldMeta> fieldMeta = ((TableMeta)parameter.getType()).getFields();
		if(fieldMeta!=null)
		{
			for (FieldMeta field : fieldMeta)
			{
				field.setActive(true);
			}
		}
	}

	public static void fetchADDRESS(String fieldName)
	{
		ParameterMeta parameter = funcDesc.getParameter("ADDRESS");
		parameter.setActive(true);
		List<FieldMeta> fieldMeta = ((TableMeta)parameter.getType()).getFields();
		if(fieldMeta!=null)
		{
			for (FieldMeta field : fieldMeta)
			{
				if(field.getName().equalsIgnoreCase(fieldName))
				{
					field.setActive(true);
					break;
				}
			}
		}
	}

	public static void fetchE_MAIL()
	{
		ParameterMeta parameter = funcDesc.getParameter("E_MAIL");
		parameter.setActive(true);
		List<FieldMeta> fieldMeta = ((TableMeta)parameter.getType()).getFields();
		if(fieldMeta!=null)
		{
			for (FieldMeta field : fieldMeta)
			{
				field.setActive(true);
			}
		}
	}

	public static void fetchE_MAIL(String fieldName)
	{
		ParameterMeta parameter = funcDesc.getParameter("E_MAIL");
		parameter.setActive(true);
		List<FieldMeta> fieldMeta = ((TableMeta)parameter.getType()).getFields();
		if(fieldMeta!=null)
		{
			for (FieldMeta field : fieldMeta)
			{
				if(field.getName().equalsIgnoreCase(fieldName))
				{
					field.setActive(true);
					break;
				}
			}
		}
	}

	public MEREP_PERSON getPERSON()
	{
		return (MEREP_PERSON)getValue(0);
	}

	public void setPERSON(MEREP_PERSON value)
	{
		setValue(0,value);
	}

	public Long getPERSNUMBER() {
		if(getValue(1)!=null)
			return Long.parseLong((String) getValue(1));
		else
			return null;
	}

	public void setPERSNUMBER(Long value) {
		if(value!=null)
			setValue(1,value.toString());
	}

	public BAPIRET2 getRETURN()
	{
		return (BAPIRET2)getValue(2);
	}

	public void setRETURN(BAPIRET2 value)
	{
		setValue(2,value);
	}

	public MEREP_ADDRESS_List getADDRESS()
	{
		return (MEREP_ADDRESS_List)getValue(3);
	}

	public void setADDRESS(MEREP_ADDRESS_List value)
	{
		setValue(3,value);
	}

	public MEREP_E_MAIL_List getE_MAIL()
	{
		return (MEREP_E_MAIL_List)getValue(4);
	}

	public void setE_MAIL(MEREP_E_MAIL_List value)
	{
		setValue(4,value);
	}

}