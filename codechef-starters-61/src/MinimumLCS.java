import java.util.Scanner;

public class MinimumLCS {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int testCases = in.nextInt();
		
		while (testCases-->0) {
			
			int n = in.nextInt();
			String str1 = in.next();
			String str2 = in.next();
			
			int[] count1 = new int[26];
			int[] count2 = new int[26];
			
			for (char ch:str1.toCharArray()) {
				count1[ch-'a']++;
			}
			for (char ch:str2.toCharArray()) {
				count2[ch-'a']++;
			}
			
			int max = 0;
			for (int i=0; i<26; i++) {
				int count = Math.min(count1[i], count2[i]);
				if (count > max) {
					max = count;
				}
			}
			
			System.out.println(max);
			
		}

	}

}
