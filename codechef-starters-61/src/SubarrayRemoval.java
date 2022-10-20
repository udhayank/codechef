import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubarrayRemoval {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int testCases = in.nextInt();
		
		while (testCases-->0) {
			
			int n = in.nextInt();
			List<Integer> list = new ArrayList<>();
			for (int i=0; i<n; i++) {
				list.add(in.nextInt());
			}
			
			int sum = 0;
			int index = 0;
			while (index < list.size()-1) {
				if (list.get(index) != list.get(index+1)) {
					sum++;
					list.remove(index);
					list.remove(index);
					if (index != 0) {
						index--;
					}
				} else {
					index++;
				}
			}
			
			if (list.size()>0 && list.get(0) == 1) {
				sum += list.size()/2;				
			}
			
			System.out.println(sum);
			
		}

	}

}
