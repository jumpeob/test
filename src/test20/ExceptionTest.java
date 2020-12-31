package test20;

import java.util.Scanner;

public class ExceptionTest {
	String str;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("당신의 나이는??? :");
		String numStr = s.nextLine();
		ExceptionTest et = new ExceptionTest();
		try {
			int num = Integer.parseInt(numStr);
			System.out.println("당신의 나이는 :"+num+"살이시군용..");
			System.out.println(et.str.equals("태세전환보소"));
		}catch(NumberFormatException e) {
			System.out.println("하.. 보통 나이는 숫자로 적눈뎅 힝꾸ㅜ");
		} // 오류대신 안내를 해주는 예외처리 ->try 시도해서 오류가 나오면 catch해줄께
		catch(NullPointerException e) {
			System.out.println("와~~~null에러가뜬다고?ㅋㅋ");
		}//모든 Exception 클래스는 Exception 클래스를 상속받는다.
		//넘버포멧익셉션, 널포인트익셉션 대신 익셉션을 쓰면 익셉션 혼자 다 오류를 잡기에 하나만 쓰면 된다.
		
	}
}
