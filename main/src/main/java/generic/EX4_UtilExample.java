package main.java.generic;

public class EX4_UtilExample {
// 다음 Util 클래스의 정적 getValue 메소드는 첫 번째 매개값으로 Pair 타입과 하위 타입만 받고,
// 두 번째 매개값으로 키 값을 받는다.
// 리턴값은 키값이 일치할 경우 Pair 에 저장된 값을 리턴하고, 일치하지 않으면 null 리턴하도록 Util 클래스와 getValue 제네릭 메서드 작성하라.
	
	
	
	public static void main(String[] args) {
		EX4_Pair<String, Integer> pair = new EX4_Pair<>("홍길동",35);
		Integer age = EX4_Util.getValue(pair, "홍길동");
		System.out.println(age);
		
		EX4_ChildPair<String, Integer> Childpair = new EX4_ChildPair<>("홍승윤",3);
		Integer Childage = EX4_Util.getValue(pair, "홍승윤");
		System.out.println(Childage);
	}

}
