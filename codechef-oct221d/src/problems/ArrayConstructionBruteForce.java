package problems;

import java.util.Arrays;

public class ArrayConstructionBruteForce {

	public static void main(String[] args) {		
		
		for (int m=1; m<=6; m++) {
			System.out.println(new ArrayConstructionBruteForce().totalBitwiseAnd(m,2));
		}
		

	}
	
	public int totalBitwiseAnd(int m, int n) {
		
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
