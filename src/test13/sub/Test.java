package test13.sub;
//public protected default private

public class Test {
	//디폴트 접근제어자는 같은 패키지 안에서만 접근이 가능하다..
	//private은 같은 클래스 내에서만 사용가능함
	//public은 어디서든 사용 가능함
	//
	public void printSomething() {
		System.out.println("왜이리 시끄러운것이냐~");
	}
}
