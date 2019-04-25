/* CarriageBolt class, has parent class Bolt, no child classes 
 */
public class CarriageBolt extends Bolt  {

	private static final long serialVersionUID = 1L;

	// Constructor for CarriageBolt, checks for legal material and finish combinations
	public CarriageBolt(double l, String t, String m, String f, double up, int npu) throws IllegalFastener {
		super(l, t, m, f, up, npu);
		if (m.equalsIgnoreCase("steel")) {
			if (!(f.equalsIgnoreCase("chrome") || f.equalsIgnoreCase("hot dipped galvanized") || f.equalsIgnoreCase("plain")
					|| f.equalsIgnoreCase("yellow zinc") || f.equalsIgnoreCase("zinc"))) {
				throw new IllegalFastener("Illegal material and finish combination: material: " + m + "finish: " + f);
			}
		}
	} // end CarriageBolt constructor

	// toString method
	@Override
	public String toString() {
		return ("Carriage Bolt " + super.toString());
		} // end toString method

} // end CarriageBolt class
