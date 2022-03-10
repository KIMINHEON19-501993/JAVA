package employee;
/*
 * Emp 상속
 * 
 * -salary : long
 * -bonus : long
 * 
 * +Engineer()
 * +Engineer(eno : int, ename  : String, phone : String)
 * 
 * +toString():String
 * 
 * 조건 : 보너스 값에 100000을 수당으로 지급
 */
public class Engineer extends Emp{
	private long salary;
	private long bonus;
	
	public Engineer() {
		super();
		// TODO 자동 생성된 생성자 스텁
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
		return "사원번호 : " + getEno()
			+ "\n사원이름 : " + getEname()
			+ "\n내선번호 : " +getPhone()
			+ "\n기본급여 : " +salary
			+ "\n보너수 + 수당 : " + bonus
			+ "\n지급금액 : " + (salary + bonus) + "원";
	}
	
	

}
