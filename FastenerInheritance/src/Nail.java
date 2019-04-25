/* Nail class, has parent class Fastener and child class WoodNail.
 */
public class Nail extends Fastener {

	private static final long serialVersionUID = 1L;
	private String finish;
	private String size;
	private double length;
	private double gauge;

	// constructor class for Nail, checks for legal finish values
	public Nail(String s, double l, double g, String f, double up, int npu) throws IllegalFastener {
		super(up, npu);
		if (f.equalsIgnoreCase("chrome") || f.equalsIgnoreCase("hot dipped galvanized") || f.equalsIgnoreCase("plain")
			|| f.equalsIgnoreCase("yellow zinc") || f.equalsIgnoreCase("zinc")) {
			finish = f;
		}
		size = s;
		length = l;
		gauge = g;
	} // end Nail constructor 

	// sets finish attribute
	public void setFinish(String finish) {
		this.finish = finish;
	}// end setFinish
	
	// sets size attribute
	public void setSize( String size) {
		this.size = size;
	} // end setSize
	
	// sets length attribute
	public void setLength( double length) {
		this.length = length;
	} // end setLength

	// sets gauge attribute
	public void setGauge( double gauge) {
		this.gauge = gauge;
	} // end setGauge
	
	// toString method
	@Override
	public String toString() {
		return (size + " size, " + length + "\" long, " + gauge + " gauge, Steel, with a "
				+ finish + " finish. " + super.toString());
	}// end toString
	
} // end Nail class
