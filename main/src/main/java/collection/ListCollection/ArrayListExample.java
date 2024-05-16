package main.java.collection.ListCollection;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	
	// List 컬렉션 : 객체를 인덱스로 관리, 객체 저장 시 인덱스 부여. 인덱스로 객체 검색 및 삭제 기능
	// List 컬렉션 : ArrayList, Vector, LinkedList 등
	
	// ArrayList : List 컬렉션에서 가장 많이 사용.
	// ArrayList : 객체 추가 시 내부배열에 객체 저장.
	// ArrayList : 일반 배열과 차이는 제한 없이 객체 추가 가능.
	// List<E> list = new ArrayList<E>(); : E에 지정된 타입의 객체만 저장
	// List<E> list = new ArrayList<>(); : E에 지정된 타입의 객체만 저장 (지정 객체 타입과 동일하면 생략)
	// List list = new ArrayList(); : 모든 타입의 객체만 저장
	// 특정 인덱스 제거 시 앞으로 1씩 당겨짐. 삽입 시에도 동일.
	
	

	public static void main(String[] args) {
		// ArrayList 컬렉션 생성
		List<ArrayListMcdonalds> list = new ArrayList<>();
		
		// 객체 추가
		list.add(new ArrayListMcdonalds("Bulgoki Burger", "Hamburger", 5000));
		list.add(new ArrayListMcdonalds("Soda", "Beverage", 2000));
		list.add(new ArrayListMcdonalds("Shrimp Burger", "Hamburger",5000));
		list.add(new ArrayListMcdonalds("French Fries", "Disert", 1500));
	
		
		// 저장된 총 객체 수 얻기
		int size = list.size();
		System.out.println("총 객체 수 : " + size);
		
		// 특정 인덱스 객체 가져오기
		ArrayListMcdonalds board = list.get(2);
		System.out.println(board.getName());
		System.out.println(board.getType());
		System.out.println(board.getPrice());
		
		// 객체 삭제
		list.remove(2);
		
		// 모든 객체 하나씩 가져오기 (for 문)
		System.out.println("-----------MENU---------");
		for (int i = 0; i<list.size(); i++) {
			ArrayListMcdonalds b = list.get(i);
			System.out.println(i + ". " + b.getName() + " [" + b.getType()  + "] "  + b.getPrice() + "원");
		}
		System.out.println("-----------------------");
		
		
		

	}

}
