package Pontoop;

public class User extends Player {
	
	
	public User() {
		
		super();
		
	}
	
	public void addCard() {
		int value = (int)(Math.random()*10)+1;
		System.out.println("You got a "+value);
		currentHand = currentHand + value;
	}
	


}
