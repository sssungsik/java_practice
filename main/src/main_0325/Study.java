package main_0325; // 패키지 선언

public class Study { // 클래스 선언
			   	/* 클래스명 첫 글자 대문자, CamelStyle (변수는 소문자)
					 첫 글자 숫자(X) 	
					 공개 클래스는 1개만 가능
					 공개 클래스 : 어느 위치에 있던 패키지와 상관없이 사용할 수 있는 클래스
	
			 	라이브러리 클래스 : 실행(X) 다른 클래스에서 이용하는 클래스
			 	실행 클래스 : main()메소드를 가지고 있는 실행가능 클래스
	
	
		 		int fieldName; 필드 (객체 데이터 저장)
		
				Study()  {}  생성자 (객체 생성 시 초기화 역할)
		
		 		int methodName() {} 메소드 (객체의 동작, 호출 시 실행)
	
	
		*필드와 변수의 차이*
	    [필드] : 클래스 선언 블록에서 선언, 객체 내 외부 어디든 사용 / [변수] : 생성자, 메소드블록에서 선언 및 사용
	    */
	
		// 필드 선언
		String from = "K"; // 고유 데이터 필드
		String model; // 상태 데이터 필드
		int nu; // 상태 데이터 필드
		int finish;
		
		// 생성자 선언 
		public Study(String model, int nu) {
			this.model = model; // 매개변수명이 필드명과 동일하기 때문에 this 
			this.nu = nu;
		}
		
		/* <메소드 선언>
		 리턴타임 메소드명 (매개변수,...) {
		 * 실행 코드 작성
		 * }
		 * 
		 * 메소드명 : 첫 문자 소문자
		 */
		void start() { // 리턴 값 없는 메소드 선언
			System.out.println("공부 시작");
		} 
		int work(int x, int y) {	// int 값 리턴하는 메소드 선언 -> return 문으로 반드시 지정
			return x + y;
		} 
		String work(int x, int y, String z) {	// 메소드 오버로딩
			return	(x + y) + z;
		} 
		

	
		
		
}