package main.java.generic;



public class EX3_ContainerExample {

	public static void main(String[] args) {
		EX3_Container<String, String> container1 = new EX3_Container<String, String>();
		container1.set("최성식", "도적");
		String name1 = container1.getKey();
		String job = container1.getValue();
		
		EX3_Container<String, Integer> container2 = new EX3_Container<String, Integer>();
		container1.set("최성식", "28");
		String name2 = container1.getKey();
		String age = container1.getValue();

	}

}
