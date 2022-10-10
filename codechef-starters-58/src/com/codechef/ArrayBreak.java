package com.codechef;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayBreak {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int testCase = in.nextInt();
		
		String[][] inputs = new String[testCase][];
		
		for (int i=0; i<testCase; i++) {
			inputs[i] = new String[2];
		}
		
		in.nextLine();
		for (int i=0; i<testCase; i++) {
			String[] each = new String[2];			
			for (int j=0; j<2; j++) {
				inputs[i][j] = in.nextLine();
			}
			
		}
		
		for (String[] each:inputs) {
			
			List<Integer> nums = new ArrayList<>();
			for (String str:each[1].split(" ")) {
				nums.add(Integer.valueOf(str));
			}
			
			int oddCount = 0;
			for (int n:nums) {
				if (n%2!=0) {
					oddCount++;
				}
			}
			
			if (oddCount == 0 || oddCount == Integer.valueOf(each[0])) {
				System.out.println(0);
			} else {
				System.out.println(Integer.valueOf(each[0]) - oddCount);
			}
			
		}

	}

}
