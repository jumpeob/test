package test05;

public class DataType2 {

	public static void main(String[] args) {
		// Math : 수학
		// 프로그래밍은 기본적으로 수학과 관련된 함수들을 가지고있음
		// java에서는 Math class 여러분들에게 제공해줌.
		//올림, 반올림, 내림
		//ceil, round, floor   -> Math 클래스가 제공해주는거임.
		double d1 = 1.23456789;
		System.out.println(Math.ceil(d1));
		System.out.println(Math.round(d1)); //라운드는 데이터타입이 long (정수)라서 결과에 소숫점이 없음.
		System.out.println(Math.floor(d1));
	}
}
