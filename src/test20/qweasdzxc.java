package test20;

class Cat{
	String name;
}
public class qweasdzxc {
	public static void main(String[] args) {
		Cat[] cats = new Cat[4];
		
		
		for(int i=0;i<cats.length;i++) {
			Cat cat = new Cat();
			cat.name = "동동"+i;
			cats[i] = cat;
		}
		s
		for(int i=0; i<cats.length;i++) {
			System.out.println(cats[i].name);
		}
	}
}
