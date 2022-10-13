import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DistinctNumbers {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int testCases = in.nextInt();
		
		while (testCases-->0) {
			
			int n = in.nextInt();
			int k = in.nextInt();
			
			List<Integer> nums = new ArrayList<>(n);
			
			int i=n;
			while (i-->0) {
				nums.add(in.nextInt());
			}
			
			nums.sort((a,b)->Integer.compare(a, b));
			
			int count = 0;
			int index = 0;
			int max = nums.get(n-1);
			int missing = 0;
			boolean isOver = false;
			while (k-->0) {
				if (nums.get(0) > 1) {
					missing = 1;					
				} else if (n>1) {
					while (nums.get(index+1) - nums.get(index) != 1) {
						index++;
						if (index == nums.size()-1) {
							int s = (2*n-nums.get(index));
							count += ((s+1)*(s))/2;
							isOver = true;
							break;
						} else {
							missing = nums.get(index)+1;
							System.out.println("missing "+missing);
							nums.add(index, missing);
							count += max-missing;
						}
					}
					if (isOver) {
						break;
					}
				} else {
					
				}
			}
			
			System.out.println(count);
			
		}
	}
	
}
