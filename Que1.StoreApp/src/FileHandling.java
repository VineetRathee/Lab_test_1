import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileHandling {
	public static void main(String[] args) {
		String itemCode;
		int quantity;
		Double unitPrice;
		List<Merchandize> ListMerchandize = new ArrayList<>();

		String line = null;
		
		try (BufferedReader Scanner = new BufferedReader(
				new FileReader(new File("C:\\Users\\ve00ym231\\Documents\\workspace-new\\Q1\\src\\InputFile.dat")))) {

			while ((line = Scanner.readLine()) != null) {
				String[] tokens = line.split(" ");
				itemCode = tokens[0];
				quantity = Integer.parseInt(tokens[1]);
				unitPrice = Double.parseDouble(tokens[2]);
				ListMerchandize.add(new Merchandize(itemCode, quantity, unitPrice));
			}

		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		// Sorting by Name (ItemCode)
		Collections.sort(ListMerchandize, (o1, o2) -> o1.getItemCode().compareTo(o2.getItemCode()));
		ListMerchandize.forEach((Item) -> System.out.println(Item));
		
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------------");
		
		//Sorting by Price
		Collections.sort(ListMerchandize, (o1, o2) -> o2.getUnitPrice().compareTo(o1.getUnitPrice()));
		ListMerchandize.forEach((Item) -> System.out.println(Item));
		

	}

}