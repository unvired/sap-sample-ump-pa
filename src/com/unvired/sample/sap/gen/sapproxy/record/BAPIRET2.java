//	Generated using Unvired Modeller - Build R-4.000.0094
package com.unvired.sample.sap.gen.sapproxy.record;

import com.unvired.jco.Structure;
import com.unvired.jco.meta.DataElementMeta;
import com.unvired.jco.meta.FieldMeta;
import com.unvired.jco.meta.StructureMeta;
public class BAPIRET2 extends Structure
{
	private static final long serialVersionUID = 1L;
	public static StructureMeta METADATA;

	static
	{
		METADATA = new StructureMeta("BAPIRET2", "" );
		METADATA.setProxyClass("com.unvired.sample.sap.gen.sapproxy.record.BAPIRET2");
		METADATA.addField(new FieldMeta(0,"TYPE",new DataElementMeta(0,"CHAR","Message type: S Success, E Error, W Warning, I Info, A Abort",1,0)));
		METADATA.addField(new FieldMeta(1,"ID",new DataElementMeta(0,"CHAR","Message Class",20,0)));
		METADATA.addField(new FieldMeta(2,"NUMBER",new DataElementMeta(6,"NUM","Message Number",3,0)));
		METADATA.addField(new FieldMeta(3,"MESSAGE",new DataElementMeta(0,"CHAR","Message Text",220,0)));
		METADATA.addField(new FieldMeta(4,"LOG_NO",new DataElementMeta(0,"CHAR","Application log: log number",20,0)));
		METADATA.addField(new FieldMeta(5,"LOG_MSG_NO",new DataElementMeta(6,"NUM","Application log: Internal message serial number",6,0)));
		METADATA.addField(new FieldMeta(6,"MESSAGE_V1",new DataElementMeta(0,"CHAR","Message Variable",50,0)));
		METADATA.addField(new FieldMeta(7,"MESSAGE_V2",new DataElementMeta(0,"CHAR","Message Variable",50,0)));
		METADATA.addField(new FieldMeta(8,"MESSAGE_V3",new DataElementMeta(0,"CHAR","Message Variable",50,0)));
		METADATA.addField(new FieldMeta(9,"MESSAGE_V4",new DataElementMeta(0,"CHAR","Message Variable",50,0)));
		METADATA.addField(new FieldMeta(10,"PARAMETER",new DataElementMeta(0,"CHAR","Parameter Name",32,0)));
		METADATA.addField(new FieldMeta(11,"ROW",new DataElementMeta(8,"INT","Lines in parameter",4,0)));
		METADATA.addField(new FieldMeta(12,"FIELD",new DataElementMeta(0,"CHAR","Field in parameter",30,0)));
		METADATA.addField(new FieldMeta(13,"SYSTEM",new DataElementMeta(0,"CHAR","Logical system from which message originates",10,0)));
	}
	public StructureMeta getMetaData()
	{
		return METADATA;
	}
	public BAPIRET2()
	{
		super(METADATA.getName(), METADATA.getDescription());
	}

	public String getTYPE(){
		return (String)getValue(0);
	}

	public void setTYPE(String value){
		setValue(0,value);
	}

	public String getID(){
		return (String)getValue(1);
	}

	public void setID(String value){
		setValue(1,value);
	}

	public Long getNUMBER() {
		if(getValue(2)!=null)
			return Long.parseLong((String) getValue(2));
		else
			return null;
	}

	public void setNUMBER(Long value) {
		if(value!=null)
			setValue(2,value.toString());
	}

	public String getMESSAGE(){
		return (String)getValue(3);
	}

	public void setMESSAGE(String value){
		setValue(3,value);
	}

	public String getLOG_NO(){
		return (String)getValue(4);
	}

	public void setLOG_NO(String value){
		setValue(4,value);
	}

	public Long getLOG_MSG_NO() {
		if(getValue(5)!=null)
			return Long.parseLong((String) getValue(5));
		else
			return null;
	}

	public void setLOG_MSG_NO(Long value) {
		if(value!=null)
			setValue(5,value.toString());
	}

	public String getMESSAGE_V1(){
		return (String)getValue(6);
	}

	public void setMESSAGE_V1(String value){
		setValue(6,value);
	}

	public String getMESSAGE_V2(){
		return (String)getValue(7);
	}

	public void setMESSAGE_V2(String value){
		setValue(7,value);
	}

	public String getMESSAGE_V3(){
		return (String)getValue(8);
	}

	public void setMESSAGE_V3(String value){
		setValue(8,value);
	}

	public String getMESSAGE_V4(){
		return (String)getValue(9);
	}

	public void setMESSAGE_V4(String value){
		setValue(9,value);
	}

	public String getPARAMETER(){
		return (String)getValue(10);
	}

	public void setPARAMETER(String value){
		setValue(10,value);
	}

	public Integer getROW(){
		return (Integer)getValue(11);
	}

	public void setROW(Integer value){
		setValue(11,value);
	}

	public String getFIELD(){
		return (String)getValue(12);
	}

	public void setFIELD(String value){
		setValue(12,value);
	}

	public String getSYSTEM(){
		return (String)getValue(13);
	}

	public void setSYSTEM(String value){
		setValue(13,value);
	}

}