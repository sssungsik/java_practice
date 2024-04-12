package main.java.inheritance2;

public class Vehicle {
	// 메서드 선언
	
	int speed = 10;
	String name = "vehicle";
	
	public void run() {
		System.out.println(name + "이 달린다..");
	}
	
	public void printSpeed() {
		System.out.println("속 도 : " + speed);
	}

}
