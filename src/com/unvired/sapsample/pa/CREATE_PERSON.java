//	Generated using Unvired Modeller - Build R-4.000.0115
package com.unvired.sapsample.pa;

import com.unvired.lib.utility.InfoMessage;
import com.unvired.lib.utility.InfoMessage.InfoMessageCategory;
import com.unvired.lib.utility.InfoMessage.InfoMessageType;
import com.unvired.sapsample.gen.pa.ABSTRACT_CREATE_PERSON;

public class CREATE_PERSON extends ABSTRACT_CREATE_PERSON {
	public void execute() {
		try {
			//	Type you code below
			executeMEREP_CONTACT_CREATE();
			

		} catch (Exception e) {
			e.printStackTrace();
			infoMessages.add(new InfoMessage(
					"Error in UMP App function(" + this.getClass().getSimpleName() + "). Error Details: "
							+ e.getMessage() == null ? e.getClass().getName() : e.getMessage(),
					InfoMessageType.APPLICATION, InfoMessageCategory.FAILURE));

		}
	}
}