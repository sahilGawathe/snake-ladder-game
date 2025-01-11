package snakeAndLadderGame;
import java.util.Random;

public class SnakeLadderGame {
	static int player1 = 0; // Static Global Variable Player 1 Starting Position and 0 Postion on board
	public static void main(String[] args) {
		System.out.println("Welcome to Snake Ladder Game!");

	}
	
	private static int rollDice() {
		Random random = new Random();
		return random.nextInt(6)+1;
				
	}
}