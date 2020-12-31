package test22;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
//List 는 인터페이스임
//인터페이스는 메모리생성이 안되어서 ArrayList 클래스로 대신 생성
//<>는 안에 넣을수 있는 데이터를 지정시키는것임
	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();
		System.out.println(strList);
	}
}
