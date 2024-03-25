package main_0325;

public class StudySample {

	public static void main(String[] args) {
		// 객체 생성
		Study study1 = new Study("김",13);
		Study study2 = new Study("박", 12312321); // 생성자 오버로딩 (생성자 여러 개 생성하는 것)
		
	
		// 객체 필드 값 읽기
		System.out.println("고유데이터" +study1.from + "- " + study1.model);
		System.out.println(study1.nu);
	
		System.out.println("고유데이터" +study2.from + "- " + study2.model);
		System.out.println(study2.nu);
		
		
		
		// 객체 필드 값 변경
		study1.nu = 4441;
		System.out.println(study1.nu);
		
		// 메소드 호출
		
		study1.start();
		int result1 = study1.work(5, 5);
		System.out.println(result1);
		int result2 = study1.work(15, 5);
		System.out.println(result2);
		String result3 = study1.work(15, 5, "개");
		System.out.println(result3);
		Study2 st2 = new Study2();
		double result4 = 10 * Study2.pi;
		System.out.println(Study2.info);
		
		

	}

}
