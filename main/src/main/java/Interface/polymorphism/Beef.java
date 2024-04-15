package main.java.Interface.polymorphism;

public class Beef implements Patty {
	// 추상 메서드 재정의
	@Override
	public void putPatty() {
		System.out.println("소고기 패티 삽입");
	}
}
