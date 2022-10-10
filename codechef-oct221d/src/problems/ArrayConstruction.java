package problems;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayConstruction {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int testCases = in.nextInt();
		
		for (int t=0; t<testCases; t++) {
			
			int n = in.nextInt();
			int m = in.nextInt();
			
			int sum = 0;
			
			int factor = 2*((n+1)/2);
			for (int i=1; i<=m; i++) {
				sum += i*factor;
			}
			
			System.out.println(sum);
			
		}
		
		in.close();

	}
	
	public static int totalBitwiseAnd(int m, int n) {
		
		int sum = 0;
		
		int[] arr = new int[m];
		Arrays.fill(arr, 1);
		
		int index = arr.length-1;
		
		while (true) {
			
			 int and = arr[0];
			 for (int i=1; i<arr.length; i++) {
				 and &= arr[i];
			 }
			 
			 sum += and;
			 arr[index]++;
			 while (arr[index] > n) {
				 arr[index] = 1;
				 index--;
				 if (index < 0) {
					 sum %= 998244353;
					 return sum;
				 }
				 arr[index]++;
			 }
			 
			 index = arr.length-1;
			 
			 sum %= 998244353;
			
		}
		
	}

}
