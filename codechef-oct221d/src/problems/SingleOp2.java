package problems;

import java.util.Scanner;

public class SingleOp2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int testCases = in.nextInt();
		
		for (int t=0; t<testCases; t++) {
			
			int n = in.nextInt();
			String binStr = in.next();
			
			int y=1;
			for (int ch=1; ch<binStr.length(); ch++) {
				if (binStr.charAt(ch) == '1') {
					break;
				}
				y++;
			}
			
			System.out.println(y);
			
		}
		
		in.close();

	}

}
