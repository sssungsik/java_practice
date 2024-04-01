package study_0401;

public class Computer extends Calculator {
	
	// 메서드 오버라이딩
	@Override
    public double areaCircle(double r) {
    	
		System.out.println("Computer 객체의 areCircle() 실행");
		return Math.PI * r * r;
	}
	
}
