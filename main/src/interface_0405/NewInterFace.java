package interface_0405;

public interface NewInterFace {
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
}
