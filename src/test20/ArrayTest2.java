package test20;

class Dog{
	String name;
	String type;
	int age;
}
public class ArrayTest2 {
	
	public static void main(String[] args) {
		String[] names = {"카드1세","카드2세","칠복이","백돌이"};
		int[] ages = {1,2,3,4};
		String[] types = {"요쿠셔","코카","말티즈","진돗개"};
		
		Dog[] dogs = new Dog[3];
		for(int i=0; i<3; i++) {
			double d = Math.random()*names.length;
			//double d = Math.random() 0 이상 1 미만의 값만 나옴
			int num = (int)d;
			Dog dog = new Dog();
			dog.name = names[num];
			dog.age = ages[num];
			dog.type = types[num];
			dogs[i] = dog;
		}
		System.out.println(dogs[0].name);
		System.out.println(dogs[1].name);
		System.out.println(dogs[2].name);
	}
}

