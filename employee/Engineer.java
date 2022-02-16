package employee;
/*
 * Emp ���
 * 
 * -salary : long
 * -bonus : long
 * 
 * +Engineer()
 * +Engineer(eno : int, ename  : String, phone : String)
 * 
 * +toString():String
 * 
 * ���� : ���ʽ� ���� 100000�� �������� ����
 */
public class Engineer extends Emp{
	private long salary;
	private long bonus;
	
	public Engineer() {
		super();
		// TODO �ڵ� ������ ������ ����
	}

	public Engineer(int eno, String ename, String phone) {
		super(eno, ename, phone);
	}

	@Override
	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public void setBonus(long bonus) {
		this.bonus = bonus + 100000;
	}


	public String toString() {
		return "�����ȣ : " + getEno()
			+ "\n����̸� : " + getEname()
			+ "\n������ȣ : " +getPhone()
			+ "\n�⺻�޿� : " +salary
			+ "\n���ʼ� + ���� : " + bonus
			+ "\n���ޱݾ� : " + (salary + bonus) + "��";
	}
	
	

}
