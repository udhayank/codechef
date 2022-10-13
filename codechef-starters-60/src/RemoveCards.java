import java.util.Scanner;

public class RemoveCards {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int testCases = in.nextInt();
		
		while (testCases-->0) {
			
			int n = in.nextInt();
			
			int[] count = new int[11];
			int max = 0;
			
			int i = n;
			while (i-->0) {
				
				int num = in.nextInt();
				count[num]++;
				if (count[num] > max) {
					max = count[num];
				}
				
			}
			
			System.out.println(n-max);
			
		}

	}

}
