package test20;

class Person{
	public String name;
	public int age;
}
public class ArrayTest {

	public static void main(String[] args) {
		Person[] ps = new Person[5];
		
		for(int i=0; i<ps.length; i++) {
			ps[i]=new Person();
			ps[i].name="이름"+i;
			ps[i].age=i;
		}
		for(int i=0; i<ps.length; i++) {
			System.out.println("이름 : " +ps[i].name);
			System.out.println("나이 : " +ps[i].age);
		}
	}
}
