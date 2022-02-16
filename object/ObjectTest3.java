package object;
/*Ŭ������ Emp3
 * -name : String �������
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
		return getName() + " ����� " + getDept() + "�� �ٹ��ϸ� " + getSalary() + "���� �޿��� �޽��ϴ�.";
	}
	
}

public class ObjectTest3 {
	//ũ�� ����� ���ߺο� �ٹ��ϸ� 1520000���� �޿��� �޽��ϴ�.
	public static void main(String[] args) {
		Emp3 em = new Emp3();
		
		em.setName("�Ƿη�");
		em.setDept("���ߺ�");
		em.setSalary(0);
		
		System.out.println(em.toString());
	}

}
