package main.java.collection.MapCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<>();
		/* Map<키 타입, 값 타입> map = new HashMap<>(); */
		
		// 객체 저장
		map.put("가", 01);
		map.put("나", 02);
		map.put("가", 03); /* 키가 같기 때문에 마지막 저장한 값만 저장 */
		map.put("다", 04);
		System.out.println("총 엔트리 수 : " + map.size());
		
		// 키로 값 얻기
		String key = "가";
		int value = map.get(key);
		System.out.println(key + " : " + value);
		System.out.println("-".repeat(50));
		
		// 키 Set 컬렉션 얻고, 반복해서 키와 값 얻기
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String k = keyIterator.next();
			Integer v = map.get(k);
			System.out.println(k + " " + v);
		}
		System.out.println("-".repeat(50));
	}

}
