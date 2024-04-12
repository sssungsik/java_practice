package main.java.exception;

public class ReferenceExample {

	public static void main(String[] args) {
		
		String test = "안녕,하세요,최성식";
		
		char test2 = test.charAt(0); // 특정 문자 위치 추출
		int test3 = test.length(); // 문자열 길이
		String test4 = test.replace("세요", "십니다"); // 문자열 대체
		int test5 = test.indexOf("하세요"); // 문자열 찾기
		String[] test6 = test.split(","); // 문자열 분리
		
		System.out.println(test2);
		System.out.println(test3);
		System.out.println(test4);
		System.out.println(test5);
		System.out.println(test6[0]);
		System.out.println(test6[1]);
		System.out.println(test6[2]);
		
		
		
		
		
	}

}
