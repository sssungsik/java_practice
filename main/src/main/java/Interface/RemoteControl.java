package main.java.Interface;

public interface RemoteControl {
	// 상수 필드
	int PLUG_INT = 220;

	// 추상 메서드
	void start();
	void turnOn();
	void turnOff();
	void setBrightness(int brightness);

	// 디폴트 인스턴스 메서드
	default void setShoutdown(boolean shut) {
		if(shut) {
			System.out.println("전력 차단. 강제종료.");
			turnOff();
		} 
	}
	
	// 정적 메소드
	static void changeBattery() {
		System.out.println("건전지 교환");
	}
}
