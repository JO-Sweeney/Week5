package Tutorial2_5;

public class Student extends Person {
	
	private long matricNo;
	private String courseTitle;
	
	public Student(){
		super();
		System.out.println("Please enter your matriculation number");
		matricNo = kboard.nextLong();
		System.out.println("Please enter your course title");
		String enterHold = kboard.nextLine();
		courseTitle = kboard.nextLine();
	}
	
	public void changeAddress(){
		System.out.println("Please enter the new address");
		String newAddress = kboard.nextLine();
		super.setPersonAddress(newAddress);
	}
	
	public void changeCourse(){
		System.out.println("Please enter the course title to swap to");
		String newCourse = kboard.nextLine();
		courseTitle = newCourse;
	}
	
	public void displayDetails(){
		super.displayDetails();
		System.out.println("Matriculation Number: "+matricNo);
		System.out.println("Course Title: "+courseTitle);
	}

}
