package test23;

// final은 클래스와 메소드, 변수에 사용가능하다.
final class Single{
	
}
class F extends Single{ // class 앞의 final은 상속을 못하게한다.
	public final void test() {
		System.out.println("난 F의 test함수");
	}
}
public class FinalTest extends F{
	public final int NUMBER_TEST=10; // 멤버필드에서 상수값(final)은 전부다 대문자
	public void test() {
		System.out.println("난 finaltest의 test함수");
	} // 메소드 앞의 final -> 오버라이딩을 방지한다.
	public static void main(String[] args) {
		final int num = 10;
		// 변수앞의 final -> 값을 고정시켜버림(상수값)
	}
}
