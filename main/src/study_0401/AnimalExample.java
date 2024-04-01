package study_0401;

public class AnimalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat();
		cat.animalSound();
		cat.animalName();
		Dog dog = new Dog();
		dog.animalSound();
		dog.animalName();
		
		// 자동타입반환
		Animal animal = cat;
		animal.animalName();
		animal.animalSound();
		// animal.catJump();  호출 불가 
		
		Cat cat2 = (Cat) animal;
		cat2.animalName();
		cat2.animalSound();
		
	}

}
