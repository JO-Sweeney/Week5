package Pontoop;

import java.util.Scanner;

public class Game {
	
	private Player mUser;
	private Player mDealer;
	private Scanner kboard;
	
	
	public Game() {
		
		mUser = new User();
		mDealer = new Dealer();
		kboard = new Scanner(System.in);
		runGame();
		
	}
	
	
	public String askCard(){
		System.out.println("Your hand is "+mUser.showHand());
		System.out.println("Do you want another card? y/n");
		String choice = kboard.next();
		return choice;
	}
	
	
	public boolean checkHand() {
		if(mUser.showHand() < 21) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public void checkWin() {
		
		System.out.println("Your hand is "+mUser.showHand());
		System.out.println("The dealers hand is "+mDealer.showHand());
		
		if(mUser.showHand() > mDealer.showHand() && mUser.showHand() < 22) {
			System.out.println("You have won!");
		}else if(mUser.showHand() == mDealer.showHand()) {
			System.out.println("It's a draw!");
		}else {
			System.out.println("You lose!");
		}
	}
	
	
	public void runGame() {
		System.out.println("Welcome to pontoop");
		do {
			mUser.addCard();
		} while(askCard().equalsIgnoreCase("y") && checkHand() == true);
		checkWin();
	}


}
