/*
* Conditions Of Use 
* 
* This software was developed by employees of the National Institute of
* Standards and Technology (NIST), an agency of the Federal Government.
* Pursuant to title 15 Untied States Code Section 105, works of NIST
* employees are not subject to copyright protection in the United States
* and are considered to be in the public domain.  As a result, a formal
* license is not needed to use the software.
* 
* This software is provided by NIST as a service and is expressly
* provided "AS IS."  NIST MAKES NO WARRANTY OF ANY KIND, EXPRESS, IMPLIED
* OR STATUTORY, INCLUDING, WITHOUT LIMITATION, THE IMPLIED WARRANTY OF
* MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, NON-INFRINGEMENT
* AND DATA ACCURACY.  NIST does not warrant or make any representations
* regarding the use of the software or the results thereof, including but
* not limited to the correctness, accuracy, reliability or usefulness of
* the software.
* 
* Permission to use this software is contingent upon your acceptance
* of the terms of this agreement
*  
* .
* 
*/
package android.gov.nist.gnjvx.sip.stack;

import java.util.EventListener;

/**
 * Interface implemented by classes that want to be notified of asynchronous
 * transacion events.
 *
 * @author Jeff Keyser
 * @version 1.2 $Revision: 1.6 $ $Date: 2006/07/13 09:01:03 $
 */
public interface SIPTransactionEventListener extends EventListener {

	/**
	 * Invoked when an error has ocurred with a transaction.
	 *
	 * @param transactionErrorEvent Error event.
	 */
	public void transactionErrorEvent(SIPTransactionErrorEvent transactionErrorEvent);
}
