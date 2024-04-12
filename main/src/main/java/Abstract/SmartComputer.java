package main.java.Abstract;

public class SmartComputer extends Computer{
	// 생성자 선언
	SmartComputer(String owner) {
		// Computer 생성자 호출
		super(owner);
	}
	
	void search() {
		System.out.println("인터넷 검색");
	}
}
