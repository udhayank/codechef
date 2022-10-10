package codechef;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSubarray {
	
	static int max;

	public static void main(String[] args) {
		
		MaximumSubarray maxsub = new MaximumSubarray();
		
		Scanner in = new Scanner(System.in);
		
		int testCase = in.nextInt();
		
		for (int i=0; i<testCase; i++) {
			
			max = Integer.MIN_VALUE;
			
			int len = in.nextInt();
			int[] input = new int[len];
			
			for (int j=0; j<len; j++) {
				input[j] = in.nextInt();
			}
			
			len = in.nextInt();
			int[] b = new int[len];
			for (int j=0; j<len; j++) {
				b[j] = in.nextInt();
			}
			
						
			maxsub.findMax(input, b);
			
			System.out.println(max);
			
		}

	}
	
	public void findMax(int[] nums, int[] b) {
		
		if (b.length == 0) {
			int currMax = maxSubArray(nums);
//			System.out.println("currmax " + currMax);
			if (currMax > max) {
				max = currMax;
			}
			return;
		}
						
		int[] newArr1 = new int[nums.length+1];
		newArr1[0] = b[0];
		for (int i=0; i<nums.length; i++) {
			newArr1[i+1] = nums[i];
		}
		findMax(newArr1, Arrays.copyOfRange(b, 1, b.length));
		
		int[] newArr2 = new int[nums.length+1];
		newArr1[nums.length] = b[0];
		for (int i=0; i<nums.length; i++) {
			newArr2[i] = nums[i];
		}
		findMax(newArr2, Arrays.copyOfRange(b, 1, b.length));
		
		int[] newArr3 = new int[nums.length+1];
		newArr3[0] = b[b.length-1];
		for (int i=0; i<nums.length; i++) {
			newArr3[i+1] = nums[i];
		}
		findMax(newArr3, Arrays.copyOfRange(b, 0, b.length-1));
		
		int[] newArr4 = new int[nums.length+1];
		newArr4[nums.length] = b[b.length-1];
		for (int i=0; i<nums.length; i++) {
			newArr4[i] = nums[i];
		}
		findMax(newArr4, Arrays.copyOfRange(b, 0, b.length-1));		
		
	}
	
	public int maxSubArray(int[] nums) {
        
        int currMax = nums[0];
        int maxSum = nums[0];
        
        for (int i=1; i<nums.length; i++){
            currMax = nums[i] > currMax + nums[i] ? nums[i] : currMax + nums[i];
            if (currMax > maxSum){
                maxSum = currMax;
            }
        }
        
        return maxSum;
        
    }

}
