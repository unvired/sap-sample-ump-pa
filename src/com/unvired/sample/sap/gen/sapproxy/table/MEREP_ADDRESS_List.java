//	Generated using Unvired Modeller - Build R-4.000.0094
package com.unvired.sample.sap.gen.sapproxy.table;

import java.util.Enumeration;
import java.util.Vector;

import com.unvired.jco.Table;
import com.unvired.jco.meta.DataElementMeta;
import com.unvired.jco.meta.FieldMeta;
import com.unvired.jco.meta.TableMeta;
import com.unvired.sample.sap.gen.sapproxy.record.MEREP_ADDRESS;

public class MEREP_ADDRESS_List extends Table
{
	private static final long serialVersionUID = 1L;
	public static TableMeta METADATA;

	static
	{
		METADATA = new TableMeta("MEREP_ADDRESS","");
		METADATA.setProxyClass("com.unvired.sample.sap.gen.sapproxy.table.MEREP_ADDRESS_List");
		METADATA.setProxyRecClass("com.unvired.sample.sap.gen.sapproxy.record.MEREP_ADDRESS");
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

	public TableMeta getMetaData()
	{
		return METADATA;
	}

	public MEREP_ADDRESS_List()
	{
		super(METADATA.getName(), METADATA.getDescription());
	}

	public void addRecord(MEREP_ADDRESS record)
	{
		super.addRecord(record);
	}

	public Enumeration getRecordList()
	{
		Object val = value;
		return ((Vector) val).elements();
	}

}