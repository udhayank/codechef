package codechef;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConfusingConcatination {

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
			
			String[] c = each[1].split(" ");
			List<Integer> a = new ArrayList<>();
			List<Integer> b = new ArrayList<>();
			 
			
			a.add(Integer.parseInt(c[0]));
			int ref = Integer.parseInt(c[0]);
			
			for (int i=1; i<c.length; i++) {
				
				int curr = Integer.parseInt(c[i]);
				
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
