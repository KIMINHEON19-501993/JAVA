package object;
/*Ŭ������ Emp1
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
		return name + " ����� " + dept + "�� �ٹ��ϸ� " + salary + "���� �޿��� �޽��ϴ�.";
	}
	
}

public class ObjectTest2 {
	//ũ�� ����� ���ߺο� �ٹ��ϸ� 1520000���� �޿��� �޽��ϴ�.
	public static void main(String[] args) {
		Emp2 em = new Emp2();
		
		em.setEmp1("ũ��", "���ߺ�", 1520000);
		System.out.println(em.printEmp());
	}

}
