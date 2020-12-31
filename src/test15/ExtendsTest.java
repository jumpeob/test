package test15;

public class ExtendsTest 	{

	public static void main(String[] args) {
		/*
		 * Singer
		 *  - HipHopSinger
		 *   - Ssamd
		 *   - MomySon
		 */
		Singer s = new HipHopSinger();
		s = new Ssamd();
		s = new Momyson();
		/*
		 * 위의 상속관계를 보자면 Singer가 제일 상위고 그 하위의 클래스(즉 Singer를 상속받은애들)
		 * 은 모두다 Singer 데이터타입의 변수에 대입이 가능함
		 */
		HipHopSinger hhs = new Ssamd();
		hhs = new Momyson();
		/*
		 * HipHopSinger 역시도 Momyson과 Ssamd가 상속받았기 때문에
		 * Momyson, Ssamd모두 HipHopSinger라고 불러도 된다!!!
		 */
		Ssamd ss = new Ssamd();
		Momyson m = new Momyson();
		
	}
}
