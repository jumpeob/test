package test23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMap {

	public static void main(String[] args) {
		
		List<Map<String,String>> personList = new ArrayList<Map<String,String>>();
		
		Map<String,String> p = new HashMap<String,String>();
		p.put("번호", "1");
		p.put("이름", "홍길동");
		p.put("주소", "서울");
		p.put("성별", "남자");
		personList.add(p);
		
		Map<String,String> p2 = new HashMap<String,String>();
		p2.put("번호", "2");
		p2.put("이름", "김춘삼");
		p2.put("주소", "서울");
		p2.put("성별", "남자");
		personList.add(p2);
		
		Map<String,String> p3 = new HashMap<String,String>();
		p3.put("번호", "3");
		p3.put("이름", "사임당");
		p3.put("주소", "서울");
		p3.put("성별", "여자");
		personList.add(p3);
		
		Map<String,String> p4 = new HashMap<String,String>();
		p4.put("번호", "4");
		p4.put("이름", "은선");
		p4.put("주소", "서울");
		p4.put("성별", "여자");
		personList.add(p4);
		
		System.out.println(personList);
	}
}
