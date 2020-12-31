package test17;

class Over{
	public int getInt() {
		return 1;
	}
}
public class Overriding extends Over{
/*
 * 오버라이딩의 조건
 * 1. 일단 상속에서만 가능한 개념
 * 2. 메서드명이 같아야함
 * 3. 메서드의 데이터 타입이 반드시 같아야함
 * 4. 매개변수의 타입, 갯수, 순서도 모두 일치해야함.
 */
	public int getInt() {
		return 20;
	}
	
	public static void main(String[] args) {
		Over o = new Overriding();
		int num = o.getInt();
		System.out.println(num);
	}
}
