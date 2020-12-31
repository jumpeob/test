package test23;

import java.util.ArrayList;
import java.util.List;

public class ListTest3 {
// 2 4 8 16 32 64 128 256 512 1024
	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		

		strList.add(2+"");
		for(int i=0; i<9; i++) {
			strList.add(Integer.parseInt(strList.get(i))*2+"");
		}
		for(int i=0; i<strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		// for(int i=2; i<=1024; i*=2로도 가능
		// strList.add(i); 이거
	}
}
