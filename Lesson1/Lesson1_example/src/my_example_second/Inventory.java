package my_example_second;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {
	// 吉他庫存
	private List<Guitar> guitars;
	
	// 將庫存實例化
	public Inventory() {
		guitars = new ArrayList<Guitar>();
	}
	
	// 接受所需的參數，建立新的Guitar實例，並加入庫存
	public void addGuitar(String serialNumber, double price, Builder builder,
			String model, Type type, Wood backWood, Wood topWood) {
		Guitar guitar = new Guitar(serialNumber,price,builder,model,type,backWood,topWood);
		guitars.add(guitar);
	}
	
	public Guitar getGuitar (String serialNumber) {
		for(Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar)i.next();
			if(guitar.getSerialNumber().equals(serialNumber)) {
				return guitar;
			}
		}
		return null;
	}
	
	// 從原本回傳符合條件的單一吉他改成回傳吉他列表
	public List<Guitar> search(Guitar searchGuitar) {
		List<Guitar> matchingGuitars = new ArrayList<Guitar>();
		for(Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar)i.next();
			
			Builder builder = searchGuitar.getBuilder();
			if(builder != null && !builder.equals("") && !builder.equals(guitar.getBuilder())) {
				continue;
			}
			
			String model = searchGuitar.getModel().toLowerCase();
			if(model != null && !model.equals("") && !model.equals(guitar.getModel().toLowerCase())) {
				continue;
			}
			
			Type type = searchGuitar.getType();
			if(type != null && !type.equals("") && !type.equals(guitar.getType())) {
				continue;
			}
			
			Wood backWood = searchGuitar.getBackWood();
			if(backWood != null && !backWood.equals("") && !backWood.equals(guitar.getBackWood())) {
				continue;
			}

			Wood topWood = searchGuitar.getTopWood();
			if(topWood != null && !topWood.equals("") && !topWood.equals(guitar.getTopWood())) {
				continue;
			}
			matchingGuitars.add(guitar);
		}
		return matchingGuitars;
	}
}
