package test23;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	//반복문을 사용해서 1부터 10까지 strList에 add 해보기
	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();
		for(int i=1; i<=10; i++) {
			strList.add(String.valueOf(i)); //strList.add(i+""); 인트->스트링
		}
		for(int i=0;i<strList.size();i++) { //List는 length대신 size를사용
			System.out.println(strList.get(i)); //get은 하나씩 빼오는메소드
		}
	}
}
