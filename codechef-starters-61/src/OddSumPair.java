import java.util.Scanner;

public class OddSumPair {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int testCases = in.nextInt();
		
		while (testCases-->0) {
			
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			
			if ( a%2 == 0 && (b%2 != 0 || c%2 != 0) ) {
				System.out.println("YES");
			} else if ( a%2 != 0 && (b%2 == 0 || c%2 == 0) ) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			
		}	

	}

}
