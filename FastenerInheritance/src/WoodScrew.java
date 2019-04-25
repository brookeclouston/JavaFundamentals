/* WoodScrew class, parent class Screw, no child classes
 */
public class WoodScrew extends Screw {

	private static final long serialVersionUID = 1L;
	private String point;

	// WoodScrew constructor, sends values to parent classes, checks for legal point values
	public WoodScrew(double l, String t, String m, String f, String h, String d, String p, double up, int npu)
			throws IllegalFastener {
		super(l, t, m, f, h, d, up, npu);
		if (p.equalsIgnoreCase("double cut") || p.equalsIgnoreCase("sharp") || p.equalsIgnoreCase("type 17")) {
			point = p;
		} else {
			throw new IllegalFastener("Illegal point type: " + p);
		}
	} // end WoodScrew 

	// toString method for console output
	@Override
	public String toString() {
		return ("Wood Screw, " + point + " point," + super.toString());
	}// end toString
	
} // end WoodScrew
