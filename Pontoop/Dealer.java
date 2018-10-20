package Pontoop;

public class Dealer extends Player {

	public Dealer() {
		
		super();
		this.addCard();
		this.addCard();
		
	}
	
	public void addCard() {
		int value = (int)(Math.random()*10)+1;
		currentHand = currentHand + value;
	}
	
}
