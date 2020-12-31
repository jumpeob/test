package test17;

public class ObjectTest {
	
	public String toString() {
		
		return "급했어 ㅋㅋ";
	}
	public static void main(String[] args) {
		
		Object ot = new ObjectTest();
		String str = ot.toString();
		System.out.println(str);
		System.out.println(ot);
	}
}
