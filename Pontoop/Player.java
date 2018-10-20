package Pontoop;


public class Player {
	
	protected int currentHand;
	
	public Player() {
		
		currentHand = 0;
		
	}
	
	public int showHand() {
		return currentHand;
	}
	
	public void addCard() {
		int value = (int)(Math.random()*10)+1;
		currentHand = currentHand + value;
	}
	
	
	
}
