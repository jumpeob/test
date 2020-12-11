package test05;

import java.util.Scanner;

public class ScanTest2 {

	public static void main(String[] args) {
		/*
		 * 학년 : 1-3학년만 존재 , 벗어나면 학년을 잘못입력하셨습니다.
		 * 반 : 1-10반 , 벗어나면 반을 잘못입력하셨습니다.
		 * 이름 입력받을것
		 */
		System.out.print("학년 : ");	
		Scanner scan = new Scanner(System.in);
		String grade = scan.nextLine();
		
		int grade1 =Integer.parseInt(grade);
		
		if(grade1>=1 && grade1<=3) {
			
		}else {
			System.out.println("학년 잘못입력");
		}
		
		System.out.print("반: ");
		String clazz = scan.nextLine();
		
		int clazz1 = Integer.parseInt(clazz);
		
		if(clazz1<1 || clazz1>10) {
			System.out.println("반 잘못입력");
		}

		System.out.print("이름: ");
		String name = scan.nextLine();
		
		System.out.println(grade+"학년"+clazz+"반"+name+"님 반갑습니다");
	}
}
