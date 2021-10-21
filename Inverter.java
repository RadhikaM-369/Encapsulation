package encapsulation;

public class Inverter {
	private String brand;
	private int weight;
	private String capacity;
	private String type;
	private int price;
	
	public void setbrand(String brand) {
		this.brand=brand;
	}
	public void setweight(int weight) {
		this.weight=weight;
	}
	public void setcapacity(String capacity) {
		this.capacity=capacity;
	}
	public void settype(String type) {
		this.type=type;
	}
	public void setprice(int price) {
		this.price=price;
	}
	
	public String getbrand() {
		return this.brand;
	}
	public int getweight() {
		return this.weight;
	}
	public String getcapacity() {
		return this.capacity;
	}
	public String gettype() {
		return this.type;
	}
	public int getprice() {
		return this.price;
	}

}
