package main.java.Class;

public class Main {

	public static void main(String[] args) {
		// Korean 객체 생성
		// Korean k1 = new Korean("최성식", "000-0001");
		// 또다른 Korean 객체 생성
		// Korean k2 = new Korean("최성철", "200-0001");
		
		
		
		/* Car 클래스 */
		Car myCar = new Car("벤츠");	// Car 객체 생성
		Car yourCar = new Car("현대");
		
		myCar.setMon(14);	//리턴값이 없는 setMon 호출
		if(myCar.isMoney()) {	// 받은 리턴값이 true일 경우 if 실행
			System.out.println("사봅시다.");
			
			myCar.run(); // 리턴값 없는 run() 메서드 호출
		}
		System.out.println("돈이 없다");
		
		
		myCar.setSpeed(120);
		yourCar.setSpeed(115);
		
		myCar.run2();
		yourCar.run2();
		
		
		
		/* 생성자 Overloading 예제 */
		Overloading over = new Overloading();	// 1 생성자 호출
		System.out.println(over.nation);
		System.out.println();
		
		Overloading over2 = new Overloading("수원");	// 2 생성자 호출
		System.out.println(over2.nation);
		System.out.println(over2.area);
		System.out.println();
		
		Overloading over3 = new Overloading("전주", 063);	// 3 생성자 호출
		System.out.println(over3.nation);
		System.out.println(over3.area);
		System.out.println(over3.num);
		
		/* 메서드 Overloading 예제 */
		// 객체 생성
		Overloading2 cal = new Overloading2();
		// 한변길이 10 정사각형 넓이
		double result1 = cal.result(10);
		// 길이 각각 10,30 직사각형 넓이
		double result2 = cal.result(10, 30);
		System.out.println("정사각형 넓이 : " + result1);
		System.out.println("직사각형 넓이 : " + result2);
	}
}
