package Pontoop;
import java.util.Scanner;

public class Launcher {
	
	public static void main(String [] args) {
		Scanner kboard = new Scanner(System.in);
		String choice;
		Game newGame;
		int counter = 0;
		
		do {
		newGame = new Game();
		counter++;
		System.out.println("Play again? y/n");
		choice = kboard.next();
		}while(choice.equalsIgnoreCase("y") && counter < 5);
		kboard.close();
	}

}
