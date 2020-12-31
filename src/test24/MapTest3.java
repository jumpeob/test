package test24;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest3 {

	public static void main(String[] args) {
		/*
		 * Map 데이터타입의 변수를 선언과 초기화
		 * 키값 1에 감자
		 * 키값 2에 고구마
		 * 키값 3에 옥수수
		 * 키값 4에 대추
		 * 각 키값들의 데이터타입은 Integer
		 * value는 String
		 * Iterator를 사용해서 모든key와 value를 출력하는 코드완성
		 */
		
		Map<Integer,String> map = new HashMap<>();
		map.put(1,"감자");
		map.put(2,"고구마");
		map.put(3,"옥수수");
		map.put(4,"대추");
		
		Set<Integer> keySset = map.keySet();
		Iterator<Integer> it = keySset.iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			System.out.println("아 아직있넹");
			System.out.println("key :" +key + ", value : " + map.get(key));
			
		}
	}
}
