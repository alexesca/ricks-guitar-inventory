import java.util.*;
import enums.*;


public class Inventory
{
    private List<Guitar> guitars;

    public Inventory()
    {
        guitars = new ArrayList<Guitar>();
    }

    public void addGuitar(String serialNumber, double price, GuitarSpec spec)
    {
        Guitar guitar = new Guitar(serialNumber, price, spec);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber)
    {
        for (Iterator i =  guitars.iterator(); i.hasNext();) {
        	Guitar guitar = (Guitar)i.next();
        	if(guitar.getSerialNumber().equals(serialNumber)) {
        		return guitar;
        	}
        }
        return null;
    }

    public List search(GuitarSpec searchGuitar)
    {
    	List matchingGuitars = new LinkedList();
        for (Iterator i = guitars.iterator();  i.hasNext();)
        {
        	Guitar guitar = (Guitar)i.next();
            Builder builder = searchGuitar.getBuilder();
            if ((builder != null) && (!builder.equals("")) &&
                (!builder.equals(guitar.getSpec().getBuilder())))
                continue;
            String model = searchGuitar.getModel().toLowerCase();
            if ((model != null) && (!model.equals("")) &&
                (!model.equals(guitar.getSpec().getModel().toLowerCase())))
                continue;
            Type type = searchGuitar.getType();
            if ((type != null) && (!searchGuitar.equals("")) &&
                (!type.equals(guitar.getSpec().getType())))
                continue;
            Wood backWood = searchGuitar.getBackWood();
            if ((backWood != null) && (!backWood.equals("")) &&
                (!backWood.equals(guitar.getSpec().getBackWood())))
                continue;
            Wood topWood = searchGuitar.getTopWood();
            if ((topWood != null) && (!topWood.equals("")) &&
                (!topWood.equals(guitar.getSpec().getTopWood())))
                continue;
            matchingGuitars.add(guitar);
        }
        
        return matchingGuitars;
    }
}