package test11;

public class MethodTest {
	
	
	static void shopping(int money) {
		System.out.println(money + "원으로 노트북을 삽니다!");
	}//static 쓰면 메인메소드 안에 바로쓸수있음
	
	public static void main(String[] args) {
		shopping(1); //기울어져 있으면 static이다. ex) out
		
	}
}
