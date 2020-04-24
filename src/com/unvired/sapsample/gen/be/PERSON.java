//	Generated using Unvired Modeller - Build R-4.000.0120
package com.unvired.sapsample.gen.be;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import com.unvired.lib.utility.BusinessEntity;
import com.unvired.lib.utility.Structure;

public class PERSON extends BusinessEntity {

	private static final long serialVersionUID = 1L;
	public static final String NAME = "PERSON";
	public PERSON()
	{
		setName(NAME);
		setHeader(new PERSON_HEADER());
	}

	public PERSON_HEADER getPERSON_HEADER()
	{
		return (PERSON_HEADER)super.getHeader();
	}

	public List<E_MAIL> getE_MAIL()
	{
		ArrayList<E_MAIL> items = new ArrayList<E_MAIL>();
		for (Structure item : getItems()) {
			if(item.getName().equals(E_MAIL.NAME))
				items.add((E_MAIL)item);
		}
		return items;
	}

	public void addE_MAIL(E_MAIL item)
	{
		super.addItems(item);
	}

	public static class PERSON_HEADER extends Structure
	{
		private static final long serialVersionUID = 1L;
		public static final String NAME = "PERSON_HEADER";

		public static final String FLD_MANDT = "MANDT";
		public static final String FLD_PERSNUMBER = "PERSNUMBER";
		public static final String FLD_FIRST_NAME = "FIRST_NAME";
		public static final String FLD_LAST_NAME = "LAST_NAME";
		public static final String FLD_PROFESSION = "PROFESSION";
		public static final String FLD_SEX = "SEX";
		public static final String FLD_BIRTHDAY = "BIRTHDAY";
		public static final String FLD_WEIGHT = "WEIGHT";
		public static final String FLD_HEIGHT = "HEIGHT";
		public static final String FLD_CATEGORY1 = "CATEGORY1";
		public static final String FLD_CATEGORY2 = "CATEGORY2";
		public static final String FLD_CREDAT = "CREDAT";
		public static final String FLD_CRENAM = "CRENAM";
		public static final String FLD_CRETIM = "CRETIM";
		public static final String FLD_CHGDAT = "CHGDAT";
		public static final String FLD_CHGNAM = "CHGNAM";
		public static final String FLD_CHGTIM = "CHGTIM";

		public static final ArrayList<String> FIELDS = new ArrayList<String>();

		static {
			FIELDS.add(FLD_MANDT);
			FIELDS.add(FLD_PERSNUMBER);
			FIELDS.add(FLD_FIRST_NAME);
			FIELDS.add(FLD_LAST_NAME);
			FIELDS.add(FLD_PROFESSION);
			FIELDS.add(FLD_SEX);
			FIELDS.add(FLD_BIRTHDAY);
			FIELDS.add(FLD_WEIGHT);
			FIELDS.add(FLD_HEIGHT);
			FIELDS.add(FLD_CATEGORY1);
			FIELDS.add(FLD_CATEGORY2);
			FIELDS.add(FLD_CREDAT);
			FIELDS.add(FLD_CRENAM);
			FIELDS.add(FLD_CRETIM);
			FIELDS.add(FLD_CHGDAT);
			FIELDS.add(FLD_CHGNAM);
			FIELDS.add(FLD_CHGTIM);
		}

		public PERSON_HEADER()
		{
			setName(NAME);
		}

		public String getMANDT()
		{
			return getField(FLD_MANDT);
		}

		public void setMANDT(String value)
		{
			if(value != null)
				addField(FLD_MANDT, value);
		}

		public Long getPERSNUMBER()
		{
			Long lng = null;
			try
			{
				lng = Long.valueOf(getField(FLD_PERSNUMBER));
			}
			catch(Exception ex)
			{}
			return lng;
		}

		public void setPERSNUMBER(Long value)
		{
			if(value != null)
				addField(FLD_PERSNUMBER, value.toString());
		}

		public String getFIRST_NAME()
		{
			return getField(FLD_FIRST_NAME);
		}

		public void setFIRST_NAME(String value)
		{
			if(value != null)
				addField(FLD_FIRST_NAME, value);
		}

		public String getLAST_NAME()
		{
			return getField(FLD_LAST_NAME);
		}

		public void setLAST_NAME(String value)
		{
			if(value != null)
				addField(FLD_LAST_NAME, value);
		}

		public String getPROFESSION()
		{
			return getField(FLD_PROFESSION);
		}

		public void setPROFESSION(String value)
		{
			if(value != null)
				addField(FLD_PROFESSION, value);
		}

		public String getSEX()
		{
			return getField(FLD_SEX);
		}

		public void setSEX(String value)
		{
			if(value != null)
				addField(FLD_SEX, value);
		}

		public Date getBIRTHDAY()
		{
			Date date = null;
			try
			{
				date = Date.valueOf(getField(FLD_BIRTHDAY));
			}
			catch(Exception ex)
			{}
			return date;
		}

		public void setBIRTHDAY(Date value)
		{
			if(value != null)
				addField(FLD_BIRTHDAY, value.toString());
		}

		public BigDecimal getWEIGHT()
		{
			BigDecimal bd = null;
			try
			{
				bd = new BigDecimal(getField(FLD_WEIGHT));
			}
			catch(Exception ex)
			{}
			return bd;
		}

