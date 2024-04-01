package study_0401;

public class Phone {
	// 필드 선언
	public String model;
	public String color;
	
	// 메서드 선언
	public void bell() {
		System.out.println("따르릉");
	}
	public void sendVoice(String message) {
		System.out.println("상대 : " + message);
	}
	public void receiveVoice(String message) {
		System.out.println("나 : " + message);
	}
	
	public void hangUp() {
		System.out.println("--통화종료--");
	}
	
}
