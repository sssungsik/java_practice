package main.java.Interface.polymorphism.Example;

public class Chicken implements Cook{
	@Override
	public void putPatty() {
		System.out.println("닭고기 패티 삽입");
	}
	
	public void putSauce() {
		System.out.println("닭고기 소스 뿌림");
	}

}
