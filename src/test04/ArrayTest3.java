package test04;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		int[] nums = new int[3];
		//nums[] 는 int가 아니다. int를 넣을수 있는 배열이다.
		for(int i=0;i<nums.length ;i++) {
			nums[i]=(i+1)*3; 
		}
		for(int i=0;i<nums.length ;i++) {
			System.out.println("nums"+"["+i+"]"+"="+nums[i]);
		}
	}
}
//1byte = 8bit
//1bit가 표현할수있는 수는 0과 1(2진수다)