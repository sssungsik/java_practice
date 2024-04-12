package main.java.inheritance;

public class ChildExample {

	public static void main(String[] args) {
		// 자식 객체 생성
		Child child = new Child();
		
		// 자동 타입 변환
		Parent parent = child;
		
		parent.method1();
		parent.method2();
		// parent.method3(); 호출 불가
		
		
		// 객체 생성 및 자동 타입 반환
		Parent parent2 = new Child();
		
		// Parent2 타입으로 필드,메서드 사용
		parent2.field1 = "data1";
		parent2.method4();
		parent2.method5();
		
		// 강제 타입 변환
		Child child2 = (Child) parent;
		
		child2.field2 = "data2";
		child2.method3();

	}

}
