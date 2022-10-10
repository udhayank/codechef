package com.codechef;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class RemoveBad {

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
			
			HashMap<String, Integer> count = new HashMap<>();
			String[] arr = each[1].split(" ");
			String max = arr[0];
			int maxCount = 0;
			
			for (String num:arr) {
				count.put(num, count.getOrDefault(num, 0) + 1);
				if (count.get(num) > maxCount) {
					maxCount = count.get(num);
					max = num;
				}
			}
			
			System.out.println(Integer.valueOf(each[0]) - maxCount);
		}

	}

}
