package snakeAndLadderGame;
import java.util.Random;

public class SnakeLadderGame {
	static int position = 0; // Static Global Variable Player 1 Starting Position and 0 Postion on board
	static int winningPosition = 100; // Static Golbal Winning Postion 
	public static void main(String[] args) {
		System.out.println("Welcome to Snake Ladder Game!");
		playGame();
		
	}
	private static void playGame() {
		int diceRoll=0;
		
		while(position < winningPosition) {
			int dieRoll = rollDice();
			diceRoll++;
			System.out.println("Rolled : "+dieRoll);
			
			switch(getOption()) {
			case 0:
				System.out.println("No Play: Player Stay at Position "+position);
				break;
			case 1:
				position += dieRoll;
				System.out.println("Ladder : Move Ahead to Positon "+position);
				break;
			case 2:
				position -= dieRoll;
				if(position <0) {
					position = 0;
				}
				System.out.println("Snake : Move Back to Positon "+ position);
			}
			if(position > winningPosition ) {
				position -=dieRoll;
				System.out.println("Exceed: Stay at Position "+position);
			}
			
		}
		System.out.println("Congratulations! You reached Position "+position+" in " + diceRoll + " rolls.");
	}
	
	private static int rollDice() {
		Random random = new Random();
		return random.nextInt(6)+1;
				
	}
	private static int getOption() {
		Random random = new Random();
		return random.nextInt(3);
	}
}