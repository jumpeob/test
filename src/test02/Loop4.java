package test02;

public class Loop4 {
	public static void main(String[] args) {
	int num1= 1;
	int num2= 1;
		for(num1=1;num1<=9;num1++) {
			System.out.println("-----"+num1+"----´Ü");
			for(num2=1;num2<=9;num2++) {
				System.out.print	(num1 + "X" + num2 + "=" + num1*num2+" ");
			}
		}
	}
}
