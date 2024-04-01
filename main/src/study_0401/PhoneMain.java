package study_0401;

public class PhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone myPhone = new SmartPhone("아이폰", "Black");
		System.out.println("모델 : " + myPhone.model);
		System.out.println("색상 : " + myPhone.color);
		System.out.println("와이파이 : " + myPhone.wifi);
		
		myPhone.bell();
		myPhone.sendVoice("여보세요.");
		myPhone.receiveVoice("어디냐.");
		myPhone.sendVoice("누구세요.");
		myPhone.hangUp();
		myPhone.setWifi(true);	
		myPhone.internet();	
	}

}
