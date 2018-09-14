package my_example_third;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
		List<Guitar> matchingGuitars = inventory.search(whatErinLikes);
		
		if(!matchingGuitars.isEmpty()) {
			System.out.println("Erin, you might like these guitars:");
			for(Iterator<Guitar> i = matchingGuitars.iterator(); i.hasNext();) {
				Guitar guitar = (Guitar)i.next();
				GuitarSpec spec = guitar.getSpec();
				System.out.println("We have a "+spec.getBuilder()+" "+spec.getModel()+ " " +
						spec.getType()+ " guitar:\n " +spec.getBackWood()+" back and sides,\n" +
						spec.getTopWood()+" top.\n  You can have it for only $"+guitar.getPrice()+"!\n ----------" );
			}
		}else{
			System.out.println("Sorry, Erinm, we have nothing for you.");
		}
	}

	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("ABCDE",1000, new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER));
		
	}
}
