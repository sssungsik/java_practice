package main_0319;

public class Car {
	// static 이 붙었기 때문에 정적 필드
	// 상수, 변하지 않는 값 등 사용할 때 static 사용
	public static int speed;
	public static String model;
	public static String customModel;
	
	// static 이 없기 때문에 인스턴스 필드
	public int speed2;
	public String model2;
	
	// final 불변값 입력할 때.  수정,삭제 불가
	final static String made = "현대";
	
	public static void car1() {
		System.out.println("___[정적 메서드]___");
		System.out.println(made + model + " " + speed + "km 정적");
	
	}
	
	public void car2() {
		System.out.println("_[인스턴스 메서드]_");
		System.out.println(made + model2 + " " + speed2 + "km 인스턴스");
	}
		
}
