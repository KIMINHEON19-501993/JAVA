package object;
/*클래스명 Emp3
 * -name : String 멤버변수
 * -dept : String
 * -salary : int
 * +getter/+setter
 * +toString : string
 * 
 */
//ObjecyTest1.java ----> ObjecyTest1.class, Emp1.class
class Emp3{
	private String name;
	private String dept;
	private int salary;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return getName() + " 사원은 " + getDept() + "에 근무하며 " + getSalary() + "원의 급여를 받습니다.";
	}
	
}

public class ObjectTest3 {
	//크롱 사원은 개발부에 근무하며 1520000원의 급여를 받습니다.
	public static void main(String[] args) {
		Emp3 em = new Emp3();
		
		em.setName("뽀로로");
		em.setDept("개발부");
		em.setSalary(0);
		
		System.out.println(em.toString());
	}

}
