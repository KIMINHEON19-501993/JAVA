package employee;
/*
 * Emp ���
 * 
 * -salary : long
 * -bonus : long
 * 
 * +Developer()
 * +Developer(eno : int, ename  : String, phone : String)
 * 
 * +toString():String
 * 
 * ���� : ���ʽ� ���� 150000�� �������� ����
 */
public class Developer extends Emp{
	private long salary;
	private long bonus;
	
	public Developer() {
		super();
		// TODO �ڵ� ������ ������ ����
	}

	public Developer(int eno, String ename, String phone) {
		super(eno, ename, phone);
		// TODO �ڵ� ������ ������ ����
	}

	@Override
	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public void setBonus(long bonus) {
		this.bonus = bonus + 150000;
	}
	
	public String toString() {
		return "�����ȣ : " + getEno()
			+ "\n����̸� : " + getEname()
			+ "\n������ȣ : " +getPhone()
			+ "\n�⺻�޿� : " +salary
			+ "\n���ʼ� + ���� : " + bonus
			+ "\n���ޱݾ� : " + (salary + bonus)+ "��";
	}
}
