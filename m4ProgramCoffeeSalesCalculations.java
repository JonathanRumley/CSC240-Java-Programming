import java.util.Scanner;

/* Jonathan Rumley
 * CSC240 - Seely
 * 07/12/21
 * M4 - Program Coffee Sales Calculations
 * (Class file to perfrom Program Coffee Sales calculations)
 */
public class m4ProgramCoffeeSalesCalculations {
	final double pricePerLB = 5.99;
	final double taxRate = 0.0725;
	static double bagWeight;
	static int numberOfBags;
	double totalPrice;
	double sale;
		
	public m4ProgramCoffeeSalesCalculations(int mynumberOfBags, double mybagWeight){
        numberOfBags = mynumberOfBags;
        bagWeight = mybagWeight;
    }
	
	public static void greetingsMsg() {
		
		System.out.println("Welcome to the Coffee Sales Calculator - Coffee Sale Transactions");
		System.out.println("-----------------------------------------------------------------\n");
	}
	
	public static void userInput() {
		System.out.println("Are you ready to check out? (Y or N) or (quit)");
	    System.out.println("-------------------------------");
		Scanner input = new Scanner(System.in);
		String userChoice = input.next();
		if(userChoice.equals("quit")) {
			System.exit(0);
		}
		else {
			if(!userChoice.equals("")) {
				if(userChoice.equals("N") || userChoice.equals("n") || userChoice.equals("No") || userChoice.equals("no")) {
					farewellMsg();
				}
				while(userChoice.equals("Y") || userChoice.equals("y") || userChoice.equals("Yes") || userChoice.equals("yes"))  {
					System.out.println("-------------------------------------");
					System.out.println("Please enter the number of bags used: ");
					numberOfBags = input.nextInt();
					
					System.out.println("-------------------------------------------");
					System.out.println("Please enter the bag weight(lbs) of your coffee: ");
					bagWeight = input.nextDouble();
					
					m4ProgramCoffeeSales mycoffeesales = new m4ProgramCoffeeSales(numberOfBags, bagWeight);
			        
			        java.util.Date date = new java.util.Date();
					System.out.println("\n------------------------------------------");
					System.out.println("Today's date: " + date.toString());
					System.out.println("Number of bags: " + numberOfBags);
					System.out.println("Weight per bag: " + bagWeight + " lbs");
					System.out.println("Price per pound: "+"$" + mycoffeesales.getPrice());
					System.out.println("Sales tax: " + String.format("%.4f", mycoffeesales.getTaxRate())+"%");
					System.out.println("Sales sub-total: " + String.format("$"+"%.2f", mycoffeesales.getSale()));
					System.out.println("Total tax: " + String.format("$"+"%.2f", mycoffeesales.getSalesTax()));
					System.out.println("\nTotal sale: " + String.format("$"+"%.2f", mycoffeesales.getTotalPrice()));
				break;
				}
				anotherTransaction();
			}
		}
	}
	
	double getSale() {
		sale = (bagWeight * numberOfBags) * pricePerLB;
		return sale;
	}
	
	double getSalesTax() {
		double salesTax = getTaxRate() * getSale();
		return salesTax;
	}
	
	double getTotalPrice() {
		totalPrice = getSale() + getSalesTax();
		return totalPrice;
	}
	
	double getPrice() {
		return pricePerLB;
	}
	
	double getTaxRate() {
		return taxRate;
	}
	
	public static void farewellMsg() {
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("Goodbye now, thanks for giving our coffee a taste test!! And if not, maybe next time!!");
		System.exit(0);
	}
	
	public static void anotherTransaction() {
		System.out.println("-------------------------------------------------------------");
		System.out.println("Would you like to proceed with another transaction? (Y or N): \n");
		Scanner input = new Scanner(System.in);
		String userChoice = input.next();
		if(userChoice.equals("Y") || userChoice.equals("y") || userChoice.equals("Yes") || userChoice.equals("yes")) {
			userInput();
		}
		else {
			farewellMsg();
		}
	}
}
