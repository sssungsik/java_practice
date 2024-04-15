package main.java.Interface.polymorphism;

public class Pork implements Patty{
	// 추상 메소드 재정의
	@Override
	public void putPatty() {
		System.out.println("돼지고기 패티 삽입");
	}
	
	public void putPorkSauce() {
		System.out.println("돼지고기 소스 삽입");
	}
}
