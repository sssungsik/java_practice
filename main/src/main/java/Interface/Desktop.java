package main.java.Interface;

public class Desktop implements RemoteControl {
	
	@Override
	public void turnOn() {
		System.out.println("데스크탑 ON");
	}
	@Override
	public void turnOff() {
		System.out.println("데스크탑 OFF");
	}

}
