/* InnerThreaded class, has parent class FastenerThreaded and child class WingNut
 */
public class InnerThreaded extends FastenerThreaded{

	private static final long serialVersionUID = 1L;

	// constructor for innerThreaded, doesn't do much but would support expansion if more child classes
	// were added
	public InnerThreaded(String t, String m, String f, double up, int npu) throws IllegalFastener {
		super(t, m, f, up, npu);	
	} // end InnerThreaded constructor 
	
	// toString method
	@Override
	public String toString() {
		return super.toString();
	}// end toString
	
} // end InnerThreaded class
