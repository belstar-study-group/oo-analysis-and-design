package my_example_first;
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
	public void addGuitar(String serialNumber, double price, String builder,
			String model, String type, String backWood, String topWood) {
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
	
	// 為傳進來的Guitar物件與庫存裡的Guitar物件比較每一特性
	public Guitar search(Guitar searchGuitar) {
		for(Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar)i.next();
			
			String builder = searchGuitar.getBuilder();
			if(builder != null && !builder.equals("") && !builder.equals(guitar.getBuilder())) {
				continue;
			}
			
			String model = searchGuitar.getModel().toLowerCase();
			if(model != null && !model.equals("") && !model.equals(guitar.getModel().toLowerCase())) {
				continue;
			}
			
			String type = searchGuitar.getType();
			if(type != null && !type.equals("") && !type.equals(guitar.getType())) {
				continue;
			}
			
			String backWood = searchGuitar.getBackWood();
			if(backWood != null && !backWood.equals("") && !backWood.equals(guitar.getBackWood())) {
				continue;
			}

			String topWood = searchGuitar.getTopWood();
			if(topWood != null && !topWood.equals("") && !topWood.equals(guitar.getTopWood())) {
				continue;
			}
		}
		return null;
	}
}
