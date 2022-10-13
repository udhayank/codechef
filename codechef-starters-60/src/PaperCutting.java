import java.util.Scanner;

public class PaperCutting {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int testCases = in.nextInt();
		
		while (testCases-->0) {
			
			int n = in.nextInt();
			int k = in.nextInt();
			
			int s = n/k;
			
			System.out.println(s*s);
			
		}

	}

}
