package Tutorial2_1;

import java.io.*;
import java.util.Scanner;

public class Cat {
	
	private String catName;
	private String catBreed;
	private int catAge;
	private Scanner kboard = new Scanner(System.in);

	public Cat(String name, String breed, int age){
	  getCatDetails(name,breed,age);
	}
	
	public Cat(){
		setName();
		setBreed();
		setAge();
		kboard.close();
	}
	
	public void setName(){
		System.out.println("Please enter the cat's name");
		catName = kboard.nextLine();
	}
	
	public void setBreed(){
		System.out.println("Please enter the cat's breed");
		catBreed = kboard.nextLine();
	}
	
	public void setAge(){
		System.out.println("Please enter the cat's age");
		catAge = kboard.nextInt();
	}

	public void getCatDetails(String gCatName, String gBreed, int gAge){
	  catName=gCatName;
	  catBreed = gBreed;
	  catAge = gAge;
	}


	public void displayDetails() throws IOException{
	  System.out.println("Cats name is : "+catName);
	  System.out.println("Cats breed is : "+catBreed);
	  System.out.println("Cats age is : "+catAge);
	}
}


