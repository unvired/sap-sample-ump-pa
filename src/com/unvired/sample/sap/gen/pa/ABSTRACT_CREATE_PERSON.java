//	Generated using Unvired Modeller - Build R-4.000.0094
package com.unvired.sample.sap.gen.pa;

import java.util.List;

import com.unvired.lib.utility.InfoMessage;
import com.unvired.sample.sap.gen.be.PERSON;
import com.unvired.sample.sap.gen.sapproxy.function.MEREP_CONTACT_CREATE;
import com.unvired.sample.sap.gen.sapproxy.record.BAPIRET2;
import com.unvired.sample.sap.gen.sapproxy.record.MEREP_E_MAIL;
import com.unvired.sample.sap.gen.sapproxy.record.MEREP_PERSON;
import com.unvired.sample.sap.gen.sapproxy.table.MEREP_E_MAIL_List;
import com.unvired.sample.sap.gen.utils.BEUtility;
import com.unvired.ump.agent.IBusinessProcess;
import com.unvired.ump.agent.IBusinessProcess.RequestType;
import com.unvired.ump.agent.ISAPRFCRequest;
import com.unvired.ump.agent.ISAPRFCResponse;
import com.unvired.ump.agent.IUMPResponse;

public abstract class ABSTRACT_CREATE_PERSON extends AppService {
	protected com.unvired.sample.sap.gen.be.PERSON inputPERSON;
	protected MEREP_CONTACT_CREATE merep_contact_create;

	public void init(IBusinessProcess process) {
		super.init(process);

		inputPERSON = BEUtility.getPERSON(process.getBusinessEntityInput()).get(0);

	}

	protected void executeMEREP_CONTACT_CREATE() {
		//	Map input to interface 
		mapInputToMEREP_CONTACT_CREATE();

		//	Execute call to interface 
		IUMPResponse response = callMEREP_CONTACT_CREATE();

		//	Extract Result
		mapOutputFromMEREP_CONTACT_CREATE(response);

	}

	protected void mapInputToMEREP_CONTACT_CREATE() {
		merep_contact_create = new MEREP_CONTACT_CREATE();
		//	PERSON
		mapInputToPERSON();

	}

	protected void mapInputToPERSON() {
		MEREP_PERSON person_s = new MEREP_PERSON();
		merep_contact_create.setPERSON(person_s);
		MEREP_E_MAIL e_mail_s = null;
		MEREP_E_MAIL_List e_mail_list = new MEREP_E_MAIL_List();
		merep_contact_create.setE_MAIL(e_mail_list);

		//	Process Input
		if (inputPERSON == null) {
			return;
		}

		person_s = new MEREP_PERSON();
		person_s.setMANDT(inputPERSON.getPERSON_HEADER().getMANDT());
		person_s.setPERSNUMBER(inputPERSON.getPERSON_HEADER().getPERSNUMBER());
		person_s.setFIRST_NAME(inputPERSON.getPERSON_HEADER().getFIRST_NAME());
		person_s.setLAST_NAME(inputPERSON.getPERSON_HEADER().getLAST_NAME());
		person_s.setPROFESSION(inputPERSON.getPERSON_HEADER().getPROFESSION());
		person_s.setSEX(inputPERSON.getPERSON_HEADER().getSEX());
		person_s.setBIRTHDAY(inputPERSON.getPERSON_HEADER().getBIRTHDAY());
		person_s.setWEIGHT(inputPERSON.getPERSON_HEADER().getWEIGHT());
		person_s.setHEIGHT(inputPERSON.getPERSON_HEADER().getHEIGHT());
		person_s.setCATEGORY1(inputPERSON.getPERSON_HEADER().getCATEGORY1());
		person_s.setCATEGORY2(inputPERSON.getPERSON_HEADER().getCATEGORY2());
		person_s.setCREDAT(inputPERSON.getPERSON_HEADER().getCREDAT());
		person_s.setCRENAM(inputPERSON.getPERSON_HEADER().getCRENAM());
		person_s.setCRETIM(inputPERSON.getPERSON_HEADER().getCRETIM());
		person_s.setCHGDAT(inputPERSON.getPERSON_HEADER().getCHGDAT());
		person_s.setCHGNAM(inputPERSON.getPERSON_HEADER().getCHGNAM());
		person_s.setCHGTIM(inputPERSON.getPERSON_HEADER().getCHGTIM());
		merep_contact_create.setPERSON(person_s);
		mapInputToE_MAIL(inputPERSON, e_mail_list);
	}

	protected void mapInputToE_MAIL(PERSON be, MEREP_E_MAIL_List e_mail_list) {
		//	E_MAIL
		List<PERSON.E_MAIL> bee_mail_list = be.getE_MAIL();

		if (bee_mail_list == null) {
			return;
		}

		for (PERSON.E_MAIL bee_mail_s : bee_mail_list) {
			MEREP_E_MAIL e_mail_s = new MEREP_E_MAIL();
			e_mail_s.setMANDT(bee_mail_s.getMANDT());
			e_mail_s.setPERSNUMBER(bee_mail_s.getPERSNUMBER());
			e_mail_s.setSEQNO_E_MAIL(bee_mail_s.getSEQNO_E_MAIL());
			e_mail_s.setE_ADDR(bee_mail_s.getE_ADDR());
			e_mail_s.setE_ADDR_TEXT(bee_mail_s.getE_ADDR_TEXT());
			e_mail_list.addRecord(e_mail_s);
		}
	}

	protected IUMPResponse callMEREP_CONTACT_CREATE() {
		ISAPRFCRequest rfcRequest = (ISAPRFCRequest) process.createRequest(RequestType.RFC);
		rfcRequest.setFunction(merep_contact_create);
		ISAPRFCResponse rfcResponse = (ISAPRFCResponse) process.getService().submitRequest(rfcRequest,
				Constant.MEREP_CONTACT_CREATE);
		return rfcResponse;
	}

	protected void mapOutputFromMEREP_CONTACT_CREATE(IUMPResponse response) {
		if (response.isSuccess()) {
			BAPIRET2 bapiReturn = merep_contact_create.getRETURN();
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

}
