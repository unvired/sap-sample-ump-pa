//	Generated using Unvired Modeller - Build R-4.000.0094
package com.unvired.sample.sap.gen.sapproxy.record;

import com.unvired.jco.Structure;
import com.unvired.jco.meta.DataElementMeta;
import com.unvired.jco.meta.FieldMeta;
import com.unvired.jco.meta.StructureMeta;
public class MEREP_E_MAIL extends Structure
{
	private static final long serialVersionUID = 1L;
	public static StructureMeta METADATA;

	static
	{
		METADATA = new StructureMeta("MEREP_E_MAIL", "" );
		METADATA.setProxyClass("com.unvired.sample.sap.gen.sapproxy.record.MEREP_E_MAIL");
		METADATA.addField(new FieldMeta(0,"MANDT",new DataElementMeta(0,"CHAR","Client",3,0)));
		METADATA.addField(new FieldMeta(1,"PERSNUMBER",new DataElementMeta(6,"NUM","Person Number (Sample Application)",10,0)));
		METADATA.addField(new FieldMeta(2,"SEQNO_E_MAIL",new DataElementMeta(6,"NUM","Seqeunce Number (Sample Application)",10,0)));
		METADATA.addField(new FieldMeta(3,"E_ADDR",new DataElementMeta(0,"CHAR","E-mail Address (Sample Application)",40,0)));
		METADATA.addField(new FieldMeta(4,"E_ADDR_TEXT",new DataElementMeta(0,"CHAR","E-mail Address Description (Sample Application)",40,0)));
	}
	public StructureMeta getMetaData()
	{
		return METADATA;
	}
	public MEREP_E_MAIL()
	{
		super(METADATA.getName(), METADATA.getDescription());
	}

	public String getMANDT(){
		return (String)getValue(0);
	}

	public void setMANDT(String value){
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

	public Long getSEQNO_E_MAIL() {
		if(getValue(2)!=null)
			return Long.parseLong((String) getValue(2));
		else
			return null;
	}

	public void setSEQNO_E_MAIL(Long value) {
		if(value!=null)
			setValue(2,value.toString());
	}

	public String getE_ADDR(){
		return (String)getValue(3);
	}

	public void setE_ADDR(String value){
		setValue(3,value);
	}

	public String getE_ADDR_TEXT(){
		return (String)getValue(4);
	}

	public void setE_ADDR_TEXT(String value){
		setValue(4,value);
	}

}