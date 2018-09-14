package my_example_first;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		Guitar whatErinLikes = new Guitar("", 0, "fender", "Stratocastor", "electric", "alder", "alder");
		Guitar guitar = inventory.search(whatErinLikes);
		
		//回傳找到與否訊息
		if(guitar != null) {
			System.out.println("Erin, you might like this "+guitar.getBuilder() + " " + guitar.getModel()+ " " +
		guitar.getType() + " guitar: \n" + guitar.getBackWood() + " back and sides, \n" +guitar.getTopWood()+" top.\n"
				+ "You can have it for only $"+guitar.getPrice()+"!!");
		}else{
			System.out.println(guitar);
			System.out.println("Sorry, Erin, we have nothing for you.");
		}
	}

	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("V95693", 1499, "fender", "Stratocastor", "electric", "alder", "alder");
		
	}
}
