package com.unvired.sample.sap.gen.pa;

import java.util.Vector;

import com.unvired.lib.utility.BusinessEntity;
import com.unvired.lib.utility.InfoMessage;
import com.unvired.lib.utility.InfoMessage.InfoMessageCategory;
import com.unvired.ump.agent.IBusinessProcess;
import com.unvired.ump.agent.IBusinessProcess.RequestType;
import com.unvired.ump.agent.IProcessAgent;
import com.unvired.ump.agent.ISAPRFCRequest;
import com.unvired.ump.agent.ISAPRFCResponse;
import com.unvired.ump.agent.InvalidOutput;

public abstract class AppService implements IProcessAgent {
	protected Vector<InfoMessage> infoMessages;
	protected Vector<String> bizEntMeta;
	protected Vector<BusinessEntity> beList;

	public IBusinessProcess process;

	public void init(IBusinessProcess process) {
		this.process = process;
		infoMessages = new Vector<InfoMessage>();
		bizEntMeta = new Vector<String>();
		beList = new Vector<BusinessEntity>();
	}

	public void finish() {
		try {
			process.setOutput(beList, null);
			process.getInfoMessageList().addAll(infoMessages);
		} catch (InvalidOutput e) {
			process.getInfoMessageList().add(new InfoMessage(e.getMessage(), InfoMessageCategory.FAILURE));
		}
	}

	public boolean startSession(String functionName) {
		boolean success = false;

		ISAPRFCRequest rfcRequest = (ISAPRFCRequest) process.createRequest(RequestType.RFC);
		rfcRequest.setOperation(ISAPRFCRequest.Operation.BeginSession);
		ISAPRFCResponse rfcResponse = (ISAPRFCResponse) process.getService().submitRequest(rfcRequest, functionName);
		if (!rfcResponse.isSuccess())
			process.getInfoMessageList().addAll(rfcResponse.getInfoMessages());
		else
			success = true;

		return success;
	}

	public boolean endSession(String functionName) {
		boolean success = false;

		ISAPRFCRequest rfcRequest = (ISAPRFCRequest) process.createRequest(RequestType.RFC);
		rfcRequest.setOperation(ISAPRFCRequest.Operation.EndSession);
		ISAPRFCResponse rfcResponse = (ISAPRFCResponse) process.getService().submitRequest(rfcRequest, functionName);
		if (!rfcResponse.isSuccess())
			process.getInfoMessageList().addAll(rfcResponse.getInfoMessages());
		else
			success = true;

		return success;
	}

}
