import enums.*;
import java.util.*;  

public class FindGuitarTester {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		GuitarSpec whatErinLikes = new GuitarSpec(Builder.PRS, "stratocastor", Type.ELECTRIC, Wood.MAHOGANY, Wood.MAPLE, 12);

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
		inventory.addInstrument(
				"000001",
				200.0,
				new GuitarSpec(Builder.PRS,
						"stratocastor",
						Type.ELECTRIC,
						Wood.MAHOGANY,
						Wood.MAPLE,
						12
				)
		);
		
		
		inventory.addInstrument(
				"000002",
				250.0,
				new GuitarSpec(Builder.GIBSON,
						"AR2323-X",
						Type.ACOUSTIC,
						Wood.BRAZILIAN,
						Wood.BRAZILIAN,
						12
				)
		);
		inventory.addInstrument(
				"000004",
				250.0,
				new GuitarSpec(Builder.PRS,
						"stratocastor",
						Type.ELECTRIC,
						Wood.MAHOGANY,
						Wood.MAPLE,
						10
						)
				);
		
		
	}

}
