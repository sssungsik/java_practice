package main.java.Class2;

public class Main {

	public static void main(String[] args) {
		// 정적 메서드
		Car.model = "아반떼";
		Car.speed = 210;
		Car.customModel = "CN7";
		Car.car1();
		
		// 인스턴스 메서드
		Car car = new Car();
		car.model2 = "소나타";
		car.speed2 = 195;
		car.car2();
		
		
		// VO = 데이터 읽고 쓰기만 가능
		// DTO = 데이터 변경
		CarVO carVo = new CarVO();
		carVo.setColor1("black");
	}
}
