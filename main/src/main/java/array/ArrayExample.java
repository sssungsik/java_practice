package main.java.array;

public class ArrayExample {

	public static void main(String[] args) {
		// 배열 변수 선언
		// 타입[] 변수;   --> 주로사용
		// 타입 변수[]; 
		
		
		// 총합과 평균 구하기
		int[] scores = {87,85,45,11,99,58};
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("합 :" + sum);
		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);
		
		// 배열변수 미리 생성 후 값 목록을 변수에 대입 불가
		int[] test;
		// test = {1,2,3,4}; // 컴파일 에러
		test = new int[] {1,2,3,4}; // new타입[] 로 생성
		
		// 값 목록 없지만 길이로 미리 생성 가능
		int[] test2 = new int[4];
		
		// 다차원 배열
		int[][] test3 = {
				{1,2,3}, // 1차원 배열의 0 인덱스
				{4,5,6} // 1차원 배열의 1 인덱스
		};
		int grade = test3[0][2]; // 3
		int grade2 = test3[1][1]; // 5
		// test3.length // 2 
		// test3[0].length // 3
		// test3[1].length // 3
		
		// 1차원배열 0인덱스 합, 평균 구하기
		int arr1Sum = 0;
		for(int i = 0; i<test3[0].length; i++) {
			arr1Sum += test3[0][i];
		}
		double arr1Avg = (double) arr1Sum / test3[0].length;
		System.out.println("1차원배열 0 인덱스 합 : " + arr1Sum + " 평군 : " + arr1Avg);
		
		// 1차원배열 1 인덱스 합, 평균 구하기
		int arr2Sum = 0;
		for(int i = 0; i<test3[1].length; i++) {
			arr2Sum += test3[1][i];
		}
		double arr2Avg = (double) arr2Sum / test3[1].length;
		System.out.println("1차원배열 1 인덱스 합 : " + arr2Sum + " 평군 : " + arr2Avg);
		
		// 1차원배열 0,1 인덱스의 총합 및 평균
		int totalLength = 0;
		int totalSum = 0;
		for(int i = 0; i<test3.length; i++) {
			totalLength += test3[i].length;
			for(int j = 0; j<test3[i].length; j++) {
				totalSum += test3[i][j];
			}
		}
		double totalAvg = (double) totalSum / totalLength;
		System.out.println("총합 : " + totalSum + " 평군 : " + totalAvg);
		
		
		// 향상된 for문 (합 구하기)
		int[] scores2 = {12,64,60,99};
		int sum2 = 0;
		for(int i : scores2) {
			sum2 = sum2 + i;
		}
		System.out.println("총합 : " + sum2);
		
		

	}
	
	

}
