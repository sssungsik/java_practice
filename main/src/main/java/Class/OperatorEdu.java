package main.java.Class;

import java.util.Scanner;

public class OperatorEdu {
	//부호연산자
	public static void operSample1() {
		int num1 = -100;
		System.out.println(num1);
		
		int num2 = +num1;	// +연산자
		System.out.println(num2);
		
		int num3 = -num1;	// -연산자
		System.out.println(num3);
	}
	
	//증감연산자 
	public static void operSample2() {
		int num1 = 5;
		System.out.println(num1);
		
		int num2 = num1++;
		int num3 = ++num1;
		System.out.println("후위증감 연산자 : " + num2);
		System.out.println("전위증감 연산자 : " + num3);
	}
	
	//산술 연산자 (계산 수행, 기본 수학)
	public static void operSample3() {
		System.out.println("======환전 시작(원) ======");
		Scanner calc = new Scanner(System.in);
		float x = calc.nextFloat();
		
		System.out.println("======입력 종료 ======");
		
		System.out.println("대한민국 : " + (x) + " 원");
		System.out.println("미국 : " + (x / 1330) + " 달러");
		System.out.println("영국 : " + (x / 1690) + " 파운드");
		System.out.println("러시아 : " + (x / 15) + " 루블");
		System.out.println("베트남 : " + (x * 18.5) + " 동");
		System.out.println("필리핀 : " + (x / 24) + " 페소");
		System.out.println("일본 : " + (x / 9) + " 엔");
		System.out.println("중국 : " + (x / 185) + " 위안");
		System.out.println("남아프리카 공화국 : " + (x / 69) + " 랜드");
		System.out.println("인도 : " + (x / 16) + " 루피");
		
		}
	
	//오버플로우, 언더플로우 
	public static void operSample4() {
		byte num1 = 127;
		System.out.println(num1);
		byte result = ++num1;
		System.out.println(result);
		
		byte num2 = -128;
		System.out.println(num2);
		byte result2 = --num1;
		System.out.println(result2);
		
	}
	
	//실수형 오류 처리
	public static void operSample5() {
		Double x = 5.0;
		Double y = 0.0;
		Double z = x / y;
		Double w = x % y;
		
		//double타입은 오류 발생 안 함
		System.out.println(z);
		System.out.println(w);
		
		//boolean 변수 이용 처리
		boolean result = Double.isInfinite(z);
		System.out.println(result);
		boolean result2 = Double.isNaN(w);
		System.out.println(result2);
		
		if(result || result2) {
			System.out.println("산출불가");
		} else {
			System.out.println(z + 2);
			System.out.println(w + 2);
		}
	}
	
	
	//비교 연산자
		public static void operSample6() {
			String str1 = "ㅋㅋ";
			String str2 = "ㅋㅋ";
			boolean result = (str1 == str2);
			System.out.println(result);
			
			String str3 = new String("ㅋㅋ");
			String str4 = new String("ㅋㅋ");
			boolean result2 = (str3 == str4);
			System.out.println(result2);
			
			boolean result3 = (str3.equals(str4));
			System.out.println(result3);
			
			System.out.println(System.identityHashCode(str1));
			System.out.println(System.identityHashCode(str2));
			System.out.println(System.identityHashCode(str3));
			System.out.println(System.identityHashCode(str4));
					
		}
		
	
		
	//정수 비교 연산자
		public static void operSample7() {
			int num1 = 9999;
			int num2 = 9999;
			boolean wow1 = (num1 == num2);
			boolean wow2 = (num1 != num2);
			boolean wow3 = (num1 <= num2);
			System.out.println("결과1 - " + wow1);
			System.out.println("결과2 - " + wow2);
			System.out.println("결과3 - " + wow3);
		}
		public static void operSample8() {
			Scanner wow = new Scanner(System.in);
			int wwwow = wow.nextInt();
			
			if(wwwow >= 90) {
				System.out.println("합격확실");
			} else if(wwwow >= 80) {
				System.out.println("합격유력");
			} else if(wwwow >= 50) {
				System.out.println("합격예상");
			} else
				System.out.println("탈락");
		}
		
		public static void operSample9() {
			char yes1 = 'ㄱ';
			char yes2 = '챁';
			boolean yes = (yes1 < yes2);
			System.out.println(yes);
			
			int num1 = yes1;
			System.out.println(num1);
			int num2 = yes2;
			System.out.println(num2);
		}
	
	//Logical AND 논리 연산자
		public static void operSample10() {
			int age = 93;
			if(120 >= age && 90 <= age) {
				System.out.println("초고령");
			} else if(70 <= age && 89 >= age ) {
				System.out.println("고령");
			} else if(40 <= age && 69 >= age) {
				System.out.println("중년");
			} else {
				System.out.println("응애");
			}
		}
		public static void operSample11() {
			boolean data1 = true;
			boolean data2 = false;
			if(data1 || data2) {
				System.out.println("둘중하나참");
			}
			
			int num = 6;
			boolean result = ((num%2 == 0));
			System.out.println(result);
			if(!result) {
				System.out.println("아니다");	
			} else if(result) {
				System.out.println("맞다");
			}
		}
			
			
		//복합대입 연산자
		public static void operSample12() {
			
			for(int a = 1; a < 10 ; a++ ) {
			
				for(int b = 1; b < 10 ; b++) {
					int sum = a*b;
					System.out.println(sum);		
				}
			}
		}
		
		/* 삼항 연산자 */
		public static void operSample13() {
			//첫번째 데이타
			Scanner test = new Scanner(System.in);
			String x = test.next();
			System.out.println("첫번째 데이터 :  " + x);
			//두번째 데이타
			Scanner test2 = new Scanner(System.in);
			String y = test2.next();
			System.out.println("두번째 데이터 :  " + y);
			
			//변환
			int a = Integer.parseInt(x);
			int b = Integer.parseInt(y);
	
			//삼항연산자
			String result = (b < a) ? "첫번째가 가장 큼" : "두번째가 가장 큼";
			System.out.println(result);
		}	
			
			
}
