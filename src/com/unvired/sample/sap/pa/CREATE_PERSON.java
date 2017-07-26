//	Generated using Unvired Modeller - Build Bleeding Edge
package com.unvired.sample.sap.pa;

import com.unvired.lib.utility.InfoMessage;
import com.unvired.lib.utility.InfoMessage.InfoMessageCategory;
import com.unvired.lib.utility.InfoMessage.InfoMessageType;
import com.unvired.sample.sap.gen.pa.ABSTRACT_CREATE_PERSON;

public class CREATE_PERSON extends ABSTRACT_CREATE_PERSON {
	public void execute() {
		try {
			//	Type you code below
			executeMEREP_CONTACT_CREATE();

		} catch (Exception e) {
			infoMessages.add(new InfoMessage(e.getMessage(), InfoMessageType.APPLICATION, InfoMessageCategory.FAILURE));
		}
	}

}