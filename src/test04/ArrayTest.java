package test04;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] ints = new int[5];
		/*
		 * 0 -> 100
		 * ints[?]=i
		 * ints[?]=(i-100)/100
		 * 1 -> 200
		 * 2 -> 300
		 * 3 -> 400
		 * 4 -> 500
		 * 
		 */
		for(int i=100 ;i<=500 ;i+=100 ) {
			int idx=(i/100)-1;
			ints[idx]=i;
		}
		for(int i=0 ;i<ints.length ;i++ ) {
			System.out.println(ints[i]);
		}
	}
}