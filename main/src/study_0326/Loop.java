package study_0326;

public class Loop {
	public void test1() {
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			if(i % 3== 0) {
				sum += i;
			}	
		}
		System.out.println("총합 : " + sum);

	}
	public void test2() {
		
		while (true) {
			int game = (int)(Math.random()*6)+1;
			int game2 = (int)(Math.random()*6)+1;
		
			System.out.println("ㅇㅇㅇㅇㅇ던져라주사위ㅇㅇㅇㅇㅇㅇㅇ");
			System.out.println("(" + game + ")" + " " + "(" + game2+ ")");
			if(game + game2 == 5) {
				break;
			}
		}
		System.out.println("합계 5, 종료");
	}
	public void test3() {
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
