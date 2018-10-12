package Tutorial2_5;

public class Driver {
	
	public static void main(String [] args){
		Person person1 = new Person();
		Person student1 = new Student();
		Person degreeStudent = new Degree();
		Person nonDegreeStudent = new NonDegree();
		
		System.out.println("\n");
		person1.displayDetails();
		person1.kboardClose();
		
		
		System.out.println("\n");
		student1.displayDetails();
		student1.kboardClose();
		
		System.out.println("\n");
		degreeStudent.displayDetails();
		degreeStudent.kboardClose();
		
		System.out.println("\n");
		nonDegreeStudent.displayDetails();
		nonDegreeStudent.kboardClose();
		
		
	}

}
