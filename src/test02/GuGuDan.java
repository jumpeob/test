package test02;

public class GuGuDan {
	public static void main (String[] args) {
		int num1= 9;
		int num2= 9;
		for(num1=9;num1>0;num1--) {
			System.out.println("----"+num1+"단----");
			for(num2=9;num2>0;num2--) {
				System.out.println(num1+"X"+num2+"="+num1*num2);
			}
		}
	}
}
