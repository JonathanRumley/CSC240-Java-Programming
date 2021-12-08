import java.util.Scanner;

/* Jonathan Rumley
 * CSC240 - Seely
 * 06/07/21
 * M1 - Program Conversion Calculator
 * (Converting a distance in feet from the user to meters then outputting the result back to user)
 */

public class m1ProgramConversionCalculator {
	
	public static void main(String[] args) {
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("Welcome to the Java Conversion Calculator (This program will convert feet to meters)");
		
		Scanner input = new Scanner(System.in);
		System.out.println("------------------------------------------------------------------------------------\nPlease enter a distance in feet: ");
		System.out.println("--------------------------------");
		int inputFeet = input.nextInt();
		System.out.println("--------------------------------");
		double convertToMeters = inputFeet / 3.2808;
		System.out.println("The distance in feet, " + inputFeet + ", converted to meters is, " + convertToMeters);
		System.out.println("-----------------------------------------------------------------\nGoodbye and thank you for using this conversion calculator");
		System.out.println("-----------------------------------------------------------------");
		System.exit(1);
	}

}
