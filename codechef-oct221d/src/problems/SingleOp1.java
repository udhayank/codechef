package problems;

import java.util.Scanner;

public class SingleOp1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int testCases = in.nextInt();
		
		for (int t=0; t<testCases; t++) {
			
			int n = in.nextInt();
			String binStr = in.next();
			
			int y=0;
			for (char ch:binStr.toCharArray()) {
				if (ch == '0') {
					break;
				}
				y++;
			}
			
			System.out.println(y==0?1:y);
			
		}
		
		in.close();

	}

}
