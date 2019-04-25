/* FastenerLength class, has parent class FastenerThreaded and child classes InnerThreaded and Screw
 */
public class FastenerLength extends FastenerThreaded{

	private static final long serialVersionUID = 1L;
	private double length;

	// FastenerLength constructor, checks for legal lengths
	public FastenerLength(double l, String t, String m, String f, double up, int npu) throws IllegalFastener {
		super(t, m, f, up, npu);
		if (l == 0.5 || l == 0.75 || l == 1 || l == 1.25 || l == 1.5 || l == 1.75 || l == 2 || l == 2.25 || l == 2.5 || l == 2.75
			|| l == 3 || l == 3.25 || l == 3.5 || l == 3.75 || l == 4 || l == 4.25 || l == 5 || l == 5.25 || l == 5.5 || l == 5.75 
			|| l == 6 || l == 6.5 || l == 7 || l == 7.5 || l == 8 || l == 8.5 || l == 9 || l == 9.5 || l == 10 || l == 10.5
			|| l == 11 || l == 12 || l == 13 || l == 14 || l == 15 || l == 16 || l == 17 || l == 18 || l == 19 || l == 20) {
			length = l;
		} else {
			throw new IllegalFastener("Illegal length: " + l);
		}
	} // end FastenerLength

	// sets length attribute
	public void setLength(double length) {
		this.length = length;
	} // end setLength
	
	// toString method
	@Override
	public String toString() {
		return (length + " length, " + super.toString());
	}// end toString
	
} // end FastenerLength 
