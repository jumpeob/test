package test18;

public class Excute {
	public static void act(Action b) {
		b.eat();
		b.sleep();
		b.walk();
		b.run();
	}

	public static void main(String[] args) {
		Action a1 = new Animal();
		Action a2 = new Human();
		act(a1);
		act(a2);
	}
}
