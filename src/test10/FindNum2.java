package test10;

import java.util.Scanner;

public class FindNum2 {

	public static void main(String[] args) {
		int[][] nums = new int[3][3];
		nums[0] = new int[]{1,2,3};
		nums[1] = new int[]{4,5,6};
		nums[2] = new int[]{7,8,9};
		
		Scanner s = new Scanner(System.in);
		int num = Integer.parseInt(s.nextLine());
		// 5라고 입력하면 1층1번방 출력
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				if(num==nums[i][j]) {
					System.out.println(i+"층"+j+"번째방");
				
				}	
			}
		}
	}
}
