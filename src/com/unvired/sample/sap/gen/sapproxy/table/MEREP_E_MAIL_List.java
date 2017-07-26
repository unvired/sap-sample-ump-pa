//	Generated using Unvired Modeller - Build R-4.000.0094
package com.unvired.sample.sap.gen.sapproxy.table;

import java.util.Enumeration;
import java.util.Vector;

import com.unvired.jco.Table;
import com.unvired.jco.meta.DataElementMeta;
import com.unvired.jco.meta.FieldMeta;
import com.unvired.jco.meta.TableMeta;
import com.unvired.sample.sap.gen.sapproxy.record.MEREP_E_MAIL;

public class MEREP_E_MAIL_List extends Table
{
	private static final long serialVersionUID = 1L;
	public static TableMeta METADATA;

	static
	{
		METADATA = new TableMeta("MEREP_E_MAIL","");
		METADATA.setProxyClass("com.unvired.sample.sap.gen.sapproxy.table.MEREP_E_MAIL_List");
		METADATA.setProxyRecClass("com.unvired.sample.sap.gen.sapproxy.record.MEREP_E_MAIL");
		METADATA.addField(new FieldMeta(0,"MANDT",new DataElementMeta(0,"CHAR","Client",3,0)));
		METADATA.addField(new FieldMeta(1,"PERSNUMBER",new DataElementMeta(6,"NUM","Person Number (Sample Application)",10,0)));
		METADATA.addField(new FieldMeta(2,"SEQNO_E_MAIL",new DataElementMeta(6,"NUM","Seqeunce Number (Sample Application)",10,0)));
		METADATA.addField(new FieldMeta(3,"E_ADDR",new DataElementMeta(0,"CHAR","E-mail Address (Sample Application)",40,0)));
		METADATA.addField(new FieldMeta(4,"E_ADDR_TEXT",new DataElementMeta(0,"CHAR","E-mail Address Description (Sample Application)",40,0)));
	}

	public TableMeta getMetaData()
	{
		return METADATA;
	}

	public MEREP_E_MAIL_List()
	{
		super(METADATA.getName(), METADATA.getDescription());
	}

	public void addRecord(MEREP_E_MAIL record)
	{
		super.addRecord(record);
	}

	public Enumeration getRecordList()
	{
		Object val = value;
		return ((Vector) val).elements();
	}

}