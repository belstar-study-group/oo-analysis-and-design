package my_example_third;

public class Guitar {
	// 欄位 將會參與搜尋的欄位及對應方法抽離並參考至GuitarSpec物件
	// 重複程式碼就進行 封裝
	private String serialNumber;
	private double price;
	private GuitarSpec spec;
	
	// 有參數建構子
	public Guitar(String serialNumber,  double price, GuitarSpec spec) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.spec = spec;
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
	public GuitarSpec getSpec() {
		return spec;
	}
}
