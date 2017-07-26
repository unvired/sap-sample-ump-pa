//	Generated using Unvired Modeller - Build R-4.000.0094
package com.unvired.sample.sap.gen.pa;

import com.unvired.lib.utility.InfoMessage;
import com.unvired.sample.sap.gen.be.PERSON;
import com.unvired.sample.sap.gen.sapproxy.function.MEREP_CONTACT_GETDETAIL;
import com.unvired.sample.sap.gen.sapproxy.record.BAPIRET2;
import com.unvired.sample.sap.gen.sapproxy.record.MEREP_E_MAIL;
import com.unvired.sample.sap.gen.utils.BEUtility;
import com.unvired.ump.agent.IBusinessProcess;
import com.unvired.ump.agent.IBusinessProcess.RequestType;
import com.unvired.ump.agent.ISAPRFCRequest;
import com.unvired.ump.agent.ISAPRFCResponse;
import com.unvired.ump.agent.IUMPResponse;

public abstract class ABSTRACT_GET_PERSON extends AppService {
	protected com.unvired.sample.sap.gen.be.PERSON inputPERSON;
	protected MEREP_CONTACT_GETDETAIL merep_contact_getdetail;

	public void init(IBusinessProcess process) {
		super.init(process);

		inputPERSON = BEUtility.getPERSON(process.getBusinessEntityInput()).get(0);

	}

	protected void executeMEREP_CONTACT_GETDETAIL() {
		//	Map input to interface 
		mapInputToMEREP_CONTACT_GETDETAIL();

		//	Execute call to interface 
		IUMPResponse response = callMEREP_CONTACT_GETDETAIL();

		//	Extract Result
		mapOutputFromMEREP_CONTACT_GETDETAIL(response);

	}

	protected void mapInputToMEREP_CONTACT_GETDETAIL() {
		merep_contact_getdetail = new MEREP_CONTACT_GETDETAIL();
		//	PERSON
		mapInputToMEREP_CONTACT_GETDETAIL_INPUT();

	}

	protected void mapInputToMEREP_CONTACT_GETDETAIL_INPUT() {
		//	Process Input
		if (inputPERSON == null) {
			return;
		}

		merep_contact_getdetail.setPERSNUMBER(inputPERSON.getPERSON_HEADER().getPERSNUMBER());

	}

	protected IUMPResponse callMEREP_CONTACT_GETDETAIL() {
		ISAPRFCRequest rfcRequest = (ISAPRFCRequest) process.createRequest(RequestType.RFC);
		rfcRequest.setFunction(merep_contact_getdetail);
		ISAPRFCResponse rfcResponse = (ISAPRFCResponse) process.getService().submitRequest(rfcRequest,
				Constant.MEREP_CONTACT_GETDETAIL);
		return rfcResponse;
	}

	protected void mapOutputFromMEREP_CONTACT_GETDETAIL(IUMPResponse response) {
		if (response.isSuccess()) {
			//PERSON
			mapOutputFromPERSON();

			BAPIRET2 bapiReturn = merep_contact_getdetail.getRETURN();
			if (bapiReturn != null) {
				InfoMessage infoMessage;
				String type = bapiReturn.getTYPE();

				if ("A".equalsIgnoreCase(type) || "X".equalsIgnoreCase(type) || "E".equalsIgnoreCase(type)) {
					infoMessage = new InfoMessage(bapiReturn.getMESSAGE(), InfoMessage.InfoMessageType.APPLICATION,
							InfoMessage.InfoMessageCategory.FAILURE);
				} else {
					infoMessage = new InfoMessage(bapiReturn.getMESSAGE(), InfoMessage.InfoMessageType.APPLICATION,
							InfoMessage.InfoMessageCategory.SUCCESS);
				}

				infoMessages.add(infoMessage);
			}
		}
		infoMessages.addAll(response.getInfoMessages());

	}

