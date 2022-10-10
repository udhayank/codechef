package problems;

import java.util.Scanner;

public class TwosAndZeros {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int testCases = in.nextInt();
		
		for (int t=0; t<testCases; t++) {
			
			int n = in.nextInt();
			int m = in.nextInt();
			
			int count = 0;
			
			int twos = n;
			
			while (twos >= 3) {
				for (int i=1; i<=(twos-2); i++) {
					count += i;
				}
				twos -= 3;
			}
			
			System.out.println("twos " + count);
			
			while (n > 0 && m > 0) {
				count += (m*n);
			}
			
		}

	}

}
