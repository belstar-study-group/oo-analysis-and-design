package my_example_second;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		Guitar whatErinLikes = new Guitar("", 0, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
		List<Guitar> matchingGuitars = inventory.search(whatErinLikes);
		
		if(!matchingGuitars.isEmpty()) {
			System.out.println("Erin, you might like these guitars:");
			for(Iterator<Guitar> i = matchingGuitars.iterator(); i.hasNext();) {
				Guitar guitar = (Guitar)i.next();
				System.out.println("We have a "+guitar.getBuilder()+" "+guitar.getModel()+ " " +
						guitar.getType()+ " guitar:\n " +guitar.getBackWood()+" back and sides,\n" +
						guitar.getTopWood()+" top.\n  You can have it for only $"+guitar.getPrice()+"!\n ----------" );
			}
		}else{
			System.out.println("Sorry, Erinm, we have nothing for you.");
		}
	}

	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("V95693", 1555, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
		
	}
}
