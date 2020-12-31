package test23;

public abstract class Animal{
	public abstract void borned();
	public void died() {
		System.out.println("후..죽었네...?");
	} // 보통 추상화클래스는 class명 앞에 Abstract을 붙여준다	
}


class Mamals extends Animal{

	@Override
	public void borned() {
		System.out.println("새끼로 태어났어용~");
	}
}
class Reptile extends Animal{

	@Override
	public void borned() {
		System.out.println("알로 태어났어요");
	}
}