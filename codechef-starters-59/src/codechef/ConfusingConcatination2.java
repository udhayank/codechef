package codechef;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConfusingConcatination2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int testCase = in.nextInt();
		
		for (int i=0; i<testCase; i++) {
			
			int len = in.nextInt();
			int[] input = new int[len];
			
			List<Integer> a = new ArrayList<>();
			List<Integer> b = new ArrayList<>();
			
			a.add(in.nextInt());
			int ref = a.get(0);
			
			for (int j=1; j<len; j++) {
//				input[j] = in.nextInt();
				
				int curr = in.nextInt();
				
				if (curr > ref) {
					// swap a and b and enter into a
					List<Integer> temp = a;
					a = b;
					b = temp;
					a.add(curr);
					
					// change ref
					ref = curr;
					
				} else {
					// add into a
					a.add(curr);
				}
				
			}
			
			if (a.size() == 0 || b.size() == 0) {
				System.out.println(-1);
				continue;
			}
			
			System.out.println(a.size());
			for (int e:a) {
				System.out.print(e + " ");
			}
			System.out.println();
			System.out.println(b.size());
			for (int e:b) {
				System.out.print(e + " ");
			}
			System.out.println();
			
		}
		
		
		
	}
	
}
