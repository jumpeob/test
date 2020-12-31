package test14;

class Mother{
	int money = 10000;
	String fName = "엄";
	String lName = "신자";
}

public class Son extends Mother {
	int money = 1000;
	String lName = "동성";
	
	public static void main(String[] args) {
		Son s = new Son();
		System.out.println(s.money);
		System.out.println(s.fName);
		System.out.println(s.lName);
	}
}
