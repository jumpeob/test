package test2;

public class Loop6 {
	public static void main(String[] args) {
		int num1=9;
		int num2=9;
		for(num1=9;num1>=1;num1--) {
			System.out.println("===="+num1+"단====");
			for(num2=9;num2>=1;num2--)
				System.out.println(num1+"X"+num2+"="+num1*num2);
		}
	}
}
