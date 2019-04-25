/* Screw class, parent class FastenerLength and has child class WoodScrew
 */
public class Screw extends FastenerLength {

	private static final long serialVersionUID = 1L;
	private String head;
	private String drive;

	// constructor method for Screw, checks for legal values for material and finish values, legal head and drive values
	public Screw(double l, String t, String m, String f, String h, String d, double up, int npu) throws IllegalFastener {
		super(l, t, m, f, up, npu);
		if (m.equalsIgnoreCase("steel")) {
			if ( !(f.equals("black phosphate") || f.equalsIgnoreCase("acq 1000 hour") || f.equalsIgnoreCase("lubricated") || 
				f.equalsIgnoreCase("chrome") || f.equalsIgnoreCase("hot dipped galvanized") || f.equalsIgnoreCase("yellow zinc") 
				|| f.equalsIgnoreCase("zinc"))) {
				throw new IllegalFastener("Illegal fastener and material combination: " + m + " and " + f);
			}
		}	
		if (h.equalsIgnoreCase("bugle") || h.equalsIgnoreCase("flat") || h.equalsIgnoreCase("oval") 
			|| h.equalsIgnoreCase("pan") || h.equalsIgnoreCase("round")) {
			head = h;
		} else {
			throw new IllegalFastener("Illegal head type: " + h);
		}
		if (d.equalsIgnoreCase("6-lobe")|| d.equalsIgnoreCase("philips") ||
			d.equalsIgnoreCase("slotted") || d.equalsIgnoreCase("square")) {
			drive = d;
		} else {
			throw new IllegalFastener("Illegal drive type: " + h);
		}	
	} // end Screw constructor
	
	// sets head attribute
	public void setHead(String head) {
		this.head = head;
	} // end setHead
	
	// sets drive attribute
	public void setDrive(String drive) {
		this.drive = drive;
	}// end setDrive
	
	// toString method
	@Override
	public String toString() {
		return (head + " head, " + drive + " drive, " + super.toString());
	} // end toString
	
} // end Screw class
