/* Exception class for package
*/
public class IllegalFastener extends Exception {
	
	private static final long serialVersionUID = 1L;

	// Supplies a default message	
	public IllegalFastener() {
		super("Illegal parameter value supplied.");
	}

	// Passes along the message supplied to the exception class
	public IllegalFastener(String message) {
		super(message);
	}
}// end IllegalFastener


