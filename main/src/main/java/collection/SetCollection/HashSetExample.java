package main.java.collection.SetCollection;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		System.out.println("-".repeat(50));
		// HashSet 컬렉션 생성
		Set<String> set = new HashSet<String>();
		
		// 객체 저장
		set.add("가");
		set.add("가"); // 중복 객체이므로 저장 X
		set.add("나");
		set.add("다");
		set.add("라");
		
		// 저장 객체 수 출력
		int size = set.size();
		System.out.println("set.size = " + size);
		
		// 객체 검색
		for(String elememt : set) {
			System.out.println(elememt);
		}
		
		
		
		System.out.println("-".repeat(50));
		Set<Member> set2 = new HashSet<Member>();
		
		// Member 객체 생성
		set2.add(new Member("최성식", 28)); 
		set2.add(new Member("최성식", 28));
		
		System.out.println("set2.size = " + set2.size());
	}

}
