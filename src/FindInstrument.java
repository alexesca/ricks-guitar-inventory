import enums.*;
import java.util.*;  

public class FindInstrument {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		Map properties = new HashMap();
		properties.put("builder", Builder.GIBSON);
		properties.put("backWood", Wood.MAPLE);
		InstrumentSpec clientSpec = new InstrumentSpec(properties);

		List matchingInstruments = inventory.search(clientSpec);
		if(!matchingInstruments.isEmpty()) {
			System.out.println("You might like these instruments:  ");
			for(Iterator i = matchingInstruments.iterator(); i.hasNext();) {
				Instrument instrument = (Instrument)i.next();
				InstrumentSpec spec = (InstrumentSpec) instrument.getSpec();
				System.out.println(" We have a " + clientSpec.getProperty("instrumentType") + " with the following properties: ");
				for(Iterator j  = clientSpec.getProperties().keySet().iterator(); j.hasNext();) {
					String propertyName = (String)j.next();
					if(propertyName.equals("instrumentType"))
						continue;
					System.out.println("	" + propertyName + ": " + spec.getProperty(propertyName));
				}
				System.out.println(" 	You can have this " +
						spec.getProperty("instrumentType") + " 	for $" +
						instrument.getPrice() + "\n----");
			}
		} else {
			System.out.println("Sorry, Erin, we have nothing for you.");
		}
	}
	
	private static void initializeInventory(Inventory inventory) {
		Map properties = new HashMap();
		properties.put("builder", Builder.GIBSON);
		properties.put("backWood", Wood.MAPLE);

		inventory.addInstrument(
				"000001",
				200.0,
				new InstrumentSpec(properties)
		);

		properties = new HashMap();
		properties.put("builder", Builder.PRS);
		properties.put("backWood", Wood.MAPLE);

		inventory.addInstrument(
				"000002",
				250.0,
				new InstrumentSpec(properties)
		);

		properties = new HashMap();
		properties.put("builder", Builder.GIBSON);
		properties.put("backWood", Wood.MAPLE);

		inventory.addInstrument(
				"000004",
				350.0,
				new InstrumentSpec(properties)
		);
	}

}
