package interface_0405;

public class Monitor implements NewInterFace {
	// 필드 
	private int brightness;

	// 추상 메서드 오버라이딩
	@Override
	public void turnOn() {
		System.out.println("모니터 ON");
	}

	@Override
	public void turnOff() {
		System.out.println("모니터 OFF");
	}

	@Override
	public void setBrightness(int brightness) {
		System.out.println("모니터 밝기 : " + brightness);
	}

}
