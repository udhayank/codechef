package problems;

import java.util.Scanner;

public class Podium {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int testCases = in.nextInt();
		
		for (int t=0; t<testCases; t++) {
			
			int a = in.nextInt();
			int b = in.nextInt();
			
			System.out.println(a+b);
			
		}

	}

}