	protected void mapOutputFromPERSON() {
		//	Initialize
		PERSON bePERSON = null;
		PERSON.PERSON_HEADER recPERSON_HEADER = null;
		bePERSON = new PERSON();
		recPERSON_HEADER = bePERSON.getPERSON_HEADER();
		recPERSON_HEADER.setMANDT(merep_contact_getdetail.getPERSON().getMANDT());
		recPERSON_HEADER.setPERSNUMBER(merep_contact_getdetail.getPERSON().getPERSNUMBER());
		recPERSON_HEADER.setFIRST_NAME(merep_contact_getdetail.getPERSON().getFIRST_NAME());
		recPERSON_HEADER.setLAST_NAME(merep_contact_getdetail.getPERSON().getLAST_NAME());
		recPERSON_HEADER.setPROFESSION(merep_contact_getdetail.getPERSON().getPROFESSION());
		recPERSON_HEADER.setSEX(merep_contact_getdetail.getPERSON().getSEX());
		recPERSON_HEADER.setBIRTHDAY(merep_contact_getdetail.getPERSON().getBIRTHDAY());
		recPERSON_HEADER.setWEIGHT(merep_contact_getdetail.getPERSON().getWEIGHT());
		recPERSON_HEADER.setHEIGHT(merep_contact_getdetail.getPERSON().getHEIGHT());
		recPERSON_HEADER.setCATEGORY1(merep_contact_getdetail.getPERSON().getCATEGORY1());
		recPERSON_HEADER.setCATEGORY2(merep_contact_getdetail.getPERSON().getCATEGORY2());
		recPERSON_HEADER.setCREDAT(merep_contact_getdetail.getPERSON().getCREDAT());
		recPERSON_HEADER.setCRENAM(merep_contact_getdetail.getPERSON().getCRENAM());
		recPERSON_HEADER.setCRETIM(merep_contact_getdetail.getPERSON().getCRETIM());
		recPERSON_HEADER.setCHGDAT(merep_contact_getdetail.getPERSON().getCHGDAT());
		recPERSON_HEADER.setCHGNAM(merep_contact_getdetail.getPERSON().getCHGNAM());
		recPERSON_HEADER.setCHGTIM(merep_contact_getdetail.getPERSON().getCHGTIM());
		mapOutputFromE_MAIL(bePERSON);
		beList.add(bePERSON);
	}

	protected void mapOutputFromE_MAIL(PERSON be) {
		//	E_MAIL
		if (merep_contact_getdetail.getE_MAIL() != null
				&& merep_contact_getdetail.getE_MAIL().getRecordsList() != null) {
			for (com.unvired.jco.Structure itemStructure : merep_contact_getdetail.getE_MAIL().getRecordsList()) {
				MEREP_E_MAIL e_mail_s = (MEREP_E_MAIL) itemStructure;
				PERSON.E_MAIL recE_MAIL = new PERSON.E_MAIL();
				if (!(e_mail_s.getMANDT() != null && !e_mail_s.getMANDT().toString().equals("")
						&& be.getPERSON_HEADER().getMANDT().equals(e_mail_s.getMANDT())
						&& e_mail_s.getPERSNUMBER() != null && !e_mail_s.getPERSNUMBER().toString().equals("")
						&& be.getPERSON_HEADER().getPERSNUMBER().equals(e_mail_s.getPERSNUMBER())
						&& e_mail_s.getSEQNO_E_MAIL() != null && !e_mail_s.getSEQNO_E_MAIL().toString().equals("")))
					continue;
				recE_MAIL.setMANDT(e_mail_s.getMANDT());
				recE_MAIL.setPERSNUMBER(e_mail_s.getPERSNUMBER());
				recE_MAIL.setSEQNO_E_MAIL(e_mail_s.getSEQNO_E_MAIL());
				recE_MAIL.setE_ADDR(e_mail_s.getE_ADDR());
				recE_MAIL.setE_ADDR_TEXT(e_mail_s.getE_ADDR_TEXT());
				be.addItems(recE_MAIL);
			}
		}
	}

}
