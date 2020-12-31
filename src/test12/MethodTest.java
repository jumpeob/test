package test12;

public class MethodTest {
	
	
	
	static void watchMovid(int cnt) {
		int age; // 위의 age랑 다른 age다..
		int price = 12000;
		System.out.println("고객님의 요금은 " +(cnt*price)+"원 입니다");
	}
	
	static int getCoffee(int money) {
		int price = 1500;
		if(money<price) {
			return -1;
		}
		return money-price;
	}
	
	public static void main(String[] args) {
		int money = 1000;//local변수
		while(getCoffee(money+=100)==-1) {
		System.out.println("커피가 비싸군");
		}
		System.out.println("내가 낸 커피 가격 : "+money );
		
	}
}
