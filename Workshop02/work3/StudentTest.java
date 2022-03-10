package work3;


public class StudentTest {

	public static void main(String[] args) {

		StudentView sv = new StudentView();

		Student st = new Student("민들래", 15, 170, 55);

		sv.viewStudent(st);

		Student[] ArrayList = new Student[3]; 
		ArrayList[0] = new Student("민들래",15,170,55); 
		 
		ArrayList[1] = new Student("진달래",22,165,53); 
	    
		ArrayList[2] = new Student("개나리",20,155,46); 
	   
	    sv.viewStudentList(ArrayList);

	}

}
