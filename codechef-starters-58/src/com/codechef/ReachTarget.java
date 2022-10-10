package com.codechef;

import java.util.Scanner;

public class ReachTarget {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int testCase = in.nextInt();
		
		String[] inputs = new String[testCase];
		
		in.nextLine();
		for (int i=0; i<testCase; i++) {
			inputs[i] = in.nextLine();
		}
		
		for (String input:inputs) {		
			
			int target = Integer.parseInt(input.split(" ")[0]);
			int curr = Integer.parseInt(input.split(" ")[1]);
			System.out.println(target - curr);
			
		}
		

	}

}
