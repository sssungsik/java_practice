package main.java.inheritance2;

public class Driver {
	// 메서드 선언 (클래스 타입의 매개변수를 갖고 있음)
	public void drive(Vehicle vehicle) {	// Vehicle 클래스의 run 메서드 호출
		vehicle.run(); 
		vehicle.printSpeed();
	}

}
