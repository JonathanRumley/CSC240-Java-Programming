import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


/* Jonathan Rumley
 * CSC240 - Seely
 * 07/05/21
 * M3 - Program Inventory Markup
 * (Adding the designated markup cost to products by reading in a text file and writing to a text from the hard drive)
 */
public class m3ProgramInventoryMarkup {
	
	public static void main(String[] args) throws IOException {
		
		String productName, itemCostString;
		double itemCost, itemTotal;
		final double itemMarkUp = 1.3;
	
			//Open input file
			FileReader fr = new FileReader("D:\\Rumley\\CSC240\\Module3-Data.txt");
			// Create BufferedReader Object
			BufferedReader br = new BufferedReader(fr);

			//Open outfile file
			FileWriter fw = new FileWriter("D:\\Rumley\\CSC240\\Inventory.txt");
			PrintWriter pw = new PrintWriter(fw);
			
			//Read records from file and test for EOF
			while((productName = br.readLine()) != null) {
				//productName = br.readLine();
				itemCostString = br.readLine();
				itemCost = Double.parseDouble(itemCostString);
				itemTotal = itemCost * itemMarkUp;
				pw.println("Product Name: " + productName);
				pw.println("Product Cost: " + itemCost);
				pw.println("Product Current Price: " + String.format("%.2f", itemTotal)+"\n");
				pw.flush();
			}
			System.out.println("*******Successfully Retrieved*******");
			
			br.close();
			pw.close();
			
			
			System.exit(0);
		
	
	}
	
}
