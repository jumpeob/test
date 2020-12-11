package test05;

import java.util.Random;

public class LottoTest {

	public static void main(String[] args) {
		
		Random r = new Random();
		/*
		 * 1-45까지의 랜덤의 숫자 6개가 출력되었으면 좋겠습니다
		 * 7 1 13 25
		 * 0 1 2  3
		 */
		int[] lotto = new int[6];
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=r.nextInt(45)+1;
			for(int j=i-1; j>=0;j--) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}System.out.println(lotto[i]);
		}
		
	}
}
