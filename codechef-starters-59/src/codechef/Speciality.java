package codechef;

import java.util.Scanner;

public class Speciality {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int testCase = in.nextInt();
		
		String[] inputs = new String[testCase];
		
		in.nextLine();
		for (int i=0; i<testCase; i++) {
			inputs[i] = in.nextLine();
		}
		
		for (String input:inputs) {
			String[] split = input.split(" ");
			int a = Integer.parseInt(split[0]);
			int b = Integer.parseInt(split[1]);
			int c = Integer.parseInt(split[2]);
			
			if (a > b && a > c) {
				System.out.println("Setter");
			} else if (b > a && b > c) {
				System.out.println("Tester");
			} else {
				System.out.println("Editorialist");
			}
		}
		
	}
	
}
