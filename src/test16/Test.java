package test16;

public class Test {

	int i = 1;
	
	public Test() {
		this.i = 50;
		
	}
	public Test(int i) {
		this.i=i;
		System.out.println(this.i);
		
	}
	public static void main(String[] args) {
		Test t = new Test(100);
		
	}
}
