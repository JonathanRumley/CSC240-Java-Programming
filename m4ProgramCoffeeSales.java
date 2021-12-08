import java.util.Scanner;

/* Jonathan Rumley
 * CSC240 - Seely
 * 07/12/21
 * M4 - Program Coffee Sales
 * (Determine coffee sales by using classes in seperate files that call methods within those classes)
 */
public class m4ProgramCoffeeSales extends m4ProgramCoffeeSalesCalculations {
	
	public m4ProgramCoffeeSales(int mynumberOfBags, double mybagWeight) {
		super(mynumberOfBags, mybagWeight);
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        
        boolean begin = true;
        
        System.out.println("Welcome to the Coffee Sales Calculator - Coffee Sale Transactions");
        System.out.println("-----------------------------------------------------------------\n");
		
        while(begin){
            userInput();        
        }
    }
}

	


