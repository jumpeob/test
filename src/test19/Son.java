package test19;
class GrandFather{
	static void eat() {
		System.out.println("z");
	}
}
class Father extends GrandFather{
	static void eat() {
		System.out.println("z");
	}
	static void work() {
		System.out.println("z");
	}
	static void sleep() {
		System.out.println("z");
	}
}
public class Son extends Father{
	
	public static void main(String[] args) {
		GrandFather gf = new GrandFather();
		GrandFather f = new Father();
		
		
	}
}
