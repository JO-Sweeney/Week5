package Tutorial2_4;

import java.io.IOException;

public class Kitten extends Cat{
	
	private String mEyeColour;
	private int mLength;
	
	public Kitten(String name, String descr, int age, String eyeColour, int length){
		super(name, descr, age);
		mEyeColour = eyeColour;
		mLength = length;
	}
	
	public void displayDetails() throws IOException{
		  super.displayDetails();	
		  System.out.println("Eye colour: "+mEyeColour);
		  System.out.println("Length: "+mLength);
		}

}
