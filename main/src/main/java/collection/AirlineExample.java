package main.java.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirlineExample {

	public static void main(String[] args) {
	
		System.out.println("-------성식 AirLine-------");
		List<String> list = new ArrayList<String>();
		List<Airline> airline = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("English(1)  한국어(2)");
		System.out.println("-------------------------");
		int lang = scanner.nextInt();
		
			switch (lang) {
				case 1:
					list.add("US");
					list.add("South Korea");
					list.add("Japan");
					list.add("China");
					
					System.out.println("Hi there!");
					System.out.println();
					System.out.println("-------------------");
					System.out.println("US(1)  South Korea(2)  Japan(3)  China(4)");
					System.out.println("-------------------");
					System.out.printf("Please insert your Departure NUM: ");
					int departEN = scanner.nextInt();
					System.out.println("DEPARTURE - " + list.get(departEN -1));
					System.out.printf("Please insert your Arrival NUM: ");
					int arrivEN = scanner.nextInt();
					System.out.println("ARRIVAL - " + list.get(arrivEN -1));
					
					airline.add(new Airline(departEN, arrivEN));
					System.out.println(airline);
					
					
					break;
					
				case 2:	
					list.add("미국");
					list.add("한국");
					list.add("일본");
					list.add("중국");
		
					System.out.println("안녕하세요!");
					System.out.println();
					System.out.println("-------------------");
					System.out.println("미국(1)  한국(2)  일본(3)  중국(4)");
					System.out.println("-------------------");
					System.out.printf("출발 국가번호 입력하세요 : ");
					int departKO = scanner.nextInt();
					System.out.println("출발 - " + list.get(departKO -1));
					System.out.printf("도착 국가번호 입력하세요 : ");
					int arrivKO = scanner.nextInt();
					System.out.println("도착 - " + list.get(arrivKO -1));
					
					airline.add(new Airline(departKO, arrivKO));
					
					break;
				
				default:
					System.out.println("ERROR!!!!! PLEASE INSERT 1 OR 2 !!!!!");
					
					break;
			}
		
		
		
		
		
		
	}

}
