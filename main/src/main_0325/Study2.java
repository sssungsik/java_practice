package main_0325;

public class Study2 {
	/* 정적 메서드 : 주로 고정된 값
	 * 
	 * 
	 */
	static double pi = 3.14;
	static int plus(int x, int y) {
		return x + y;
	}
	static int min(int x, int y) {
		return x - y;
	}
	
	
	// 필드 선언
	static String name = "최성식";
	final static String where = "대한민국"; // final 필드, 상수 선언
	static String info;
	
	// 정적 블록
	static {
		System.out.println("1");
		info = "정보 : " + name;
		info += "-" + where;
	}
	static {
		System.out.println("2");
	}
	
}
