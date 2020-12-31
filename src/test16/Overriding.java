package test16;

class Father{
	int playing(int a) {
		System.out.println("탁구를 칩니다.");
		return 1;
	}
}
class Son extends Father{
	int playing(int a) {
		System.out.println("축구를 합니다.");
		return 1;
	}
}
public class Overriding {

	public static void main(String[] args) {
		Father f = new Father();
		f.playing(1);
		Father s = new Son();
		s.playing(1);
	}
}
