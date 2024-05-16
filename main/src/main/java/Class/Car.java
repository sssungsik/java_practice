package main.java.Class;

public class Car {
	//필드 선언
	int money;
	int speed;
	String model;
	
	
	
	//리턴값이없는 메소드로 매개값을 받아서 money 필드값 변경
	void setMon(int money) {
		this.money = money;
	}
	
	//리턴값이 boolean 인 메소드로 리턴
	boolean isMoney() {
		if (money == 0) {
			System.out.println("돈이 없다.");
			return false; // false 리턴, 종료
		}
		System.out.println("돈 있다.");
		return true; // true 리턴, 종료
	}
	
	// 리턴값이 없는 메서드로 money 값이 0이면 return 문으로 메서드 종료
	void run() {
		while (true) {
			if (money > 0) {
				System.out.println("구매완료. 남은 돈 : " + money + "만원");
				money -= 1;
			} else {
				System.out.println("구매중지. 남은 돈 : " + money + "만원");
				return; // 메소드 종료
			}
		}
	}
	// 생성자 선언 2
	Car(String model) {
		this.model = model;
	}
	
	// 메서드 선언
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run2() {
		System.out.println(this.model + "가 달립니다. 속도 : " + speed);
	}

}
