package com.codechef;

import java.util.Scanner;

public class RanklistPages {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int testCase = in.nextInt();
		
		String[] inputs = new String[testCase];
		
		in.nextLine();
		for (int i=0; i<testCase; i++) {
			inputs[i] = in.nextLine();
		}
		
		for (String input:inputs) {		
			
			int rank = Integer.parseInt(input);
			System.out.println(((rank-1)/25)+1);
			
		}

	}

}
