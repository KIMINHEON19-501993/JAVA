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
		System.out.printf("%s ����� %s�� �ٹ��ϸ� %d���� �޿��� �޽��ϴ�.",name,dept,salary);
	}
	
}

public class ObjectTest1 {
	//�Ƿη� ����� ���ߺο� �ٹ��ϸ� 1520000���� �޿��� �޽��ϴ�.
	public static void main(String[] args) {
		Emp1 em = new Emp1();
		
		em.setEmp1("�Ƿη�", "���ߺ�", 1520000);
		em.printEmp();
	}

}
