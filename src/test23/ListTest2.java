package test23;

import java.util.ArrayList;
import java.util.List;

public class ListTest2 {

	public static void main(String[] args) {
		// String만 저장가능한 List변수를 만들어서
		// 0번째 5 1번째 10 ...9번째 50 이렇게 만들어보세요
		List<String> strList = new ArrayList<String>();
		
		for(int i=5; i<=50; i+=5) {
			strList.add(i+"");
		}
		int sum=0;
		for(int i=0; i<strList.size(); i++) {
		sum = sum+Integer.parseInt(strList.get(i));
		}
		System.out.println(sum);
	}
}
