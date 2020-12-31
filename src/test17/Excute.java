package test17;

public class Excute {

	public static void main(String[] args) {
//		CrazyArcade ca = new CrazyArcade();
//		ca.name="크아";
//		ca.price = 0;
//		ca.genre = "캐쥬얼";
//		ca.vendor = "넥슨";
//
//		ca.startGame();
//		ca.playing();
//		ca.endGame();
		
		Game game = new CrazyArcade();
		game.name="크아";
		game.price = 0;
		game.genre = "캐쥬얼";
		game.vendor = "넥슨";
		game.playing();
		game.startGame();
		game.endGame();
		CrazyArcade ca = new CrazyArcade();
		ca.playing();
	}
}
