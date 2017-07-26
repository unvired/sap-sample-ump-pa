//	Generated using Unvired Modeller - Build R-4.000.0094
package com.unvired.sample.sap.gen.sapproxy.record;

import com.unvired.jco.Structure;
import com.unvired.jco.meta.DataElementMeta;
import com.unvired.jco.meta.FieldMeta;
import com.unvired.jco.meta.StructureMeta;
public class MEREP_ADDRESS extends Structure
{
	private static final long serialVersionUID = 1L;
	public static StructureMeta METADATA;

	static
	{
		METADATA = new StructureMeta("MEREP_ADDRESS", "" );
		METADATA.setProxyClass("com.unvired.sample.sap.gen.sapproxy.record.MEREP_ADDRESS");
		METADATA.addField(new FieldMeta(0,"MANDT",new DataElementMeta(0,"CHAR","Client",3,0)));
		METADATA.addField(new FieldMeta(1,"PERSNUMBER",new DataElementMeta(6,"NUM","Person Number (Sample Application)",10,0)));
		METADATA.addField(new FieldMeta(2,"SEQNO_ADR",new DataElementMeta(6,"NUM","Seqeunce Number (Sample Application)",10,0)));
		METADATA.addField(new FieldMeta(3,"CITY1",new DataElementMeta(0,"CHAR","City1 (Sample Application)",40,0)));
		METADATA.addField(new FieldMeta(4,"CITY2",new DataElementMeta(0,"CHAR","City2 (Sample Application)",40,0)));
		METADATA.addField(new FieldMeta(5,"STREET",new DataElementMeta(0,"CHAR","Street (Sample Application)",40,0)));
		METADATA.addField(new FieldMeta(6,"HOUSE_NUM",new DataElementMeta(0,"CHAR","House Number (Sample Application)",40,0)));
		METADATA.addField(new FieldMeta(7,"REGION",new DataElementMeta(0,"CHAR","Region (Sample Application)",40,0)));
		METADATA.addField(new FieldMeta(8,"LAND",new DataElementMeta(0,"CHAR","Country (Sample Application)",3,0)));
	}
	public StructureMeta getMetaData()
	{
		return METADATA;
	}
	public MEREP_ADDRESS()
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

	public Long getSEQNO_ADR() {
		if(getValue(2)!=null)
			return Long.parseLong((String) getValue(2));
		else
			return null;
	}

	public void setSEQNO_ADR(Long value) {
		if(value!=null)
			setValue(2,value.toString());
	}

	public String getCITY1(){
		return (String)getValue(3);
	}

	public void setCITY1(String value){
		setValue(3,value);
	}

	public String getCITY2(){
		return (String)getValue(4);
	}

	public void setCITY2(String value){
		setValue(4,value);
	}

	public String getSTREET(){
		return (String)getValue(5);
	}

	public void setSTREET(String value){
		setValue(5,value);
	}

	public String getHOUSE_NUM(){
		return (String)getValue(6);
	}

	public void setHOUSE_NUM(String value){
		setValue(6,value);
	}

	public String getREGION(){
		return (String)getValue(7);
	}

	public void setREGION(String value){
		setValue(7,value);
	}

	public String getLAND(){
		return (String)getValue(8);
	}

	public void setLAND(String value){
		setValue(8,value);
	}

}