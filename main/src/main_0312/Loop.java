package main_0312;

public class Loop {
	/* For문 
	 * 특정 횟수 만큼 반복작업 실행 
	 * 초기화,조건식,증감식으로 구성
	 */
	
	// 1부터 10까지 출력하는 메서드	
	public static void loopSample1() {
		for(int i=0; i < 10; i ++) {
			System.out.printf("%-3d", i + 1);
		}	
	}
	
	// 구구단을 출력하는 메서드
	public static void loopSample2() {
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%3d", i * j);
			}
			System.out.println();
		}
	}
	
	// 3의 배수를 30까지 출력하는 메서드
	public static void loopSample3() {
		int sum = 3;
		for(int i=1; i<= 10; i++ ) {
			System.out.printf("%-3d", sum * i);
		}
		
	}
	
	

}