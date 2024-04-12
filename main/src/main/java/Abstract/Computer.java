package main.java.Abstract;

// 추상 클래스
// - 클래스들의 공통 필드나 메서드를 추출해서 선언한 클래스
// - 실체 클래스들의 부모 역할
// - 실체 클래스는 추상 클래스를 상속해서 공통필드나 메소드를 물려받을 수 있다
// - 추상 클래스는 new 연산자를 사용해서 객체 생성 불가
// - 추상 클래스는 extends 뒤에만 올 수 있다. (부모 클래스로만 사용 가능하다)



public abstract class Computer {
	String owner;
	
	Computer(String owner) {
		this.owner = owner;
	}
	
	void turnOn() {
		System.out.println("전원 켬");
	}
	void turnOff() {
		System.out.println("전원 끔");
	}
}
