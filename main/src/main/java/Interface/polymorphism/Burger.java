package main.java.Interface.polymorphism;

public class Burger {
	// 필드
	Patty pPt = new Pork();
	Patty bPt = new Beef();
	
	// 메소드
	void cook() {
		bPt.putPatty();
		pPt.putPatty();
	}
	
	// 매개변수를 인터페이스타입으로 선언
	void cook2(Patty patty) {
		patty.putPatty();
	}
}
