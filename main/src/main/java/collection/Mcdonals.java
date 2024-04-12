package main.java.collection;

public class Mcdonals {
	private String name;
	private String type;
	private int price;
	
	public Mcdonals(String name, String type, int price) {
		this.name = name;
		this.type = type;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public double getPriceDollar() {
		return (double)price * 0.0012;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
