package test08;

public class MatchNumber2 {

	public static void main(String[] args) {
		int[] nums = {1,2,3,1,1,2,4};
		int num = 1 ;
		int count = 0;
		boolean bls = false;
		for(int i=0; i<nums.length; i++) {
			if(nums[i]==num) {
				count = count+1;
				bls = true;
			}
		}
		if(bls){
			System.out.println(count);
		}
		else{
		System.out.println("없다");
		}
	}
}
