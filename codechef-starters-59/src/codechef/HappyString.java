package codechef;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class HappyString {

	public static void main(String[] args) {
		
		HashSet<Character> set = new HashSet<>();
		set.addAll(List.of('a','e','i','o','u'));
		
		Scanner in = new Scanner(System.in);
		
		int testCase = in.nextInt();
		
		String[] inputs = new String[testCase];
		
		in.nextLine();
		for (int i=0; i<testCase; i++) {
			inputs[i] = in.nextLine();
		}
		
		for (String input:inputs) {
			
			int count = 0;
			boolean isHappy = false;
			for (char ch:input.toCharArray()) {
				if (set.contains(ch)) {
					count++;
					if (count > 2) {
						System.out.println("Happy");
						isHappy = true;
						break;
					}
				} else {
					count = 0;
				}
			}
			
			if (!isHappy) {
				System.out.println("Sad");				
			}
			
		}
		

	}

}
