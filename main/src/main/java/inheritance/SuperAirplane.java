package main.java.inheritance;

public class SuperAirplane extends Airplanne {
	// 상수선언
	public static final int NOMAL = 1;
	public static final int SUPER = 2;
	
	// 상태 필드 선언
	public int mode = NOMAL;
	
	// 메서드 재정의
	@Override
	public void fly(){
		if(mode == SUPER) {
			System.out.println("개빠른 비행");
		} else {
			// 부모객체 fly 호출
			super.fly();
		}
	}
	
}
