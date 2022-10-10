package problems;

import java.util.Scanner;

public class BinarySubstitution {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int testCases = in.nextInt();
		
		for (int t=0; t<testCases; t++) {
			
			String binary = in.next();
			
			int temp = 1;
			int prev = 1;
			int curr = 1;
			
			for (int i=binary.length()-2; i>=0; i--) {
				
				if (binary.charAt(i) != binary.charAt(i+1)) {
					temp = curr;
					curr += prev;
					prev = temp;
				} else {
					prev = curr;
				}
				
				int mod = 998244353;
				temp %= mod;
				curr %= mod;
				prev %= mod;
				
			}
			
			System.out.println(curr);
			
		}
		
	}

}
