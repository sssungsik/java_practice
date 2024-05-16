package main.java.Class;

//메서드 Overloading 예제.
	public class Overloading2 {
		//정사각형의 넓이
		double result(double x) {
			return x * x;
		}
		
		//직사각형의 넓이
		double result(double x, double y) {
			return x * y;
		}
	}