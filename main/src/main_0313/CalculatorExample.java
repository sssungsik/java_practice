package main_0313;

public class CalculatorExample {

	public static void main(String[] args) {
		//Calculator 객체 생성
		Calculator calc = new Calculator();
		
		//리턴값 없는 powerOn 호출
		calc.powerOn();
		
		// add 메서드 호출, 2와 3 매개값 대입
		// return1에 대입
		int result1 = calc.add(2, 3);
		System.out.println("더한 값 : " + result1);
		
		// 변수 a와 b의 값을 매개값으로 제공
		int a = 100;
		int b = 20;
		int result2 = calc.multi(a, b);
		System.out.println("곱한 값 : " + result2);
		
		// 리턴 값 없는 powerOff 호출
		calc.powerOff();

	}

}
