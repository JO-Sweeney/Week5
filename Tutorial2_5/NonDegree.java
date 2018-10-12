package Tutorial2_5;

public class NonDegree extends Student {
	
	private String studyLevel;
	private String supervisor;
	
	public NonDegree(){
		super();
		System.out.println("Please enter your level of study");
		studyLevel = kboard.next();
		System.out.println("Please enter your supervisor's name");
		String enterHold = kboard.nextLine();
		supervisor = kboard.nextLine();
	}
	
	public void displayDetails(){
		super.displayDetails();
		System.out.println("Study Level: "+studyLevel);
		System.out.println("Course Supervisor: "+supervisor);
	}
	
	//Changes level if required
	public void changeLevel(String level){
		studyLevel = level;
	}
	
	//changes supervisor if required
	public void changeSupervisor(String newSupervisor){
		supervisor = newSupervisor;
	}
}
