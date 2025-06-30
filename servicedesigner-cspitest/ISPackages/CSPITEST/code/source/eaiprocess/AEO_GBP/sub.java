package eaiprocess.AEO_GBP;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class sub

{
	// ---( internal utility methods )---

	final static sub _instance = new sub();

	static sub _newInstance() { return new sub(); }

	static sub _cast(Object o) { return (sub)o; }

	// ---( server methods )---




	public static final void java_remainder (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(java_remainder)>> ---
		// @sigtype java 3.5
		// [i] field:0:required Divident
		// [i] field:0:required Divisor
		// [o] field:0:required Quotient
		// [o] field:0:required Remainder
		IDataCursor cursor = pipeline.getCursor();
		try {
		    // \uC785\uB825\uAC12 \uCD94\uCD9C
		    String dividentStr = IDataUtil.getString(cursor, "Divident");
		    String divisorStr = IDataUtil.getString(cursor, "Divisor");
		
		    if (dividentStr == null || divisorStr == null) {
		        throw new ServiceException("Missing input: Divident or Divisor is null.");
		    }
		
		    int divident = Integer.parseInt(dividentStr.trim());
		    int divisor = Integer.parseInt(divisorStr.trim());
		
		    if (divisor == 0) {
		        throw new ServiceException("Division by zero is not allowed.");
		    }
		
		    // \uBAAB\uACFC \uB098\uBA38\uC9C0 \uACC4\uC0B0
		    int quotient = divident / divisor;
		    int remainder = divident % divisor;
		
		    // \uACB0\uACFC \uC800\uC7A5
		    IDataUtil.putInt(cursor, "Quotient", quotient);
		    IDataUtil.putInt(cursor, "Remainder", remainder);
		
		} catch (NumberFormatException e) {
		    throw new ServiceException("Invalid number format for Divident or Divisor.");
		} finally {
		    cursor.destroy();
		}
			
		// --- <<IS-END>> ---

                
	}
}

