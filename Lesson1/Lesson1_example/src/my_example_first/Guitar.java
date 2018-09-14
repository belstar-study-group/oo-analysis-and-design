package my_example_first;

public class Guitar {
	//  欄位
	private String serialNumber, model;
	private String builder;
	private String type;
	private String backWood, topWood;
	private double price;
	
	// 有參數建構子
	public Guitar(String serialNumber,  double price, String builder, String model,
			String type, String backWood, String topWood) {
		this.serialNumber = serialNumber;
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		this.price = price;
	}

	// getter and setter
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public String getModel() {
		return model;
	}
	public String getBuilder() {
		return builder;
	}
	public String getType() {
		return type;
	}
	public String getBackWood() {
		return backWood;
	}
	public String getTopWood() {
		return topWood;
	}
}
