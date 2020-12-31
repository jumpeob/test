package test16;

class Person{
	String name;
	public Person(String name) {
		this.name = name;
	}
}
public class Constructure2 {
	
	public static void main(String[] args) {
		Person p = new Person("윤웅제");
		System.out.println(p.name);
		Person p1 = new Person("윤치우");
		System.out.println(p1.name);
	}
}
