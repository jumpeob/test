package test21;

public class ArrayTest2 {
	

	public static void main(String[] args) {
		
		String[] strs = new String[0];
		strs = ArrayUtill.add(strs,"하나");
		strs = ArrayUtill.add(strs,"둘");
		strs = ArrayUtill.add(strs,"셋");
		strs = ArrayUtill.add(strs,"넷");
		System.out.println(strs.length);
		ArrayUtill.printArray(strs);
	}
}
