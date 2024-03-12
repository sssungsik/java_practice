package main_0312;

import java.util.Scanner;

public class Conditional {
	public static void conSample1() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수 입력");
		int score = scanner.nextInt();
		
		String grade;
		
		if (score >= 95) {
			grade = "A+";
		} else if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		System.out.println("학점 : " + grade);
	}
		
		
	/*Math.random 메서드를 활용해 0.0 1.0 사이의 난수를 생성해 1~6까지 정수값이 나오도록 산술연산
	자를 활용해 스위치문으로 출력*/
	public static void conSample2() {
		
		double rNum = Math.random(); // 랜덤 난수 생성
		int num = (int)(rNum*6)+1; // switch 사용을 위해 정수형으로 변환 (*6은 최댓값, +1은 최솟값)
		
		switch (num) { 
		case 1:
			System.out.println("주사위 값 : " + num);
			break;
		case 2:
			System.out.println("주사위 값 : " + num);
			break;
		case 3:
			System.out.println("주사위 값 : " + num);
			break;
		case 4:
			System.out.println("주사위 값 : " + num);
			break;
		case 5:
			System.out.println("주사위 값 : " + num);
			break;
		case 6:
			System.out.println("주사위 값 : " + num);
			break;
		default:
		}	
	}
		
		
		
	}
		
		