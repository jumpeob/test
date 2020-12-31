package test23;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
/*
 * List 인터페이스를 구현하고 있는 대표적인 클래스 2개
 * 	ArrayList 배열과 비슷함, 순서를 가지고있음
 *  LinkedList 비슷한데 순서를 가지고있지 않고 앞뒤만을 기억하는것
 * Map 인터페이스를 구현하고 있는 대표적인 클래스 2개
 * 	HashMap 키와 값이 중요하지 순서가 중요하지 않음
 * 	LineKedHaspMap 키와 값이 중요하고 각각이 앞뒤를 알고있어서 순서대로 출력가능
 */
	public static void main(String[] args) {
		Map<String,String> human = new HashMap<String,String>();
		human.put("이름", "홍길동"); // 키값, 밸류값
		human.put("나이", "22");
		human.put("키", "22");
		human.put("주소", "서울");
		human.put("직업", "개발자");
		System.out.println(human);
	}
}
