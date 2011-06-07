
package org.eevolution.model;

import java.sql.ResultSet;
import java.util.Properties;

public class MMyStudent extends X_MyStudent 
implements I_MyStudent
{
	public MMyStudent(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MMyStudent(Properties ctx, int MyClass_ID, String trxName) {
		super(ctx, MyClass_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -5997157712614274458L;

	
}	
