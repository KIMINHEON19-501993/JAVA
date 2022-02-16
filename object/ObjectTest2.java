package object;
/*클래스명 Emp1
 * -name : String
 * -dept : String
 * -salary : int
 * +setEmp1(name : String, dept : String, salary : int):void
 * +printEmp():void
 * 
 */
//ObjecyTest1.java ----> ObjecyTest1.class, Emp1.class
class Emp2{
	private String name;
	private String dept;
	private int salary;
	
	public void setEmp1(String name, String dept, int salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	public String printEmp() {
		return name + " 사원은 " + dept + "에 근무하며 " + salary + "원의 급여를 받습니다.";
	}
	
}

public class ObjectTest2 {
	//크롱 사원은 개발부에 근무하며 1520000원의 급여를 받습니다.
	public static void main(String[] args) {
		Emp2 em = new Emp2();
		
		em.setEmp1("크롱", "개발부", 1520000);
		System.out.println(em.printEmp());
	}

}
