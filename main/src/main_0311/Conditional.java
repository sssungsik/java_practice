package main_0311;

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

}
