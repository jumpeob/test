package test11;

public class MethodTest2 {

	static int buyLaptop(int money) {
		int price = 97;
		if(money<price) {
			System.out.println("장난하니?");
			return -1;
		}
		
		System.out.println("드디어 샀다..");
		return money-price;
		
	}
	
	public static void main(String[] args) {
		int wallet = buyLaptop(50);
		if(wallet==-1) {
			System.out.println(wallet);
			wallet = buyLaptop(75);
			if(wallet == -1) {
				wallet = buyLaptop(100);
			}
		}
		
		
	}
}
