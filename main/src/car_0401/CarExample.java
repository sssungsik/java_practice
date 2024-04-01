package car_0401;

public class CarExample {

	public static void main(String[] args) {
		// Car 객체 생성
		Car myCar = new Car();	// 1. new 연산자로 Car 클래스의 myCar 객체 생성
														
		// Tire 객체 장착								
		myCar.tire = new Tire();	// 2. Tire 객체 생성 후 myCar 객체에 대입
		myCar.run();	// 3. myCar 의 객체에 대입된 roll() 메서드 호출
		
		
		// Hankook T 장착
		myCar.tire = new HankookT();	// 4. HankookT 객체 생성 후 myCar 객체에 대입
		myCar.run();	// 5. myCar 의 객체에 대입된 roll() 메서드 호출
		
		// Kumho T 장착
		myCar.tire = new KumhoT();	// 6. KumhoT 객체 생성 후 myCar 객체에 대입
		myCar.run();	// 7. myCar 의 객체에 대입된 roll() 메서드 호출
		

	}

}
