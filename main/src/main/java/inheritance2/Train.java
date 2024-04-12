package main.java.inheritance2;

public class Train extends Vehicle{
	int speed = 720;
	String name = "Train";
	@Override
	public void run() {
		System.out.println(name + "가 달린다.");
	}
	public void printSpeed() {
		System.out.println("속 도 : " + speed);
	}

}
