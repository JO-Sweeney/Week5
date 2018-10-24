package Pontoop;

public class User extends Player {
	
	
	public User() {
		
		super();		//Initialise player's hand at 0
		
	}
	
	public void addCard() {
		int value = (int)(Math.random()*10)+1;			
		System.out.println("You got a "+value);			//print out what value the user got
		currentHand = currentHand + value;
	}
	


}
