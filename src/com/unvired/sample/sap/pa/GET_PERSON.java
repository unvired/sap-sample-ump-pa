//	Generated using Unvired Modeller - Build Bleeding Edge
package com.unvired.sample.sap.pa;

import com.unvired.lib.utility.InfoMessage;
import com.unvired.lib.utility.InfoMessage.InfoMessageCategory;
import com.unvired.lib.utility.InfoMessage.InfoMessageType;
import com.unvired.sample.sap.gen.pa.ABSTRACT_GET_PERSON;
import com.unvired.sample.sap.gen.sapproxy.record.BAPIRET2;
import com.unvired.ump.agent.IUMPResponse;

public class GET_PERSON extends ABSTRACT_GET_PERSON {
	public void execute() {
		try {
			//	Type you code below
			executeMEREP_CONTACT_GETDETAIL();

		} catch (Exception e) {
			infoMessages.add(new InfoMessage(e.getMessage(), InfoMessageType.APPLICATION, InfoMessageCategory.FAILURE));
		}
	}
	
	protected void mapInputToMEREP_CONTACT_GETDETAIL_INPUT() {
		
		if (inputPERSON == null) {
			return;
		}

		merep_contact_getdetail.setPERSNUMBER(inputPERSON.getPERSON_HEADER().getPERSNUMBER());

	}
	
	protected void mapOutputFromMEREP_CONTACT_GETDETAIL(IUMPResponse response) {
		
		if (response.isSuccess()) {			

			BAPIRET2 bapiReturn = merep_contact_getdetail.getRETURN();
			
			if (bapiReturn != null) {
				
				InfoMessage infoMessage = null;
				String type = bapiReturn.getTYPE();

				if ("A".equalsIgnoreCase(type) || "X".equalsIgnoreCase(type) || "E".equalsIgnoreCase(type)) {
					infoMessage = new InfoMessage(bapiReturn.getMESSAGE(), InfoMessage.InfoMessageType.APPLICATION, InfoMessage.InfoMessageCategory.FAILURE);
					infoMessages.add(infoMessage);
					return;
				}				
			}
	
			mapOutputFromPERSON();
		}
		infoMessages.addAll(response.getInfoMessages());
	}
}