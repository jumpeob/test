package test24;
class F{
	F(){
		System.out.println("1");
	}
	
	void f(){
		System.out.println("call f()");
	}
}

class S extends F{
    S(){
		System.out.println("2");
	}
	void f(int i){
		System.out.println("call f(int)");
	}
	
	public static void main(String[] args){
		F f = new S();
		f.f();
		f = new F();
		f.f();
	}
}
public class TTTest {

	public static void main(String[] args) {
		
		
	}
}
