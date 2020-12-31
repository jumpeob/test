package test24;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
/*
 * key
 * value
 * type
 * element
 */
	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(100);

		Integer i = numList.get(0);
		
		List<String> strList = new ArrayList<String>();
		strList.add("루비두비루비두빠ㅃ빠빱빠예");
		strList.get(0);
		
		
	}
}
