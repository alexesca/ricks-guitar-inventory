import enums.*;
import java.util.*;  

public class FindGuitarTester {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		GuitarSpec whatErinLikes = new GuitarSpec(Builder.PRS, "stratocastor", Type.ELECTRIC, Wood.MAHOGANY, Wood.MAPLE);

		List matchingGuitars = inventory.search(whatErinLikes);
		if(!matchingGuitars.isEmpty()) {
			System.out.println("Erin you might like this guitars:  ");
			for(Iterator i = matchingGuitars.iterator(); i.hasNext();) {
				Guitar guitar = (Guitar)i.next();
				System.out.println(" We have a " + guitar.getSpec().getBuilder() + ", " + guitar.getSpec().getModel() + " selling for $" + guitar.getPrice() + "!\n ------");
			}
		} else {
			System.out.println("Sorry, Erin, we have nothing for you.");
		}
	}
	
	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar(
				"000001",
				200.0,
				new GuitarSpec(Builder.PRS,
						"stratocastor",
						Type.ELECTRIC,
						Wood.MAHOGANY,
						Wood.MAPLE)
				);
		
		
		inventory.addGuitar(
				"000002",
				250.0,
				new GuitarSpec(Builder.GIBSON,
						"AR2323-X",
						Type.ACOUSTIC,
						Wood.BRAZILIAN,
						Wood.BRAZILIAN)
				);
		inventory.addGuitar(
				"000004",
				250.0,
				new GuitarSpec(Builder.PRS,
						"stratocastor",
						Type.ELECTRIC,
						Wood.MAHOGANY,
						Wood.MAPLE)
				);
		
		
	}

}
