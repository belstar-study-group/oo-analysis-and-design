package my_example_third;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {
	
	private List<Guitar> guitars;
	
	public Inventory() {
		guitars = new ArrayList<Guitar>();
	}
	
	public void addGuitar(String serialNumber, double price, GuitarSpec spec) {
		Guitar guitar = new Guitar(serialNumber,price,spec);
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
	
	public List<Guitar> search(GuitarSpec searchSpec) {
		List<Guitar> matchingGuitars = new ArrayList<Guitar>();
		for(Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar)i.next();
			//guitarSpec用來和傳入的吉他比較比較
			GuitarSpec guitarSpec = guitar.getSpec();
			
			Builder builder = searchSpec.getBuilder();
			if(builder != guitarSpec.getBuilder()) {
				continue;
			}
			String model = searchSpec.getModel().toLowerCase();
			if(model != null && !model.equals("") && !model.equals(guitarSpec.getModel().toLowerCase())) {
				continue;
			}
			Type type = searchSpec.getType();
			if(type != null && !type.equals("") && !type.equals(guitarSpec.getType())) {
				continue;
			}
			Wood backWood = searchSpec.getBackWood();
			if(backWood != null && !backWood.equals("") && !backWood.equals(guitarSpec.getBackWood())) {
				continue;
			}
			Wood topWood = searchSpec.getTopWood();
			if(topWood != null && !topWood.equals("") && !topWood.equals(guitarSpec.getTopWood())) {
				continue;
			}
			matchingGuitars.add(guitar);
		}
		return matchingGuitars;
	}
}
