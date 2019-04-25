/* Author: Brooke Clouston
 * Date Created: September 24 2018
 * This application stimulates a game of pig between a user and the computer
 * via console I/O. It is in response to assignment 1 for CISC124 Fall 2018. 
 */
import java.util.Random;
import java.util.Scanner;

public class Pig {

	// creates random number generator seeded via the current time in milliseconds
	static Random generator = new Random(System.currentTimeMillis());

	public static int generateDice() {
		// generates the roll of a die 
		int roll = (generator.nextInt(6) +1);
		return roll;
	} // end generateDice

	public static String displayDice (int die) {
		// returns the English word version of what is displayed by the dice
		if (die == 1) {
			return "one";
		} else if (die == 2) {
			return "two";
		} else if (die == 3) {
			return "three";
		} else if (die == 4) {
			return "four";
		} else if (die == 5) {
			return "five";
		} else {
			return "six";
		}
	} // end displayDice

	public static void displayScores (int human, int computer) {
		// displays the current scores
		System.out.println("\nCurrent Scores:");
		System.out.println("Human: " + human + " Computer: " + computer);
	} // end displayScores

	public static int interpretDice(int dice1, int dice2, int gameSum) {
		// interprets the two dice, calculates and returns the turn score, coordinates doubles
		int turnScore = 0;
		if (dice1 == dice2 ) {
			turnScore = ((dice1 + dice2) * 2);
			System.out.println("Doubles! Rolling again!");
			int doubles = rollDice(turnScore);
			if (doubles == 0) { // double sixes have been rolled
				return 0;
			} else if (doubles == turnScore) {
				return gameSum; // single six has been rolled
			}
			turnScore = turnScore + doubles; 
			return turnScore;
		} 
		turnScore = (dice1 + dice2);
		return turnScore;
	} // end interpretDice

	public static boolean humanInput() {
		// interprets human input on what to do next 
		Scanner screen = new Scanner(System.in);
		System.out.println("Enter R to roll or H to hold: ");
		String input = screen.next();
		switch (input) {
			case "R": case "r":
				return true;
			case "H": case "h":
				return false;
			default:
				return humanInput();
		}
	}// end humanInput
	
	
	public static int rollDice(int gameSum) {
		// generates two dice, checks for sixes, calls on interpret dice method
		int dice1 = generateDice();
		int dice2 = generateDice();
		System.out.println("Dice roll: " + displayDice(dice1) + " + " + displayDice(dice2));
		if ((dice1 == 6) && (dice2 == 6)) {
			System.out.println("Double sixes! The score has been set to 0");
			return 0;
			}
		if ((dice1 == 6) || (dice2 == 6)) {
			System.out.println("You rolled a six! Your turn score has been set to zero!");
			return gameSum;
		}
		return interpretDice(dice1, dice2, gameSum);
	} // end rollDice
	
	public static void gamePlay () {
		// Coordinates game play between human and computer
		int humanGameSum = 0;
		int computerGameSum = 0;
		while ((humanGameSum < 100) && (computerGameSum < 100)) {
			int humanTurnSum = 0;
			displayScores(humanGameSum, computerGameSum);
			System.out.println("\nHuman's Turn!");
			while (humanInput()) {
				int rollSum = 0 ;
				rollSum = rollDice(humanGameSum);
				if (rollSum == humanGameSum) { // a single six was rolled
					humanTurnSum = 0; 
					break;
				} else if (rollSum == 0) { // double sixes were rolled
					humanTurnSum = 0;
					humanGameSum = 0;
					break;
				}
				humanTurnSum = humanTurnSum + rollSum;
				System.out.println("Human's turn sum is: " + humanTurnSum + " and game sum would be: " + (humanGameSum + humanTurnSum));
				} // end of human's turn
			humanGameSum = humanGameSum + humanTurnSum;
			int computerTurnSum = 0;
			displayScores(humanGameSum, computerGameSum);
			System.out.println("\nComputer's Turn!");
			while (computerTurnSum <= 30) {
				int rollSum = 0;
				rollSum = rollDice(computerGameSum);
				if (rollSum == computerGameSum) { // a single six was rolled
					computerTurnSum = 0;
					break;
				} else if (rollSum == 0) { // double sixes were rolled
					computerTurnSum = 0;
					computerGameSum = 0;
					break;
				}
				computerTurnSum = computerTurnSum + rollSum;
				System.out.println("Computer's turn sum is: " + computerTurnSum + " and game sum would be: " + (computerGameSum + computerTurnSum));
				} // end of computer's turn
			computerGameSum = computerGameSum + computerTurnSum;
			}// Game is over
		System.out.println("\nFinal Scores:");
		System.out.println("Human: " + humanGameSum + " Computer: " + computerGameSum);
		} // end gamePlay
	
	public static void main(String[] args) {
		boolean playAgain = true;
		while (playAgain) {
			gamePlay();
			Scanner screen = new Scanner (System.in);
			System.out.println("Would you like to play again? Enter Y or N ");
			String input = screen.next();
			if (input.equals("N")) {
				System.out.println("Thanks for playing!");
				playAgain = false;
			} else {
				playAgain = true;
			}
		} 
	} // end main	

} // end Pig