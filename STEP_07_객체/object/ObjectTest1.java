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
class Emp1{
	private String name;
	private String dept;
	private int salary;
	
	public void setEmp1(String name, String dept, int salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	public void printEmp() {
		System.out.printf("%s 사원은 %s에 근무하며 %d원의 급여를 받습니다.",name,dept,salary);
	}
	
}

public class ObjectTest1 {
	//뽀로로 사원은 개발부에 근무하며 1520000원의 급여를 받습니다.
	public static void main(String[] args) {
		Emp1 em = new Emp1();
		
		em.setEmp1("뽀로로", "개발부", 1520000);
		em.printEmp();
	}

}
