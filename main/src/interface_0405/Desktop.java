package interface_0405;

public class Desktop implements NewInterFace, SmartPhone {
	
	@Override
	public void userHello(String userName) {
		System.out.println("안녕하세요, " + userName + " 님.");
		
	}
	@Override
	public void turnOn() {
		System.out.println("데스크탑 ON");
	}

	@Override
	public void turnOff() {
		System.out.println("데스크탑 OFF");
	}

}
