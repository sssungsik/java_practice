package main.java.Class;


import java.util.Scanner;

public class VariableEdu {
	
	public static void booleanSample1() {
		boolean Type = true;
		if(Type == true) {
			Type = false;
		}
		System.out.println(Type);	
	}

	public static void booleanSample2() {
		boolean Type = false;
		if(Type ==false) {
			Type = true;
		}
		System.out.println(Type);	
	}
	
	//문자형 샘플 메서드
	public static void zzSample1() {
		char inputData = 0x1187;
		System.out.println(inputData);	
	}
	
	public static void stringSample() {
		String inputData = "홍길동\n프로그래머\n나는 \"자바\"를 배웁니다.\n번호	\t이름	\t직업\n나는\n자바를\n배웁니다.";
		System.out.println(inputData);
	}
	public static void stringSample2() {
		String inputData = "\\\t/\\\n )     ( *)\n(     /  )\n  \\ (___)L";
		System.out.println(inputData);
	}
	//숫자형 샘플 메서드
	public static void numSample1() {	//byte,short,char,int,long
		byte num1 = 127;
		short num2 = 12700;
		char num3 = 311;
		int num4 = 12700000;
		long num5 = 127000000;
		double num6 = 30000.123132;
		System.out.println("byte : " + num1);	
		System.out.println("short : " + num2);	
		System.out.println("char : " + num3);	
		System.out.println("int : " + num4);	
		System.out.println("long : " + num5);
		System.out.println("double : " + num6);
	}
	
	
	//타입변환 샘플 메서드
	public static void castingSample1() {
		byte num1 = 0;
		int num2;
		//자동타입변환
		num2 = num1;
		System.out.println(num2);
		//강제타입변환
		num1 = (byte) num2;
		System.out.println(num1);
	}
	
	//문자열 타입변환 샘플 메서드
		public static void castingSample2() {
			String inputData = "1000";
			System.out.println(inputData);
			int num1 = Integer.parseInt(inputData);
			System.out.println(num1);
		}
	
	//Scanner 샘플 메서드
		public static void scannerSample1() {
			Scanner scanner = new Scanner(System.in);
			String inputData = scanner.next();
			System.out.println(inputData);
			if(inputData.equals("최성식")) {
				System.out.println("확인되었습니다.");
				System.out.println("비밀번호 입력.");
				Scanner scanner2 = new Scanner(System.in);
				String inputData2 = scanner2.next();
				System.out.println(inputData2);
				if(inputData2.equals("123123")) {
					System.out.println("접속되었습니다.");
					System.out.println("주민번호14자리입력.");
					Scanner scanner3 = new Scanner(System.in);
					String inputData3 = scanner3.next();
					System.out.println(inputData3);
					if(inputData3.equals("1")) {
						System.out.println("접속되었습니다.");
					} else {
						System.out.println("나가세요.");
					}
					
					
				} else {
					System.out.println("비밀번호 오류\n나가세요.");
					
				}
				
			} else {
				System.out.println("접속 실패");
				
			}
		}

}
