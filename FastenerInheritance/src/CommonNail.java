/* CommonNail class, parent class Nail, no child classes
 */
public class CommonNail extends Nail{

	private static final long serialVersionUID = 1L;
	
	// Constructor for CommonNail, checks for legal length, gauge and finish values.
	public CommonNail(String s, double l, double g, String f, double up, int npu) throws IllegalFastener {
		super(s, l, g, f, up, npu);
		if (!(s.equalsIgnoreCase("6D") || s.equalsIgnoreCase("8D") || s.equalsIgnoreCase("10D") || 
			s.equalsIgnoreCase("12D") || s.equalsIgnoreCase("16D") || s.equalsIgnoreCase("60D"))) {
			throw new IllegalFastener("Illegal size: " + s);
		}
		if ( !( (l== 2) || (l == 2.5) || (l == 3) || (l == 3.25) || (l == 3.5) || (l == 6) )) {
			throw new IllegalFastener("Illegal length: " + l);
		}
		if (! ( (g == 2) || (g == 8) || (g == 9) || (g == 10.25) || (g == 11.5))) {
			throw new IllegalFastener("Illegal gauge: " + g);
		}
		if ( !(f.equalsIgnoreCase("bright") || f.equalsIgnoreCase("hot dipped") || f.equalsIgnoreCase("galvanized"))) {
			throw new IllegalFastener("Illegal finish: " + f);
		}
	} // end Constructor class
	
	// toString method
	@Override
	public String toString() {
		return ("Common Nail " + super.toString());
	} // end toString method

} // end CommonNail class
