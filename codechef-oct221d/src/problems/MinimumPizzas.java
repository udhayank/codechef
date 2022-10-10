package problems;

import java.util.Scanner;

public class MinimumPizzas {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int testCases = in.nextInt();
		
		for (int t=0; t<testCases; t++) {
			
			int n = in.nextInt();
			int s = in.nextInt();
			
			if ((n*s)%4 == 0) {
				System.out.println((n*s)/4);
			} else {
				System.out.println((n*s)/4 + 1);
			}
			
		}

	}

}