		public void setWEIGHT(BigDecimal value)
		{
			if(value != null)
				addField(FLD_WEIGHT, value.toPlainString());
		}

		public BigDecimal getHEIGHT()
		{
			BigDecimal bd = null;
			try
			{
				bd = new BigDecimal(getField(FLD_HEIGHT));
			}
			catch(Exception ex)
			{}
			return bd;
		}

		public void setHEIGHT(BigDecimal value)
		{
			if(value != null)
				addField(FLD_HEIGHT, value.toPlainString());
		}

		public Long getCATEGORY1()
		{
			Long lng = null;
			try
			{
				lng = Long.valueOf(getField(FLD_CATEGORY1));
			}
			catch(Exception ex)
			{}
			return lng;
		}

		public void setCATEGORY1(Long value)
		{
			if(value != null)
				addField(FLD_CATEGORY1, value.toString());
		}

		public String getCATEGORY2()
		{
			return getField(FLD_CATEGORY2);
		}

		public void setCATEGORY2(String value)
		{
			if(value != null)
				addField(FLD_CATEGORY2, value);
		}

		public Date getCREDAT()
		{
			Date date = null;
			try
			{
				date = Date.valueOf(getField(FLD_CREDAT));
			}
			catch(Exception ex)
			{}
			return date;
		}

		public void setCREDAT(Date value)
		{
			if(value != null)
				addField(FLD_CREDAT, value.toString());
		}

		public String getCRENAM()
		{
			return getField(FLD_CRENAM);
		}

		public void setCRENAM(String value)
		{
			if(value != null)
				addField(FLD_CRENAM, value);
		}

		public Time getCRETIM()
		{
			Time time = null;
			try
			{
				time = Time.valueOf(getField(FLD_CRETIM));
			}
			catch(Exception ex)
			{}
			return time;
		}

		public void setCRETIM(Time value)
		{
			if(value != null)
				addField(FLD_CRETIM, value.toString());
		}

		public Date getCHGDAT()
		{
			Date date = null;
			try
			{
				date = Date.valueOf(getField(FLD_CHGDAT));
			}
			catch(Exception ex)
			{}
			return date;
		}

		public void setCHGDAT(Date value)
		{
			if(value != null)
				addField(FLD_CHGDAT, value.toString());
		}

		public String getCHGNAM()
		{
			return getField(FLD_CHGNAM);
		}

		public void setCHGNAM(String value)
		{
			if(value != null)
				addField(FLD_CHGNAM, value);
		}

		public Time getCHGTIM()
		{
			Time time = null;
			try
			{
				time = Time.valueOf(getField(FLD_CHGTIM));
			}
			catch(Exception ex)
			{}
			return time;
		}

		public void setCHGTIM(Time value)
		{
			if(value != null)
				addField(FLD_CHGTIM, value.toString());
		}

	}
	public static class E_MAIL extends Structure
	{
		private static final long serialVersionUID = 1L;
		public static final String NAME = "E_MAIL";

		public static final String FLD_MANDT = "MANDT";
		public static final String FLD_PERSNUMBER = "PERSNUMBER";
		public static final String FLD_SEQNO_E_MAIL = "SEQNO_E_MAIL";
		public static final String FLD_E_ADDR = "E_ADDR";
		public static final String FLD_E_ADDR_TEXT = "E_ADDR_TEXT";

		public static final ArrayList<String> FIELDS = new ArrayList<String>();

		static {
			FIELDS.add(FLD_MANDT);
			FIELDS.add(FLD_PERSNUMBER);
			FIELDS.add(FLD_SEQNO_E_MAIL);
			FIELDS.add(FLD_E_ADDR);
			FIELDS.add(FLD_E_ADDR_TEXT);
		}

		public E_MAIL()
		{
			setName(NAME);
		}

		public String getMANDT()
		{
			return getField(FLD_MANDT);
		}

		public void setMANDT(String value)
		{
			if(value != null)
				addField(FLD_MANDT, value);
		}

		public Long getPERSNUMBER()
		{
			Long lng = null;
			try
			{
				lng = Long.valueOf(getField(FLD_PERSNUMBER));
			}
			catch(Exception ex)
			{}
			return lng;
		}

		public void setPERSNUMBER(Long value)
		{
			if(value != null)
				addField(FLD_PERSNUMBER, value.toString());
		}

		public Long getSEQNO_E_MAIL()
		{
			Long lng = null;
			try
			{
				lng = Long.valueOf(getField(FLD_SEQNO_E_MAIL));
			}
			catch(Exception ex)
			{}
			return lng;
		}

		public void setSEQNO_E_MAIL(Long value)
		{
			if(value != null)
				addField(FLD_SEQNO_E_MAIL, value.toString());
		}

		public String getE_ADDR()
		{
			return getField(FLD_E_ADDR);
		}

		public void setE_ADDR(String value)
		{
			if(value != null)
				addField(FLD_E_ADDR, value);
		}

		public String getE_ADDR_TEXT()
		{
			return getField(FLD_E_ADDR_TEXT);
		}

		public void setE_ADDR_TEXT(String value)
		{
			if(value != null)
				addField(FLD_E_ADDR_TEXT, value);
		}

	}
}