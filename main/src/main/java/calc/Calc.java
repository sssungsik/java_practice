package main.java.calc;

import java.util.Scanner;

public class Calc  {
	public void calcc() {
		
		
		boolean calcStart = true;
		
		while (calcStart) {	
			Scanner scanner = new Scanner(System.in);
			String i = scanner.nextLine();
			String num1 = "";
			String num2 = "";
			
			
			if(i.contains("+") == true) {
			
				for(int j=0;j<i.indexOf("+");j++) {
				    num1 += i.charAt(j);
				   }
				
				for(int k=i.indexOf("+") + 1; k < i.length(); k ++) {
				    num2 += i.charAt(k);
				   }
					
				int num1Int = Integer.parseInt(num1);
				int num2Int = Integer.parseInt(num2);
				System.out.println(num1Int + num2Int);
				
			} else if(i.contains("-") == true) {
				for(int j=0;j<i.indexOf("-");j++) {
				    num1 += i.charAt(j);
				   }
				
				for(int k=i.indexOf("-") + 1; k < i.length(); k ++) {
				    num2 += i.charAt(k);
				   }
					
				int num1Int = Integer.parseInt(num1);
				int num2Int = Integer.parseInt(num2);
				System.out.println(num1Int - num2Int);
			} else if(i.contains("/") == true) {
				for(int j=0;j<i.indexOf("/");j++) {
				    num1 += i.charAt(j);
				   }
				
				for(int k=i.indexOf("/") + 1; k < i.length(); k ++) {
				    num2 += i.charAt(k);
				   }
					
				int num1Int = Integer.parseInt(num1);
				int num2Int = Integer.parseInt(num2);
				System.out.println(num1Int / num2Int);
			} else if(i.contains("*") == true) {
				for(int j=0;j<i.indexOf("*");j++) {
				    num1 += i.charAt(j);
				   }
				
				for(int k=i.indexOf("*") + 1; k < i.length(); k ++) {
				    num2 += i.charAt(k);
				   }
					
				int num1Int = Integer.parseInt(num1);
				int num2Int = Integer.parseInt(num2);
				System.out.println(num1Int * num2Int);
			} else 
				System.out.println("없음");
		}
	}

}
