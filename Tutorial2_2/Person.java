package Tutorial2_2;

import java.util.Scanner;

public class Person {
	
	private Scanner kboard = new Scanner(System.in);
	private String personName;
	private String personAddress;
	private int personAge;
	
	public Person(){
		System.out.println("Please enter the name");
		personName = kboard.nextLine();
		System.out.println("Please enter the address");
		personAddress = kboard.nextLine();
		System.out.println("Please enter the age");
		personAge = kboard.nextInt();
	}
	
	public void getPersonName(String gName){
		personName = gName;
	}
	
	public void getPersonAddress(String gAddress){
		personAddress = gAddress;
	}
	
	public void getPersonAge(int gAge){
		personAge = gAge;
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

}
