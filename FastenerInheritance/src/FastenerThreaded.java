/* FastenerThreaded class, has parent class Fastener and child classes FastenerLength and InnerThreaded 
 */
public class FastenerThreaded extends Fastener {
	
	private static final long serialVersionUID = 1L;
	private String thread;
	private String material;
	private String finish;
	
	// FastenerThreaded constructor, checks for legal thread, material and finish values
	public FastenerThreaded(String t, String m, String f, double up, int npu) throws IllegalFastener {
		super(up, npu);
		if (t.equals("#8-13") || t.equals("#8-15") || t.equals("#8-32") || t.equals("#10-13") || t.equals("#10-24")
		|| t.equals("#10-32") || t.equals("1/4-20") || t.equals("5/16-18") || t.equals("3/8-16") || 
		t.equals("7/16-14") || t.equals("1/2-13") || t.equals("5/8-11") || t.equals("3/4-10")) {
			thread = t;
		} else {
			throw new IllegalFastener("Illeagal thread value: " + t);
		} 
		if (m.equalsIgnoreCase("stainless steel") || m.equalsIgnoreCase("brass")) {
			if (f.equalsIgnoreCase("plain")) {
				material = m;
				finish = f;
			} else {
				throw new IllegalFastener("Illegal finish: " + finish);
			}
		} else if (m.equalsIgnoreCase("steel")) {
			if (f.equalsIgnoreCase("chrome") || f.equalsIgnoreCase("hot dipped galvanized") || 
				f.equalsIgnoreCase("plain") || f.equalsIgnoreCase("yellow zinc") || f.equalsIgnoreCase("zinc")
				|| f.equalsIgnoreCase("black phosphate") || f.equalsIgnoreCase("acq 1000 hour") 
				|| f.equalsIgnoreCase("lubricated")) {
				material = m;
				finish = f;
			} else {
				throw new IllegalFastener("Illegal finish: " + finish);
			}
		} else {
			throw new IllegalFastener("Illegal material: " + material);
		}
	} // end FastenerThreaded constructor
	
	// sets thread attribute
	public void setThread(String thread) {
		this.thread = thread;
	} // end setThread
	
	// sets material attribute
	public void setMaterial(String material) {
		this.material = material;
	} // end setMaterial
	
	// sets finish attribute
	public void setFinish(String finish) {
		this.finish = finish;
	} // end setFinish
	
	// toString method
	@Override
	public String toString() {
		return  (thread + " thread, " + material + ", with a " + finish + 
				" finish. " + super.toString());
	}// end toString

} // end FastenerThreaded
