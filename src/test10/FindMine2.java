package test10;

import java.util.Random;
import java.util.Scanner;

public class FindMine2 {

	public static void main(String[] args) {
		String[] strs = new String[5];
		Random r = new Random();
		int mine = r.nextInt(strs.length)+1;
		for(int i=0; i<strs.length; i++) {
			strs[i]= i+1+"";
			if(strs[i].equals(mine+"")) {
				strs[i] = "꽝";
			}
		}
		/*
		 * 1-5까지의 숫자를 입력받는다
		 * 해당 숫자가 각방에 들어가있는 숫자와 비교해
		 * 꽝이면 찾았다!
		 * 아니면 틀렸다 를 출력
		 */
		strs = new String[] {"1","2","3","꽝","5"};
		Scanner s = new Scanner(System.in);
		System.out.print("1-5숫자 : ");
		String myStr = s.nextLine();
		int idx = 0;
		for(int i=0;i<strs.length;i++) {
			if(strs[i].contentEquals("꽝")) {
				idx = i+1;
				break;
			}
		}
		if(myStr.contentEquals(idx+"")) {
			System.out.println("찾았다!");
		}else {
			System.out.println("틀렸다!");
		}
	}
}