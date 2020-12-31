package test18;

public class Animal implements Action{

	@Override
	public void eat() {
		System.out.println("동물이밥챱챱챱");
		
	}

	@Override
	public void sleep() {
		System.out.println("동물이z쿠뤀뤀루쿨쿨");
		
	}

	@Override
	public void walk() {
		System.out.println("동물이뚜벅뚜뚜벅초");
		
	}

	@Override
	public void run() {
		System.out.println("동물이ㅎ다다다호다다닥");
		
	}

}
