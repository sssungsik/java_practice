package main.java.generic;

public class CarAgency implements Rentable{
	@Override
	public Car rent() {
		return new Car();
	}
}
