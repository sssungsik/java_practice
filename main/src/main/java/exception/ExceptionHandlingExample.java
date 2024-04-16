package main.java.exception;

public class ExceptionHandlingExample {

	public static void printLength(String data) {
		// 예외 처리 코드
		try {
			int result = data.length();	// data 가 null 일 경우 NullPointerException 발생
			System.out.println("문자 수 : " + result);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());	// 예외정보 얻는 3가지
			System.out.println(e.toString());
			e.printStackTrace();
		} finally {
			System.out.println("마무리 실행");
		}
	}
		
	public static void main(String[] args) {
		System.out.println("_".repeat(30));
		System.out.println("프로그램 시작");
		printLength("자바마스터");
		printLength(null);
		
		System.out.println("프로그램 종료");
		
		
		// ClassPath 위치에서 주어진 클래스를 찾는 코드 - ClassNotFoundException 예외발생
		System.out.println("_".repeat(30));
		try {
			Class.forName("java.lang.String"); 
			System.out.println("java.lang.String 클래스 존재");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println();
		try {
			Class.forName("java.lang.String2"); 
			System.out.println("java.lang.String2 클래스 존재");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// 예외 종류에 따른 처리 
		System.out.println("_".repeat(30));
		String[] array = {"100", "1oo"};
		
		for(int i=0; i<=array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("array[" + i + "] : " + value);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열인덱스초과 - " + e.getMessage());
			} catch(NumberFormatException e) {
				System.out.println("숫자반환불가 - " + e.getMessage());
			} catch(Exception e) { // 상위 예외 클래스는 아래쪽에 작성
				System.out.println("에러 발생!!!!!");
			}
		}
		
		// 두 개 이상의 예외를 하나의 catch 로 처리
		System.out.println("_".repeat(30));
		for(int i=0; i<=array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("array[" + i + "] : " + value);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열인덱스초과 - " + e.getMessage());
			} catch(NullPointerException | NumberFormatException e) { // 2가지 처리
				System.out.println("에러 발생 - " + e.getMessage());
			}
		}
		
	}

}
