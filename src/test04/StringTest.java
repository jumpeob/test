package test04;

public class StringTest {

	public static void main(String[] args) {
		
		String str = "가나다라마바사";
//		System.out.println(str.length()); 길이
//		System.out.println(str.indexOf("카")); 찾는거
//		System.out.println(str.substring(1,2)); 몇번째부터 어디까지 짜를까?
//		System.out.println(str.contains("가")%%str.contains("다")); 포함하고있나?
//		System.out.println(str.replace("가나", "우리")); 바꾸는거
//		str= str.replace("가나", "우리");
//		System.out.println(str);
		str = "  하이 ";
		System.out.println(str.trim()); //앞뒤 공백제거
	}
}
