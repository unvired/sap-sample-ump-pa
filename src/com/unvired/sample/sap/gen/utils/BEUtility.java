//	Generated using Unvired Modeller - Build R-4.000.0094
package com.unvired.sample.sap.gen.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import com.unvired.lib.utility.BusinessEntity;
import com.unvired.lib.utility.Structure;
import com.unvired.sample.sap.gen.be.PERSON;

public class BEUtility
{
	public static List<PERSON> getPERSON(List<BusinessEntity> beList)
	{
		ArrayList<PERSON> typedBEs = new ArrayList<PERSON>();

		if(beList != null)
		{
			for (BusinessEntity be : beList)
			{
				if(be.getName().equals(PERSON.NAME))
				{
					PERSON typedBE = new PERSON();
					typedBEs.add(typedBE);
					for (Entry<String, String> field : be.getHeader().getFieldsInOrder().entrySet())
					{
						typedBE.getHeader().addField(field.getKey(), field.getValue());
					}

					//	Process each item individually
					for (Structure item : be.getItems())
					{
						//	Process the individual structures
						if(item.getName().equals(PERSON.E_MAIL.NAME))
						{
							PERSON.E_MAIL typedItem = new PERSON.E_MAIL();

							for (Entry<String, String> field : item.getFieldsInOrder().entrySet())
							{
								typedItem.addField(field.getKey(), field.getValue());
							}
							typedBE.addItems(typedItem);
							continue;
						}
					}
				}
			}
		}
		return typedBEs;
	}

}