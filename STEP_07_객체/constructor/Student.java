package constructor;

/*
 * -name : String
 * -kor : int
 * -eng : int
 * -mat : int
 * +Student
 * +Student(name : String, kor : int, eng : int, mat : int)
 * +getter,+setter
 * +getTotal():int  <-- kor + eng + mat return
 * +getAvg():double <--getTotal() 의 평균 return
 * +getGrade():char  <-- A,B,C,D,F 학점을 구하여 리턴
 * +toString() : String
 */
public class Student {
	private String name;
	private int kor;
	private int eng;
	private int mat;

	public Student() {

	}

	public Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public int getTotal() {
		return kor + eng + mat;
	}

	public double getAvg() {
		return getTotal() / 3.0;
	}

	public char getGrade() {

		switch ((int) getAvg() / 10) {
		case 10:
		case 9:
			return 'A';
		case 8:
			return 'B';
		case 7:
			return 'C';
		case 6:
			return 'D';
		default:
			return 'F';
		}
	}

	public String toString() {
		return name + " 의 점수는 " + getTotal() + "점이며 평균은 " + String.format("%.2f", getAvg()) + "점 이고 학점은 " + getGrade()+ "입니다.";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

}
