package employee;
/*
 * -eno : int
 * -ename  : String
 * -phone : String
 * 
 * +Emp()
 * +Emp(eno : int, ename  : String, phone : String)
 * +getter
 * 
 * +setSalary(salary:long):void abstract
 * +setBonus(bonus:long):void abstract
 */
public abstract class Emp {
	private int eno;
	private String ename;
	private String phone;
	
	
	public Emp() {
		
	}


	public Emp(int eno, String ename, String phone) {
		this.eno = eno;
		this.ename = ename;
		this.phone = phone;
	}
	
	public int getEno() {
		return eno;
	}


	public String getEname() {
		return ename;
	}


	public String getPhone() {
		return phone;
	}
	
	abstract public void setSalary(long salary);
	abstract public void setBonus(long bonus);
	
	
}
