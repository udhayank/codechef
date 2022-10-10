package codechef;

import java.util.Scanner;

public class AudibleRange {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int testCase = in.nextInt();
		
		String[] inputs = new String[testCase];
		
		in.nextLine();
		for (int i=0; i<testCase; i++) {
			inputs[i] = in.nextLine();
		}
		
		for (String input:inputs) {
			int num = Integer.parseInt(input);
			if (num >= 67 && num <= 45000) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		
	}
	
}
