package test23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseBallPlayer{
	
	public static void main(String[] args) {
		Map<String,String> lgMap = new HashMap<String,String>();
		lgMap.put("팀명","LG트윈스");
		lgMap.put("투수","켈리");
		lgMap.put("타자","김현수");
		
		Map<String,String> KiaMap = new HashMap<String,String>();
		KiaMap.put("팀명","KIA타이거즈");
		KiaMap.put("투수","양현종");
		KiaMap.put("타자","최형우");
		
		Map<String,String> NcMap = new HashMap<String,String>();
		NcMap.put("팀명","NC다이노스");
		NcMap.put("투수","구창모");
		NcMap.put("타자","양의지");
		
		List<Map<String,String>> teams = new ArrayList<Map<String,String>>();
		teams.add(lgMap);
		teams.add(KiaMap);
		teams.add(NcMap);
		//반복문을 사용해서 각 팀의 투수들만 출력을 해주세요
		for(int i=0; i<teams.size(); i++) {
			Map<String,String> team =teams.get(i);
			System.out.println(teams.get(i).get("투수"));
		}
	}
}
