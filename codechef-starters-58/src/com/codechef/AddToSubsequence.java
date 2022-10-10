package com.codechef;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class AddToSubsequence {

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
			
			Set<Integer> set = new HashSet<>();
			set.addAll(nums);
			
			if (nums.size() == set.size()) {
				System.out.println(0);
				continue;
			}
			
			int maxCount = nums.size() - set.size();
			
			set.clear();
			int count = 0;
			for (int n:nums) {
				if (!set.add(n)) {
					count++;
					set.clear();
					set.add(n);
				}
			}
			
			System.out.println(count < maxCount ? count : maxCount);
			
		}

	}

}
