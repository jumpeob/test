package test07;

public class ArrayTest {

	public static void main(String[] args) {
		int[] nums = new int[5];
		/*
		 * nums[0] = 5
		 * nums[1] = 10
		 * nums[2] = 15
		 * nums[3] = 20
		 * nums[4] = 25
		 */
		for(int i=0; i<nums.length; i++) {
			nums[i]=5*(i+1);
			
		}
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
