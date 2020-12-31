package test24;

import java.util.ArrayList;
import java.util.List;

public class LoofTest {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<Integer>();
		//0 - 100
		//1 - 200 -> 0~9번까지 방 만들기
		for(int i=0;i<10;i++) {
			int num = (i+1)*100;
			numList.add(num);
		}
		System.out.println("원래우리가알던포문~");
		for(int i=0; i<numList.size();i++) {
			Integer n = numList.get(i);
		System.out.println(n);
		}
		System.out.println("좀더 편한 향상된포문~");
		for(Integer n : numList) {
			
		System.out.println(n);
		}
	}
}
