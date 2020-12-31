package test24;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest2 {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("소주", "19도");
		map.put("맥주", "4.5도");
		map.put("사케", "12도");
		map.put("보드카", "53도");
		map.put("빠이주", "65도");
		
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		//is,has,contatins, include <== 얘들의 타입은 boolean
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key);
		}
	}
}
