package main.java.Interface.polymorphism;

public class Main {

	public static void main(String[] args) {
		// 객체 생성
		Burger burger = new Burger();
		burger.cook();
		System.out.println("-".repeat(10));
		
		// 객체 교체
		burger.pPt = new Pork();
		burger.bPt = new Pork();
		// 다형성 : 실행 결과가 다름
		burger.cook();
		System.out.println("-".repeat(10));
		
		
		// Patty 구현 객체 생성
		Pork pork = new Pork();
		Beef beef = new Beef();
		// 매개값으로 구현 객체 대입( 다형성 : 실행결과가 다름)
		burger.cook2(pork);
		burger.cook2(beef);
		
		checkPatty(pork);
		System.out.println("-".repeat(10));
		checkPatty(beef);
		
		
	}
	
	// 객체 타입 확인
	public static void checkPatty(Patty patty) {
		if (patty instanceof Pork pork) {
			pork.putPorkSauce();
		} 
		patty.putPatty();

	}

}
