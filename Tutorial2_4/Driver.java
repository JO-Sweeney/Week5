package Tutorial2_4;

import java.io.IOException;

public class Driver {
	
	public static void main(String [] args) throws IOException{
		Cat fullFeline1 = new Cat("Hamish", "Fat White", 21);
		Cat kitty1 = new Kitten("Hamish 2", "Fat Grey", 1, "Green", 25);
		Cat kitty2 = new Kitten("Mindy", "Striped Grey", 2, "Blue", 40);
		fullFeline1.displayDetails();
		System.out.println("\n");
		kitty1.displayDetails();
		System.out.println("\n");
		kitty2.displayDetails();
		System.out.println("\n");
	}	
}
