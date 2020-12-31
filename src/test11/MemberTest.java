package test11;

import java.util.Random;
import java.util.Scanner;

public class MemberTest {
	public String name; //멤버변수 , 멤버필드
	public int age;
	
	public static void run() {
		System.out.println("아");
	} //메소드의 선언 ( 앞에 데이터타입(void)가 필요함 )
	
//---------여기는 선언과 초기화만 가능함------------
	public static void main(String[] args) {
		MemberTest mt = new MemberTest();
		mt.run();//메서드의 호출 ( 자기 영역이 없음 )
	}
}
