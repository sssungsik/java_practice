package main.java.collection.ListCollection;

import java.util.List;
import java.util.Vector;

// Vector 는 ArrayList와 동일한 내부 구조
// 차이점 : 동기화된 메소드로 구성, 멀티스레드가 동시에 Vector 메소드 실행 불가

public class VectorExample {
	public static void main(String[] args) {
		// Vector 컬렉션 생성
		List<ArrayListMcdonalds> list = new Vector<>();

		// 작업 스레드 객체 생성
		Thread threadA = new Thread() {
			@Override
			public void run() {
				// 객체 1000개 추가
				for (int i = 1; i <= 1000; i++) {
					list.add(new ArrayListMcdonalds("햄버거" + i, "종류" + i, 1000 * i));

				}
			}
		};

		// 작업 스레드 실행
		threadA.start();

		// 작업 스레드 종료될 때까지 메인 스레드 대기
		try {
			threadA.join();
		} catch (Exception e) {

		}
		System.out.println(list.size());

	}
}
