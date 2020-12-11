package test05;

import java.util.Random; // Random ran;에 ctrl + shift + o

public class DataType3 {

	public static void main(String[] args) {
		
		/*
		 * 1-45까지의
		 * 중복되지 않는 랜덤의 숫자가 6개 똑같으면 1등 -나중
		 */
		Random ran = new Random();
		System.out.println(ran.nextInt(45)+1);
		
	}
}
