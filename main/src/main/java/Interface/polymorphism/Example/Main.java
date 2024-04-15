package main.java.Interface.polymorphism.Example;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Burger burger = new Burger();
		Beef beef = new Beef();
		Chicken chicken = new Chicken();
		
		choosePatty(chicken);
		
	}
	public static void choosePatty(Cook cook) {
		cook.putPatty();
		if (cook instanceof Beef beef) {
			beef.putSauce();
		} else if (cook instanceof Chicken chicken) {
			chicken.putSauce();
		}
	
	}

}
