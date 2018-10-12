package Tutorial2_5;

import java.util.Scanner;

public class Person {
	
	protected Scanner kboard;
	private String personName;
	private String personAddress;
	private int personAge;
	
	public Person(){
		kboardOpen();
		System.out.println("Please enter the name");
		personName = kboard.nextLine();
		System.out.println("Please enter the address");
		personAddress = kboard.nextLine();
		System.out.println("Please enter the age");
		personAge = kboard.nextInt();
	}
	
	public void setPersonName(String sName){
		personName = sName;
	}
	
	public void setPersonAddress(String sAddress){
		personAddress = sAddress;
	}
	
	public void setPersonAge(int sAge){
		personAge = sAge;
	}
	
	public void displayDetails(){
		System.out.println("Name: "+personName);
		System.out.println("Address: "+personAddress);
		System.out.println("Age: "+personAge);
	}
	
	public int returnAge(){
		return personAge;
	}
	
	public void changeAge(){
		System.out.println("Please enter the new age");
		personAge = kboard.nextInt();
	}
	
	public void kboardOpen(){
		kboard = new Scanner(System.in);
	}
	
	public void kboardClose(){
		kboard.close();
	}

}

