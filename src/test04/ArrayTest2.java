package test04;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		int[] nums = new int[30];
		
		for(int i=0;i<nums.length ;i++ ) {
			nums[i] = i+1;
			
		}
		
		for(int i=0;i<nums.length ;i++ ) {
			if(nums[i]%3==0) {
				System.out.println("짝");
			}
			else {
				System.out.println(nums[i]);
			}

		}
	}
}
