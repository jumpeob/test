package test07;

import java.util.Scanner;

public class MultipleTable {

	public static void main(String[] args) {
		/*구구단을 이중포문으로 구현하여 출력
		 * Scanner을 사용해서 값을 입력받은 뒤에
		 * 입력받은 단 까지만 출력
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("몇단까지 출력할까용?");
		String strNum = scan.nextLine();
		int num = Integer.parseInt(strNum);
		for(int i=1;i<=num;i++) {
			System.out.println(i+"단");
			for(int j=1;j<10;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
	}
}
