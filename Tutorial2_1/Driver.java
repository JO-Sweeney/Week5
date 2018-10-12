package Tutorial2_1;

import java.io.IOException;

public class Driver {
	
	public static void main(String [] args) throws IOException{
		Cat feline1 = new Cat("Hamish", "Fat White", 3);
		Cat feline2 = new Cat("Tango", "Striped Orange", 10);
		Cat feline3 = new Cat();
		feline1.displayDetails();
		feline2.displayDetails();
		feline3.displayDetails();
	}	
}
