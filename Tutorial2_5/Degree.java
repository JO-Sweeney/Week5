package Tutorial2_5;

public class Degree extends Student {
	
	private int studyYear;
	private String tutorName;
	
	public Degree(){
		super();
		System.out.println("Please enter your year of study");
		studyYear = kboard.nextInt();
		System.out.println("Please enter your Tutor's name");
		String enterHold = kboard.nextLine();
		tutorName = kboard.nextLine();
	}
	
	public void displayDetails(){
		super.displayDetails();
		System.out.println("Study Year: "+studyYear);
		System.out.println("Tutor Name: "+tutorName);
	}
	
	//can change the year directly if required
	public void changeYear(int year){
		studyYear = year;
	}
	
	//Can change the name of tutor if required
	public void changeTutor(String name){
		tutorName = name;
	}
	
	//Adds 1 to the year if required
	public void incrementYear(){
		studyYear++;
	}

}
