//	Generated using Unvired Modeller - Build R-4.000.0094
package com.unvired.sample.sap.gen.sapproxy.record;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;

import com.unvired.jco.Structure;
import com.unvired.jco.meta.DataElementMeta;
import com.unvired.jco.meta.FieldMeta;
import com.unvired.jco.meta.StructureMeta;
public class MEREP_PERSON extends Structure
{
	private static final long serialVersionUID = 1L;
	public static StructureMeta METADATA;

	static
	{
		METADATA = new StructureMeta("MEREP_PERSON", "" );
		METADATA.setProxyClass("com.unvired.sample.sap.gen.sapproxy.record.MEREP_PERSON");
		METADATA.addField(new FieldMeta(0,"MANDT",new DataElementMeta(0,"CHAR","Client",3,0)));
		METADATA.addField(new FieldMeta(1,"PERSNUMBER",new DataElementMeta(6,"NUM","Person Number (Sample Application)",10,0)));
		METADATA.addField(new FieldMeta(2,"FIRST_NAME",new DataElementMeta(0,"CHAR","First Name (Sample Application)",40,0)));
		METADATA.addField(new FieldMeta(3,"LAST_NAME",new DataElementMeta(0,"CHAR","Last Name (Sample Application)",40,0)));
		METADATA.addField(new FieldMeta(4,"PROFESSION",new DataElementMeta(0,"CHAR","Profession (Sample Application)",40,0)));
		METADATA.addField(new FieldMeta(5,"SEX",new DataElementMeta(0,"CHAR","Gender (Sample Application)",1,0)));
		METADATA.addField(new FieldMeta(6,"BIRTHDAY",new DataElementMeta(1,"DATE","Birthday (Sample Application)",10,0)));
		METADATA.addField(new FieldMeta(7,"WEIGHT",new DataElementMeta(2,"BCD","Weight (Sample Application)",3,2)));
		METADATA.addField(new FieldMeta(8,"HEIGHT",new DataElementMeta(2,"BCD","Height (Sample Application)",3,2)));
		METADATA.addField(new FieldMeta(9,"CATEGORY1",new DataElementMeta(6,"NUM","Category1 (Sample Application)",2,0)));
		METADATA.addField(new FieldMeta(10,"CATEGORY2",new DataElementMeta(0,"CHAR","Category2 (Sample Application)",20,0)));
		METADATA.addField(new FieldMeta(11,"CREDAT",new DataElementMeta(1,"DATE","Created on",10,0)));
		METADATA.addField(new FieldMeta(12,"CRENAM",new DataElementMeta(0,"CHAR","Created by",12,0)));
		METADATA.addField(new FieldMeta(13,"CRETIM",new DataElementMeta(3,"TIME","Create Time",8,0)));
		METADATA.addField(new FieldMeta(14,"CHGDAT",new DataElementMeta(1,"DATE","Last Changed on",10,0)));
		METADATA.addField(new FieldMeta(15,"CHGNAM",new DataElementMeta(0,"CHAR","Last Changed by",12,0)));
		METADATA.addField(new FieldMeta(16,"CHGTIM",new DataElementMeta(3,"TIME","Last Changed at",8,0)));
	}
	public StructureMeta getMetaData()
	{
		return METADATA;
	}
	public MEREP_PERSON()
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

	public String getFIRST_NAME(){
		return (String)getValue(2);
	}

	public void setFIRST_NAME(String value){
		setValue(2,value);
	}

	public String getLAST_NAME(){
		return (String)getValue(3);
	}

	public void setLAST_NAME(String value){
		setValue(3,value);
	}

	public String getPROFESSION(){
		return (String)getValue(4);
	}

	public void setPROFESSION(String value){
		setValue(4,value);
	}

	public String getSEX(){
		return (String)getValue(5);
	}

	public void setSEX(String value){
		setValue(5,value);
	}

	public Date getBIRTHDAY(){
		return (Date)getValue(6);
	}

	public void setBIRTHDAY(Date value){
		setValue(6,value);
	}

	public BigDecimal getWEIGHT(){
		return (BigDecimal)getValue(7);
	}

	public void setWEIGHT(BigDecimal value){
		setValue(7,value);
	}

	public BigDecimal getHEIGHT(){
		return (BigDecimal)getValue(8);
	}

	public void setHEIGHT(BigDecimal value){
		setValue(8,value);
	}

	public Long getCATEGORY1() {
		if(getValue(9)!=null)
			return Long.parseLong((String) getValue(9));
		else
			return null;
	}

	public void setCATEGORY1(Long value) {
		if(value!=null)
			setValue(9,value.toString());
	}

	public String getCATEGORY2(){
		return (String)getValue(10);
	}

	public void setCATEGORY2(String value){
		setValue(10,value);
	}

	public Date getCREDAT(){
		return (Date)getValue(11);
	}

	public void setCREDAT(Date value){
		setValue(11,value);
	}

	public String getCRENAM(){
		return (String)getValue(12);
	}

	public void setCRENAM(String value){
		setValue(12,value);
	}

	public Time getCRETIM(){
		return (Time)getValue(13);
	}

	public void setCRETIM(Time value){
		setValue(13,value);
	}

	public Date getCHGDAT(){
		return (Date)getValue(14);
	}

	public void setCHGDAT(Date value){
		setValue(14,value);
	}

	public String getCHGNAM(){
		return (String)getValue(15);
	}

	public void setCHGNAM(String value){
		setValue(15,value);
	}

	public Time getCHGTIM(){
		return (Time)getValue(16);
	}

	public void setCHGTIM(Time value){
		setValue(16,value);
	}

}