package main.java.Interface;

public class Main {

	public static void main(String[] args) {
		// 인터페이스 변수 선언
		RemoteControl rc;
		
		// Desktop 객체생성 및 인터페이스 변수 대입
		rc = new Desktop();
		rc.turnOn();
		rc.turnOff();
		// Monitor 객체생성 및 인터페이스 변수 대입
		rc = new Monitor();
		rc.turnOn();
		rc.setBrightness(100);
		
		// 디폴트 메서드 호출
		rc.setShoutdown(true);
		rc.setShoutdown(false);
		
		// 정적 메소드 호출
		RemoteControl.changeBattery();
		
		// Searchable 객체생성 
		Searchable sc;
		sc = new SmartTV();
		sc.search("www.google.com/");
		rc = new SmartTV();
		rc.turnOff();
	}

}
