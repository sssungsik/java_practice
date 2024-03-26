package study_0326;

import java.util.Scanner;

public class WhileSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		int mon = 0;
		
		while(run) {
			System.out.println("____________________");
			System.out.println("1.일하기|2.밥먹기|3.종료");
			System.out.println("____________________");
			System.out.print("선택 = ");
			
			String selT = scanner.nextLine();
			
			if(selT.equals("1")) {
				mon += 10000;
				System.out.println("돈 : " + mon);
				
			} else if (selT.equals("2")) {
				mon -= 5000;
				System.out.println("돈 : " + mon);
			} else {
				run = false;
				
			}
		}
		System.out.println("종료");
		System.out.println("돈 : " + mon);
		
			
	}

}
