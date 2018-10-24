package Pontoop;


public abstract class Player {
	
	protected int currentHand;
	
	public Player() {
		
		currentHand = 0;
		
	}
	
	public int showHand() {
		return currentHand;
	}
	
	public void addCard() {
		int value = (int)(Math.random()*10)+1; 	//gives a random value between 1 and 11
		currentHand = currentHand + value;		//Add random value to the player's hand
	}
	
	
	
}
