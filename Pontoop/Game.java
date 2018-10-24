package Pontoop;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	
	private Player mUser;
	private Player mDealer;
	private Scanner kboard;
	private String mResult;
	
	
	public Game() {
		
		mUser = new User();							//This game's user
		mDealer = new Dealer();						//This game's dealer
		kboard = new Scanner(System.in);	
		mResult = "";
		runGame();
	}
	
	
	public String askCard(){
		System.out.println("Your hand is "+mUser.showHand());
		String choice;
		if(checkHand()) {
			System.out.println("Do you want another card? y/n");
			choice = kboard.next();
		}else {
			choice = "n";
		}
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
			mResult = "win";
		}else if(mUser.showHand() == mDealer.showHand()) {
			System.out.println("It's a draw!");
			mResult = "draw";
		}else {
			System.out.println("You lose!");
			mResult = "loss";
		}
	}
	
	
	public void runGame() {
		System.out.println("Welcome to pontoop");
		do {
			mUser.addCard();
		} while(askCard().equalsIgnoreCase("y") && checkHand() == true);
		checkWin();
	}
	
	public void closeScanner() {
		this.kboard.close();
	}
	
	public String getResult() {
		return mResult;
	}


}
