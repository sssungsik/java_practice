package study_0326;

import java.util.Iterator;
import java.util.regex.Pattern;

public  class Arr {

	public void refer3() {
		String[] intArray = null;
		
		intArray = new String[5];
		intArray[0] = "토끼";
		intArray[1] = "뱀";
		intArray[2] = "소";
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		System.out.println(intArray[3]);
	}
	
	public void refer4() {
		int[] intArray = null;
		
		intArray = new int[] {10,20,50};
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
	}
	public void refer5() {
		String name1 = "ㅇㅇ";
		String name2 = "ㅇㅇ";
		System.out.println(name1 == name2); // True
		
		String name3 = new String("ㅇㅇ");
		String name4 = new String("ㅇㅇ");
		System.out.println(name3 == name4); // False
		// 데이터만 비교 
		System.out.println(name3.equals(name4)); // True
	}
	public void refer1() { // 위치 추출 .charAt
		System.out.println("=========위치 추출===========");
		String name5 = "안녕하세요~";
	
		System.out.println(name5.charAt(0));
		System.out.println(name5.charAt(1));
		System.out.println(name5.charAt(5));
	}
	
	public void refer2() { // 문자열 길이 .length
		System.out.println("=========문자열 길이===========");
		String name6 = "최성식";
		System.out.println(name6.length());
		
	}
	public void refer6() { // 문자열 대체 .replace
		System.out.println("=========문자열 대체===========");
		String name6 = "최성식";
		System.out.println(name6.replace("최", "나는야 최"));
		
	}
	public void refer7() { // 문자열 잘라내기 .substring
		System.out.println("=========문자열 잘라내기===========");
		String name6 = "최성식입니다";
		System.out.println(name6.substring(2));
		System.out.println(name6.substring(2,4));	
	}
	public void refer8() { // 문자열 찾기 .indexOf
		System.out.println("=========문자열 찾기==========="); // 일치하는 단어 있다면 0, 없다면 -1
		String name6 = "최성식입니다";
		System.out.println(name6.indexOf("최성식"));
		System.out.println(name6.indexOf("안녕"));	
	}
	public void refer9() { // 특정 문자 기준 문자열 잘라내기 
		System.out.println("=========특정 문자 기준 잘라내기===========");
		String name6 = "최성식입니다";
		String[] reArr = name6.split("입"); // 기준
		System.out.println(reArr[0]); // 최성식
		System.out.println(reArr[1]); // 니다
		System.out.println(reArr.length); // 2개
	}
	
	public void refer10() { // 정규식 표현
		System.out.println("=========정규식표현===========");
		String data = "@#@$가나다Abs"; 
		System.out.println(data);
		
		String result = data.replaceAll("[^0-9a-zA-Z가-힣]", "");
        System.out.println(result);
	}
	
	public void refer11() { // 다차원 배열
		System.out.println("=========다차원 배열===========");
		String [][]arr1 = new String[2][2];
		arr1 [0][0] = "1번째 1번";
		arr1 [0][1] = "1번째 2번";
		arr1 [1][0] = "2번째 1번";
		arr1 [1][1] = "2번째 2번";
		
		System.out.println(arr1[0][0]);
		System.out.println(arr1[0][1]);
		System.out.println(arr1[1][0]);
		System.out.println(arr1[1][1]);
		
		String[][] arr2 = {
				{"A번 1번", "A번 2번"},
				{"B번 1번", "B번 2번"}};
		System.out.println(arr2[0][0]);
		System.out.println(arr2[0][1]);
		System.out.println(arr2[1][0]);
	}
	public void refer12() { // 배열 복사 
		System.out.println("=========배열 복사===========");
		String[] oldArr = new String[2];
		oldArr[0] = "odd 데이타1";
		oldArr[1] = "odd 데이타2";
		
		String[] newArr = new String[6];
		System.arraycopy(oldArr, 0, newArr, 0, 2);;
		
		newArr[2] = "new 데이타2";
		newArr[3] = "new 데이타3";
		newArr[4] = "new 데이타4";
		System.out.println(newArr[0]);
		System.out.println(newArr[1]);
		System.out.println(newArr[2]);
		System.out.println(newArr[3]);
		System.out.println(newArr[4]);
	}
	public void refer13() { // 향상된 for 문

		String[] arr1 = {"신림","봉천","서울대","낙성대","사당",};
		for(int i=0; arr1.length > i; i++) {
			System.out.println(arr1[i]);
		}
		for(String getArr : arr1) {
			System.out.println(getArr);
		}
			
	}
	public void test1() {
		int[][] array = {
				{95,86,13},
				{83,92,96},
				{78,83,93,87,88}
		};
		System.out.println(array.length);
		System.out.println(array[2].length);
	}
	public void test2() {		
		int[] array = {1,5,3,8,2};
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max ) {
				max = array[i];
			}
			
		}
		System.out.println("\n최대 : " + max);
	}
	public void study1() {
		int test = 123;
		System.out.printf("값 : %06d ", test);
	}
	public void test3() {
		int[][] arr = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		int sum = 0;
		int tot = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
			tot +=arr[i].length;
		}
		
		System.out.println("ㅇㅇㅇㅇㅇㅇㅇㅇㅇ" + sum);
	}
}
