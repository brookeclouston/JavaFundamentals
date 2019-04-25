import java.util.Scanner;
/**
 * A helper class supplied for Assignment 3 of CISC124 Fall 2018.
 * @author Brooke Clouston
 * @version 1.0
 */
public class IOHelper {

	public static Scanner screen = new Scanner(System.in);
	
	/**
	 * Prints a passed in prompt and returns the next line entered in the console.
	 * @param prompt A prompt passed in to be displayed to the console.
	 * @return The next line of whatever the user inputs.
	 */
	public static String getString(String prompt) {
		String userString;
		System.out.println(prompt);
		userString = screen.nextLine();
		return userString;
	} // end getString
	
	/**
	 * Prints a passed in prompt to screen then returns the next integer from input if it is within bounds.
	 * @param bound1 Lower bound. 
	 * @param prompt A prompt to be displayed on screen.
	 * @param bound2 Upper bound.
	 * @return The integer the user entered. 
	 */
	public static int getInt(int bound1, String prompt, int bound2) {
		int userInt = 0;
		boolean validInput = false;
		Scanner screen = new Scanner(System.in);
		System.out.println(prompt);
		while (! validInput) {
			userInt = screen.nextInt();
			if ((userInt >= bound1) && (userInt <= bound2)) {
				break;
			} // end check
			System.out.println("Please enter an integer between " + bound1 + " and " + bound2);
		} // end while loop
		return userInt;
	} // end getInt
	
	/**
	 * Closes the scanner
	 */
	public static void closeScanner() { 
		screen.close();
	} // end closeScanner

} // end IOHelper
