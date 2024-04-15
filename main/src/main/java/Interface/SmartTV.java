package main.java.Interface;

public class SmartTV implements RemoteControl, Searchable{
	// turnOn 추상 메소드 오버라이딩
	@Override
	public void turnOn() {
		System.out.println("스마트 티비 켜졌읍니다.");
	}
	
	// turnOff 추상 메소드 오버라이딩
	@Override
	public void turnOff() {
		System.out.println("스마트 티비 종료되었읍니다.");
	}
	
	// search 추상 메소드 오버라이딩
	public void search(String url) {
		System.out.println(url + " 검색...");
	}
	

}
