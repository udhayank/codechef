package codechef;

import java.util.Arrays;
import java.util.Scanner;

public class SuspenseString {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int testCase = in.nextInt();
		
		String[][] inputs = new String[testCase][];
		
		for (int i=0; i<testCase; i++) {
			inputs[i] = new String[2];
		}
		
		in.nextLine();
		for (int i=0; i<testCase; i++) {
			String[] each = new String[2];			
			for (int j=0; j<2; j++) {
				inputs[i][j] = in.nextLine();
			}
			
		}
		
		for (String[] each:inputs) {
			
			String str = each[1];
			String res = "";
			
			int alice = 0;
			int bob = str.length()-1;
			
			while (alice <= bob) {
				
				// Alice turn
				if (str.charAt(alice) == '0') {
					res = "0" + res;
				} else {
					res = res + "1";
				}
				alice++;
				
				if (!(alice <= bob)) {
					break;
				}
				
				// Bobs turn
				if (str.charAt(bob) == '0') {
					res = res + "0";
				} else {
					res = "1" + res;
				}
				bob--;
			}
			
			System.out.println(res);
			
		}

	}

}
