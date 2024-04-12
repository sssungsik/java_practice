package main.java.inheritance2;

public class DriverExample {

	public static void main(String[] args) {
		// Driver 객체 생성
		Driver driver = new Driver();
		
		driver.drive(new Bus());
		driver.drive(new Taxi());
		driver.drive(new Train());

	}

}
