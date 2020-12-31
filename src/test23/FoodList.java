package test23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FoodList {

	public static void main(String[] args) {
		Map<String,String> mkMAP = new HashMap<String,String>();
		mkMAP.put("음식명","마카롱");
		mkMAP.put("가격","2000");
		mkMAP.put("칼로리","200kcal");
		mkMAP.put("종류","디저트");
		
		Map<String,String> maraMAP = new HashMap<String,String>();
		maraMAP.put("음식명","마라탕");
		maraMAP.put("가격","14000");
		maraMAP.put("칼로리","1500kcal");
		maraMAP.put("종류","중식");
		
		Map<String,String> chickenMAP = new HashMap<String,String>();
		chickenMAP.put("음식명","치킨");
		chickenMAP.put("가격","15000");
		chickenMAP.put("칼로리","2000kcal");
		chickenMAP.put("종류","한식");
		
		Map<String,String> susiMAP = new HashMap<String,String>();
		susiMAP.put("음식명","치킨");
		susiMAP.put("가격","20000");
		susiMAP.put("칼로리","600kcal");
		susiMAP.put("종류","일식");
		
		List<Map<String,String>> foodList = new ArrayList<Map<String,String>>();
		foodList.add(mkMAP);
		foodList.add(maraMAP);
		foodList.add(chickenMAP);
		foodList.add(susiMAP);
		System.out.println(foodList);
		//foodList의 각방이 있는 음식의 정보를 아래와 같이 출력하면 됩니다.
		//[음식명 : 마카롱, 가격 : 2000]
		for(int i = 0; i<foodList.size(); i++) {
			System.out.println("[음식명 :"+ foodList.get(i).get("음식명")+", 가격 : "+ foodList.get(i).get("가격")+"]");
		}
	}
}
