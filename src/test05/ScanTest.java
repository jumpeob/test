package test05;

import java.util.Scanner;

public class ScanTest {

	public static void main(String[] args) {
		/*
		 * Scan : 뭔가를 스캔하는거
		 * 입력이 이루어져야 한다.
		 * Input/Output => I/O
		 * QR코드 스캐너 -> QR코드를 스캔하는거
		 * 스캔을 하기위해선??
		 * 스캐너가 필요
		 * 뭘 스캔할거여? 내용문서???
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("몇 살이니?");
		String str = scan.nextLine();
		/*
		 * str 일반적이라면
		 * 1살보다 크거나 같고 200살보다 작은 숫자가 들어와야 일반적
		 * 즉, 위의 조건을 만족했을 경우는 정상입력!
		 * 아닐경우에는 나이가 제멋대로 이네? 출력
		 */
		System.out.println("너의 나이 : " +str);
		int age = Integer.parseInt(str);
		if(age>=1 && age<200) {
			System.out.println("정상입력!!");
		} else {
			System.out.println("아니잖아ㅡ");
		}
		//아씨 점마저거 분명히 숫잔데
		//숫자(인트)로 바꿀수 없나???
	}
}

