/*Bolt class. Has parent class FastenerLength and child class CarriageBolt.
 */
public class Bolt extends FastenerLength {

	private static final long serialVersionUID = 1L;
	
	// constructor for Bolt, doesn't really do anything right now but would support expansions if more 
	// child classes were added 
	public Bolt(double l, String t, String m, String f, double up, int npu) throws IllegalFastener {
		super(l, t, m, f, up, npu);
	} // end Bolt constructor

	public String toString() {
		return super.toString();
	}
} // end Bolt class
