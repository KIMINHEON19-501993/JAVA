package instance;

abstract class Employee{
	String name;
	int salary;
	public Employee(){
		
	}
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	abstract public int getBonus();
	
	@Override
	public String toString() {
		return name + "\t"+ salary;
	}
	
}

class Engineer extends Employee{
	public Engineer() {
		
	}

	public Engineer(String name, int salary) {
		super(name, salary);
	}
	
	@Override
	public int getBonus() {
		return 150000;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\t" + getBonus();
	}
}

class Developer extends Employee{
	public Developer() {
		
	}

	public Developer(String name, int salary) {
		super(name, salary);
	}
	
	@Override
	public int getBonus() {
		return 100000;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\t" + getBonus();
	}
}

public class InstanceofEx2 {

	public static void main(String[] args) {
		Employee[] em = new Employee[] {
				new Engineer("뽀로로", 120000),
				new Developer("패티", 1750000),
				new Engineer("크롱", 250000),
				new Developer("루피", 2350000)
		};
		/*엔지니어는 급여의 13% 개발자는 급여의 15%를 추가 수당으로 지급*/
		System.out.println("이름     급여   정규보너스   추가보너스");
		System.out.println("----------------------------------------");
		for(Employee ob : em) {
			if(ob instanceof Engineer) {
				System.out.println(ob.toString() + "\t" + (int)(ob.salary*0.13));
			}else if(ob instanceof Developer) {
				System.out.println(ob.toString() + "\t" + (int)(ob.salary*0.13));
			}
		}
	}

}
