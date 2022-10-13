import java.util.Scanner;

public class PalindromeFlipping {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int testCases = in.nextInt();
		
		while (testCases-->0) {
			
			int n = in.nextInt();
			String str = in.next();
			
			if (n%2!=0) {
				System.out.println("YES");
				continue;
			}
			
			str = str.replaceAll("1", "");
			
			if (str.length()%2==0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			
		}

	}

}
