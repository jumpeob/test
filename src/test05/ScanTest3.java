package test05;

import java.util.Scanner;

public class ScanTest3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("가장 좋아하는 축구 선수는 : ");
		String player = scan.nextLine();
		
		String[] names = {"송흥민","손흔민","송흥밍","손날두"};
		for(int i=0;i<names.length;i++) {
			if(names[i].equals(player)) {
				System.out.println("손흥민을 검색하신건가요?");
			}
		}
	}
}


//string str = "박경훈"
//string str2 = "박경훈" -> str==str2 트루
//string str = "박경훈"
//string str2 = new String("박경훈") -> str==str2 펄스
//new string사용시 새로운 메모리에 저장하기에 펄스가 나옴
//그래서 equals()를 사용해주는것