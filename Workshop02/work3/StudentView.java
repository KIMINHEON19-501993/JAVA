package work3;

public class StudentView {

	Student st = new Student();

	public void viewStudent(Student st) {
		
		
		System.out.println("이름\t나이\t신장\t몸무게");
		System.out.println("--------------------------------");
		System.out.print(st.getName() + "\t");
		System.out.print(st.getAge() + "\t");
		System.out.print(st.getHeight() + "\t");
		System.out.print(st.getWeight() + "\n\n\n");
		
	}

	public void viewStudentList(Student[] list) {
		
		for (Student st : list) {
			System.out.print(st.getName() + "\t");
			System.out.print(st.getAge() + "\t");
			System.out.print(st.getHeight() + "\t");
			System.out.print(st.getWeight() + "\n");
		}

	}

}
