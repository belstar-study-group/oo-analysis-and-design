package my_example_second;

public class Guitar {
	//  欄位 將String欄位替換成enum 減少錯字或可避免的人為失誤產生
	private String serialNumber, model;
	private Builder builder;
	private Type type;
	private Wood backWood, topWood;
	private double price;
	
	// 有參數建構子
	public Guitar(String serialNumber,  double price, Builder builder, String model,
			Type type, Wood backWood, Wood topWood) {
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
	public Builder getBuilder() {
		return builder;
	}
	public Type getType() {
		return type;
	}
	public Wood getBackWood() {
		return backWood;
	}
	public Wood getTopWood() {
		return topWood;
	}
}
