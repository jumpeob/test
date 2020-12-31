package test24;

public class Overloading {
	static String test() {
		return new String("하하");
	}
	public static void main(String[] args) {
		String str = new String("하하");
		System.out.println(str.length());
		
		System.out.println(test().length());
	}
}
