package object;

/* -name : String
 * -dept : String
 * -pay : int
 * -score : double
 * +setter
 * +getter
 * 
 * +setEmployee(name : String,  dept : String,  pay : int, score : double) : void
 * +toString() : String
*/
public class Employee {

	private String name;
	private String dept;
	private int pay;
	private double score;

	public void setEmployee(String name, String dept, int pay, double score) {
		this.name = name;
		this.dept = dept;
		this.pay = pay;
		this.score = score;
	}

	public String toString() { // 결과로 보여주고 싶은 문자열을
		return "이름은 " + name + " 이고 " + dept + "에 근무하며 급여는 " + pay + "원, 입사성적은 " + score + "점 입니다.";

	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public String getDept() {
		return dept;
	}

	public int getPay() {
		return pay;
	}

	public double getScore() {
		return score;
	}

}
