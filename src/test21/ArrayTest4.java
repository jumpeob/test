package test21;

public class ArrayTest4 {


	public static void main(String[] args) {
		int[] nums = new int[0];
		nums = ArrayUtill.add(nums,5);
		nums = ArrayUtill.add(nums,10);
		nums = ArrayUtill.add(nums,15);
		nums = ArrayUtill.add(nums,20);
		nums = ArrayUtill.add(nums,25);
		System.out.println("요것은 늘린거");
		ArrayUtill.printArray(nums);
		
		
		nums=ArrayUtill.remove(nums);
		nums=ArrayUtill.remove(nums);
		nums=ArrayUtill.remove(nums);
		System.out.println("요것은 쭐인거");
		ArrayUtill.printArray(nums);
	}	
}
