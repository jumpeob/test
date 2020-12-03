package test3;

public class SortTest {

	public static void main(String[] args) {
		//정렬 보기 좋으라고-> 데이터 잘 찾을라고 -> 있어 보일려고
		int[] ages = new int[3];
		ages[0]=10;
		ages[1]=5;
		ages[2]=22;
		//내림차순
		int tmp = ages[0];
		
		
		for(int i=0;i<ages.length;i++) {
			System.out.println(ages[i]);
		}
	}
}