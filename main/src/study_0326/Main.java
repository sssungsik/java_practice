package study_0326;

public class Main {

	public static void main(String[] args) {
			Arr arr = new Arr();
			arr.refer3();
			arr.refer4();
			arr.refer5();
			arr.refer1();
			arr.refer2();
			arr.refer6();
			arr.refer7();
			arr.refer8();
			arr.refer9();
			arr.refer10();
			arr.refer11();
			arr.refer12();
			arr.refer13();
			arr.test1();
			arr.test2();
			arr.study1();
			arr.test3();
			int[] arr2 = {10,30,60};
			
			int sum = 0;
			for (int i = 0; i < arr2.length; i++) {
				sum += arr2[i];
			}
			System.out.println("총합" + sum);
			double avg = (double) sum / arr2.length;
			System.out.println(avg);
	}
}


