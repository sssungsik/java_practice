package main.java.generic;

public class GenericExample{

	public static void main(String[] args) {
		Box<String> box1 = new Box<>();
		
		// Box 생성 시 T 타입 String 으로 대체
		box1.content = "최성식";
		String str = box1.content;
		System.out.println(str);
		// Box 생성 시 T 타입 Integer 로 대체
		Box<Integer> box2 = new Box<>();
		box2.content = 28;
		int value = box2.content;
		System.out.println(value);
		
		
		// K는 Tv 로 대체, M은 String 으로 대체
		Product<Tv, String> product1 = new Product<>();
		
		// Setter 매개값은 반드시 Tv 와 String 제공
		product1.setKind(new Tv());
		product1.setModel("테래비 1 ");
		
		// Getter 리턴값은 Tv 와 String 이 됨
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		// K 는 Car 로 대체, M 은 String 으로 대체
		Product<Car, String> product2 = new Product<>();
		
		// Setter 매개값은 반드시 Car 와 String 제공
			product2.setKind(new Car());
			product2.setModel("자동차 1 ");
				
		// Getter 리턴값은 Tv 와 String 이 됨
			Car car = product2.getKind();
			String carModel = product2.getModel();
			
			
		
		HomeAgency homeAgency = new HomeAgency();
		Home home = homeAgency.rent();
		home.turnOnLight();
		
		CarAgency carAgency = new CarAgency();
		Car car2 = carAgency.rent();
		car2.run();
		
		Box box3 = new Box();
		box3.content = "123";
		
		Box box4 = new Box();
		box4.content = "123";
		
		Box box5 = new Box();
		box5.content = 123;
		
		boolean result1 = box3.compare(box4);
		System.out.println(result1 + "결과1");
		boolean result2 = box3.compare(box5);
		System.out.println(result2 + "결과2");
		
		// 제네릭 메소드 호출
		Box<Integer> box6 = boxing(999);
		int intValue = box6.get();
		System.out.println(intValue);
		Box<String> box7 = boxing("홍길동");
		String strValue = box7.get();
		System.out.println(strValue);
		
		// 제네릭 메소드 호출 2
		boolean result3 = compare(10, 20);
		System.out.println(result3);
		boolean result4= compare(4.5, 4.5);
		System.out.println(result4);
		
	}	
	
	public static <T> Box<T> boxing (T t) {
			Box<T> box = new Box<T>();
			box.set(t);
			return box;
		}
	
	// 제한된 타입 피라미터를 갖는 제네릭 메소드
	public static <T extends Number> boolean compare(T t1, T t2) {
		// T 타입 출력
		System.out.println("compare(" + t1.getClass().getSimpleName() + ", " + t2.getClass().getSimpleName() + ")");
		
		// Number 메소드 사용
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		
		return (v1 == v2);
	}
	

}
