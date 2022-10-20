import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PalindromePartition {
	
	static List<Integer> res;

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int testCases = in.nextInt();
		
		while (testCases-->0) {
			
			int n = in.nextInt();
			String str = in.next();
			
			res = new ArrayList<>();
			boolean isFound = false;
			
			for (int i=1; i<str.length()-1; i++) {
				if (!isPalindrome(str.substring(0, i))){
					res.add(i);
					if(backtrack(str.substring(i))) {
						for (int r:res) {
							System.out.print(r + " ");
						}
						System.out.println();
						isFound = true;
						break;
					}
					res.remove(res.size()-1);
				}
			}
			
			if (!isFound) {
				System.out.println(-1);
			}
			
			
		}
			

	}
	
	public static boolean backtrack(String str) {
		
//		System.out.println("log " + str);
		
		if (!isPalindrome(str)) {
			return true;
		}
		
		for (int i=1; i<str.length()-1; i++) {
			if (!isPalindrome(str.substring(0, i))){
				res.add(i);
				if(backtrack(str.substring(i))) {
					return true;
				}
				res.remove(res.size()-1);
			}
		}
		
		return false;
		
	}
	
	public static boolean isPalindrome(String str) {
		int left = 0;
		int right = str.length()-1;
		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			right--;
			left++;
		}
		return true;
	}

}
