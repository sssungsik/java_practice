package vehicle_0401;

public class Bus extends Vehicle {
	public int speed = 120;
	String name = "Bus";
	@Override
	
	public void run() {
		System.out.println(name + "가 이동....." );
	}

	public void printSpeed() {
		System.out.println("속 도 : " + speed);
	}
}
