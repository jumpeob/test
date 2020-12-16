package test08;

import java.util.Random;
import java.util.Scanner;

public class LottoTest {

	public static void main(String[] args){
		//생성기&내가 찍은번호가
		//몇개나 맞췄는지까지 할거임
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를,를 구분자로 입력해주세요 :");
		String str = s.nextLine();
		String[] strs = str.split(",");
		
		int[] myLotto = new int[strs.length];
		for(int i=0;i<strs.length;i++) {
			myLotto[i]=Integer.parseInt(strs[i]);
		}
		/* 위에는 내가 번호찍은거 나온거
		 * 숫자+숫자 ->숫자
		 * 문자열+숫자->문자열
		 * 숫자+문자열->문자열
		 * 문자열+문자열->문자열
		 * 밑에는 로또생성하고 출력
		 */
		int[] lotto = new int[6];
		Random r = new Random();
		for(int i=0; i<lotto.length; i++) {
			lotto[i]=r.nextInt(45)+1;
			for(int j=0; j<i; j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		}
		System.out.print("니가 찍은 번호 : [");
		for(int i=0;i<6;i++) {
			System.out.print(myLotto[i]+",");
		}
		System.out.println("]");
		

		System.out.print("당첨 번호 : [");
		for(int i=0;i<6;i++) {
			System.out.print(lotto[i]+",");
		}
		System.out.println("]");
	}
}
