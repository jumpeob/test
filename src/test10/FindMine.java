package test10;

import java.util.Random;

public class FindMine {

	public static void main(String[] args) {
		//int 배열의경우 각 방 0으로 초기화, 모든 참조형 데이터타입은null로 초기화
		//빈문자열과 0은 다른것이다..
		String[] strs = new String[5];
		Random r = new Random();
		int mineIdx = r.nextInt(strs.length)+1;
		
		for(int i=0;i<strs.length;i++) {
			strs[i]=i+1+"";
			if(mineIdx==Integer.parseInt(strs[i])) {
				strs[i]="꽝";
				System.out.println(mineIdx);
				System.out.println("strs["+i+"] : "+strs[i]);
			}
		}
//		
//		for(int i=0;i<strs.length;i++) {
//			System.out.println(strs[i]);
//		}       위에 시스템 없애고 요거 써도 괜춘함
	}
}
