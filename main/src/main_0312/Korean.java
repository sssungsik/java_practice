package main_0312;


public class Korean {
	//필드 선언
	String nation = "대한민국";
	String name;
	String ssn;
	
	//생성자 선언
	public Korean(String n, String s) {
		this.name = n;
		this.ssn = s;
		
		System.out.println("국가 : " + nation);
		System.out.println("이름 : " + name);
		System.out.println("번호 : " + ssn);
	}
}
