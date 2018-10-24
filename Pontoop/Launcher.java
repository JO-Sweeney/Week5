package Pontoop;
import java.util.Scanner;

public class Launcher {
	
	public static void main(String [] args) {
		Scanner kboard = new Scanner(System.in);
		String choice;
		Game newGame;
		int counter = 0;
		GameTracker trackGame = new GameTracker();
		
		do {
		newGame = new Game();
		counter++;
		trackGame.setResult(newGame.getResult());
		System.out.println("Play again? y/n");
		choice = kboard.next();
		}while(choice.equalsIgnoreCase("y") && counter < 5);
		kboard.close();
		trackGame.printResults();
	}

}
