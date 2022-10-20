import java.util.Scanner;

public class DifferentConsecutiveCharacters {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int testCases = in.nextInt();
		
		while (testCases-->0) {
			
			int n = in.nextInt();
			String str = in.next();
			
			int count = 0;
			for (int i=1; i<n; i++) {
				if (str.charAt(i) == str.charAt(i-1)) {
					count++;
				}
			}
			
			System.out.println(count);
			
		}
			

	}

}
