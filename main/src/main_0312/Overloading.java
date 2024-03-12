package main_0312;


// 생성자 Overloading 예제.
public class Overloading {
	//필드 선언
	String nation = "대한민국";
	String area;
	int num;
	
	//생성자 선언
	Overloading() {}   // 1 생성자
	
	Overloading(String area) {	// 2 생성자
		this.area = area;
	}
	Overloading(String area, int num) {	// 3 생성자
		this.area = area;
		this.num = num;
	}	

	
}

	
	
	