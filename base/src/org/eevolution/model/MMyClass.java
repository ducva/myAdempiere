
package org.eevolution.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.util.DB;

public class MMyClass extends X_MyClass 
implements I_MyClass
{
	public MMyClass(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MMyClass(Properties ctx, int MyClass_ID, String trxName) {
		super(ctx, MyClass_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -5997157712614274458L;

	public BigDecimal getAverageAmount(int id) {
		String query = "SELECT AVG(Amount) " +
						" FROM mystudent as st" + 
						" INNER JOIN myclass as cl on st.myclass_id = cl.myclass_id" +
						" WHERE cl.myclass_id = ?";
		return DB.getSQLValueBDEx(null, query, id);
	}

	
}	
