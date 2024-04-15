package main.java.Interface.polymorphism.Example;

public class Beef implements Cook{
	@Override
	public void putPatty() {
		System.out.println("소고기 패티 삽입");
	}
	
	public void putSauce() {
		System.out.println("소고기 소스 뿌림");
	}

}
