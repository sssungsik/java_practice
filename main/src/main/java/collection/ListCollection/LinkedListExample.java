package main.java.collection.ListCollection;
// <LinkedList>
// - 인접 객체를 체인처럼 연결해서 관리

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		// ArrayList와 LinkedList에 10000개 객체를 삽입하는데 걸린 시간을 측청하는 예제.
		
		// ArrayList 객체 생성
		List<String> list1 = new ArrayList<String>();
		// LinkedList 객체 생성
		List<String> list2 = new LinkedList<String>();
		
		// 시작시간,끝 시간 저장 변수 선언
		long startTime;
		long endTime;
		
		// ArrayList 컬렉션에 저장하는 시간 측정
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "ArrayList 시간 : ", (endTime - startTime));
		
		// LinkedList 컬렉션에 저장하는 시간 측정
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "LinkedList 시간 : ", (endTime - startTime));
	}

}
