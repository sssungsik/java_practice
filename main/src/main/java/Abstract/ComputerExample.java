package main.java.Abstract;

public class ComputerExample {

	public static void main(String[] args) {
		SmartComputer sc = new SmartComputer("최성식");
		
		sc.turnOn(); // 추상클래스 메소드
		sc.search();
		sc.turnOff(); // 추상클래스 메소드
		

	}

}
