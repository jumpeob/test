package test08;

public class SplitTest {

	public static void main(String[] args) {
		String str = "123,2,3,4";
		
		int idx = str.indexOf(",");
		String str1 = str.substring(0,idx);
		
		System.out.println(str1);
		
		str = str.substring(idx+1);
		idx = str.indexOf(",");
		String str2 = str.substring(0,idx);
		
		System.out.println(str2);
	}
}
