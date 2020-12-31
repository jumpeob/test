package test14;

class Animal{
	int age;
	String name;
	String type;
	int height;
}
public class Dog extends Animal{
	
	public static void main(String[] args) {
		//Dog는 Animal이라고 부를 수 있다.(즉 Animal이 Dog보다 상위개념)
		Animal a = new Dog();
		
	}
}