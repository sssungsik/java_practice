package main.java.Class;

public class Calculator {
	// 리턴값 없는 메소드 선언
	void powerOn() {
		System.out.println("계산기 시작");
	}
	void powerOff() {
		System.out.println("계산기 종료");
	}
	
	// 리턴 메서드 선언
	int add(int a, int b) {
		int result = a + b;
		return result;
	}
	int multi(int a, int b) {
		int result = a * b;
		return result;
	}
}
