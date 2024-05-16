package main.java.generic;

public class HomeAgency implements Rentable<Home>{ // 타입 파라미터 P 를 Home 으로 대체
	@Override
	public Home rent() { // 리턴 타입 반드시 Home
		return new Home();
	}

}
