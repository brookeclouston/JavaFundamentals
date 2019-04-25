/* WingNut class, parent class InnerThreaded, no child classes
 */
public class WingNut extends InnerThreaded{

	private static final long serialVersionUID = 1L;

	// constructor class for WingNut, sends parameters to parent class(es)
	public WingNut(String t, String m, String f, double up, int npu) throws IllegalFastener {
		super(t, m, f, up, npu);
	}// end WingNut constructor
	
	// toString method for console output
	@Override
	public String toString() {
		return ("Wing Nut " + super.toString());
	} // end toString
	
} // end WingNut class
