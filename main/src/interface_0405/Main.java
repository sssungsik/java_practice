package interface_0405;

public class Main {

	public static void main(String[] args) {
		// 인터페이스 변수 선언
		NewInterFace ni;
		
		// Desktop 객체생성 및 인터페이스 변수 대입
		ni = new Desktop();
		ni.turnOn();
		ni.turnOff();
		// Monitor 객체생성 및 인터페이스 변수 대입
		ni = new Monitor();
		ni.turnOn();
		ni.setBrightness(100);
		
		// 디폴트 메서드 호출
		ni.setShoutdown(true);
		ni.setShoutdown(false);
		
		// SmartPhone 인터페이스 변수 선언 및 구현 객체 대입
		SmartPhone sp = new Desktop();
		sp.userHello("최성식");
		
		// User 객체 생성
		User user = new User();
		Desktop dk = new Desktop();
		Monitor mt = new Monitor();
		user.on(dk);
		user.on(mt);
	}

}
