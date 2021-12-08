import java.util.Scanner;

/* Jonathan Rumley
 * CSC240 - Seely
 * 06/15/21
 * M2 - Program Divison Quiz
 * (Receive two numbers from the user, divide smaller number from the larger,
 *  allow user to guess answer after displaying divison equation, checks answser)
 */

public class m2ProgramDivisonQuiz {
	
	public static void main(String[] args) {
		int randomLargeNumber = (int)(Math.random() * 100 + 1);
		int randomSmallNumber = (int)(Math.random() * 25 + 1);
		int result = randomLargeNumber / randomSmallNumber;
		
		System.out.println("\t\t\tWelcome to the Divison Quiz Program\n"
				+ "\t\t\t-----------------------------------"
				+ "\n\tThe purpose is to have the user guess the result of a randomly generated divison problem\n"
				+ "\t----------------------------------------------------------------------------------------"
				+ "\n\t\t(Example): Round to nearest decimal, 9.4 to 9 or 9.6 to 10"
				+ "\n\t\t----------------------------------------------------------");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("\n\tPlease guess the correct result of this random divison equation: " + randomLargeNumber + " / " + randomSmallNumber + ": ");
		
		int userAnswer = input.nextInt();
		
		if (userAnswer == result) {
			System.out.println("\nCorrect answer! Great job on completing the Random Divison Quiz successsfully, goodbye!");
		}
		else if (userAnswer != result) {
			System.out.println("\nSorry, that is the incorrect answer, you have unsuccessfully completed the Random Divison Quiz. Please, try again.");
		}
		
		System.exit(0);
	}

}
