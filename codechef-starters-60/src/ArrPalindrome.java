import java.util.Scanner;

public class ArrPalindrome {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int testCases = in.nextInt();
		
		while (testCases-->0) {
			
			int n = in.nextInt();
			
			int[] arr = new int[n];
			for (int i=0; i<n; i++) {
				arr[i] = in.nextInt();
			}
			
			boolean isFalse = false;
			int prev = Integer.MAX_VALUE;
			for (int i=0; i<arr.length/2; i++) {
				int curr = arr[n-i-1] - arr[i];
				if (curr < 0 || curr > prev) {
					System.out.println(-1);
					isFalse = true;
					break;
				}
				prev = curr;
			}
			
			if(isFalse) {
				continue;
			}
			
			System.out.println(arr[n-1]-arr[0]);
			
		}

	}

}
