package test23;

import java.util.ArrayList;
import java.util.List;

public class ListTest5 {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(1);
		intList.add(1);
		intList.add(1);
		intList.add(1);
		intList.add(1);
		System.out.println(intList);
		
		// <> -> 참조형만 가능, 원시형 데이터타입은 안댐
	}
}
