package test16;

public class Constructure {

	public Constructure() {
		System.out.println("그냥 생성됨");
	} // 이런 애들은 메소드가 아닌 생성자이기에 접근제어자만 붙는다
	public Constructure(int a) {
		System.out.println("이제 난 그냥호출 안된다 ㅋㅋ");
	}
	
	public static void main(String[] args) {
		Constructure con = new Constructure(); // 생성자		
	}
}