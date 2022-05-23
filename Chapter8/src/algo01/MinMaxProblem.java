package algo01;

public class MinMaxProblem {

	public static void main(String[] args) {
		int[] nums = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45};
		
		int minimum = nums[0];
		int maximum = nums[0];
		int minPos = 0;
		int maxPos = 0;
		
		for(int i=1; i<nums.length; i++) {
			if(minimum > nums[i]) {
				minimum = nums[i];
				minPos = i+1;
			}
			
			if(maximum < nums[i]) {
				maximum = nums[i];
				maxPos = i+1;
			}
		}
		
		System.out.println(maximum + " " +maxPos);
		System.out.println(minimum + " " +minPos);
	}

}
