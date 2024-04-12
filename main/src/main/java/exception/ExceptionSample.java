package main.java.exception;

public class ExceptionSample {
	public static void printLength(String data) {
		int result = data.length();
		System.out.println("문자수 : " + result);
	}
	
	public static void printLength2(String data) {
		try {
			// 실행코드 목록
			int result = data.length();
			System.out.println("문자수 : " + result);
		} catch (NullPointerException e) {
			// 예외처리 부분
			System.out.println("오류"); 
			System.out.println(e.getMessage()); // 내용만
			System.out.println(e.toString()); 
			e.printStackTrace(); 
		} finally {
			// 무조건 실행되는 블록
			System.out.println("마무리 실행");		
		}
	}
	
	
}
