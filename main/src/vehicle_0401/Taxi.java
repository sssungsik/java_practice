package vehicle_0401;

public class Taxi extends Vehicle {
	int speed = 210;
	String name = "taxi";
	// 메서드 재정의 (오버라이딩)
	public void run() {
		System.out.println(name + "가 이동한다.....");
	}
	
	public void printSpeed() {
		System.out.println("속 도 : " + speed);
	}

}
