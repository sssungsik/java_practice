package main.java.inheritance;

public class SuperAirplaneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperAirplane sa = new SuperAirplane();
		
		sa.takeoff();
		sa.fly();
		sa.mode = SuperAirplane.SUPER;
		sa.fly();
		sa.land();
	}

}
