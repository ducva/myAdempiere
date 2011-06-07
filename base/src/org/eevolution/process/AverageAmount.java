/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * Copyright (C) 2003-2008 e-Evolution,SC. All Rights Reserved.               *
 * Contributor(s): Victor Perez www.e-evolution.com                           *
 *****************************************************************************/
package org.eevolution.process;

import javax.swing.JOptionPane;
import org.compiere.process.SvrProcess;
import org.eevolution.model.MMyClass;
 

public class AverageAmount extends SvrProcess
{
	
	protected void prepare()
	{
		
	}	//	prepare

	/**
	 *  Perform process.
	 *  @return Message (translated text)
	 *  @throws Exception if not successful
	 */
	protected String doIt() throws Exception
	{
		int record_id = getRecord_ID();
		MMyClass myClass = new MMyClass(getCtx(), record_id, get_TrxName());
		
		JOptionPane.showMessageDialog(null, "Báolo:" + myClass.getAverageAmount(record_id));
		return "@DONE@";
	}	//	doIt
	

	
	
}	//	ImmediateBankTransfer
