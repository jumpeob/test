package test09;

public class MultipleArray {

	public static void main(String[] args) {
		//다중배열
		/*
		 * 1차원배열은 방 갯수를 무조권 알려줘야한다 [방갯수] ->[] 불가능
		 * 2차원부터는 안알려줘도 괜찮다 [층][방갯수] ->[3][] 가능
		 * 
		 * nums[0][0] = 1
		 * nums[0][1] = 2 -> nums[0][0]+1
		 * nums[0][2] = 3 -> nums[0][1]+1
		 * nums[1][0] = 4 -> nums[0][2]+1
		 * nums[1][1] = 5 -> nums[1][0]+1
		 * nums[1][2] = 6 -> nums[1][1]+1
		 * nums[2][0] = 7 -> nums[1][2]+1
		 * nums[2][1] = 8 -> nums[2][0]+1
		 * nums[2][2] = 9 -> nums[2][1]+1
		 * 
		 */
		
		int[][] nums = new int[3][3];
		int num = 1;
		for(int i=0; i<nums.length; i++) {
			for(int j=0;j<nums[i].length;j++) {
				
				nums[i][j]= num++;
			}
		}
		for(int i=0; i<nums.length; i++) {
			for(int j=0;j<nums[i].length;j++) {
				System.out.println(nums[i][j]);
			}
		}
	}
}
