package student;

public class Student {

	private String name;
	private int korean;
	private int english;
	private int math;
	private int science;

	public Student() {

	}

	public Student(String name, int korean, int english, int math, int science) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}
	
	public double getAvg() {
		
		return (double)(korean + english + math + science)/4;
		
	}
	
	public String getGrade() {
		String grade;
		double avg = getAvg();
		switch((int)avg / 10) {
			case 10 : 
			case 9 :
				grade = "A";
				break;
			case 8 :
			case 7 : 
				grade = "B";
				break;
			case 6 :
			case 5 :
				grade = "C";
				break;
			case 4 :
			case 3 :
				grade = "D";
				break;
			default:
				grade = "F";
		}
		return grade;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}
}
