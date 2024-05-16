package main.java.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

import main.java.collection.ListCollection.ArrayListMcdonalds;

public class MapCollection {
	public void SampleAddMap() {
		Map<String, Integer> map = new HashMap<>();
		map.put("RG3", 28002600);
		map.put("CN2", 16002600);
		map.put("RS3", 28003100);
		map.put("NS4", 18001600);
		map.put("YF8", 18001120);
		System.out.println("Entry : " + map.size());

		System.out.println(map.get("NS4"));
	}

	public void SampleLoopMap() {
		Map<String, Integer> map = new HashMap<>();
		map.put("RG3", 28002600);
		map.put("CN2", 16002600);
		map.put("RS3", 28003100);
		map.put("NS4", 18001600);
		map.put("YF8", 18001120);
		System.out.println(map.keySet());
		Set<String> keySet = map.keySet();

		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String k = keyIterator.next();
			int v = map.get(k);
			System.out.println(k + " - " + v);
		}
	}

	public void SampleLoopMap2() {
		Map<Integer, String> map = new HashMap<>();
		map.put(2, "방배");
		map.put(1, "봉천");
		map.put(3, "서초");
		map.put(6, "잠실");
		map.put(4, "신촌");
		map.put(5, "구로");
		System.out.println(map);

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			Integer k = entry.getKey();
			String v = entry.getValue();
			System.out.println(k + " " + v);

		}
	}

	// Map > Mcdonals 객체 대입 및 name 출력
	public void SampleMap() {
		Map<Integer, ArrayListMcdonalds> map = new HashMap<>();
		map.put(1, new ArrayListMcdonalds("불고기버거", "버거", 3000));
		map.put(2, new ArrayListMcdonalds("콜라", "음료", 1500));
		map.put(3, new ArrayListMcdonalds("감자튀김", "디저트", 2000));

		for (Map.Entry<Integer, ArrayListMcdonalds> entry : map.entrySet()) {
			Integer k = entry.getKey();
			ArrayListMcdonalds v = entry.getValue();
			System.out.println(k + " " + v.getName());
		}

	}

	public void SampleTreeMap() {
		// TreeMap 생성
		TreeMap<Integer, String> treeMap = new TreeMap<>();

		// TreeMap Entry 객체 저장
		treeMap.put(1, "중식");
		treeMap.put(3, "한식");
		treeMap.put(4, "일식");
		treeMap.put(2, "양식");

		// 최소값 Map.Entry 리턴
		System.out.println(treeMap.firstEntry());
		// 최대값 Map.Entry 리턴
		System.out.println(treeMap.lastEntry());

		// 최소값 Map.key 리턴
		System.out.println(treeMap.firstKey());
		// 최대값 Map.key 리턴
		System.out.println(treeMap.lastKey());

		// 저장순서별 모든 키 포함 NavigableSet 반환
		System.out.println(treeMap.navigableKeySet());
	}

	public void SampleTreeMapNavi () {
		// NaviTreeMap 생성
		NavigableMap<Integer, String> NaviTreeMap = new TreeMap<>();
		
		// TreeMap Entry 객체 저장
		NaviTreeMap.put(1, "부산");
		NaviTreeMap.put(3, "대구");
		NaviTreeMap.put(2, "광주");
		NaviTreeMap.put(6, "서울");
		NaviTreeMap.put(5, "대전");
		NaviTreeMap.put(4, "울산");
		
		System.out.println(NaviTreeMap.descendingMap());
		System.out.println(NaviTreeMap.headMap(5));

		
		
	}
}
