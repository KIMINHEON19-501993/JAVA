package 과제07;
//[문제 41] 다음 프로그램을 완성하시오

//(1)클래스명 : Salary
//  -name:String (이름)
//  -salary:int  (연봉)
//  +Salary()
//  +Salary(name:String, salary:int) ==> name, salary에 대입
//  +viewInfomation():void     ==> 메서드에서 이름과 연봉을 출력
//
//(2)클래스명 : Test41   ==> Salary를 상속받음
//  -department:String(부서)
//  +Test41()
//  +Test41(nameString, salary:int, department:String)
//  +viewInfomation():void     ==> 부서 출력
//
//(3)main()함수에서
//   Test41  ob = new Test41("홍길동",85000000,"개발부"); 
//   //나머지를 완성하시오
//           :

class Salary {
	private String name;
	private int salary;

	public Salary() {
	
	}

	public Salary(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public void viewInfomation() {
		System.out.println("이름 : " + name);
		System.out.println("연봉 : " + salary);
		
	}

}

class Test41 extends Salary {

	private String department;

	public Test41() {
		super();
	}

	public Test41(String name, int salary, String department) {
		super(name,salary);
		this.department = department;
	}
	
	public void viewInfomation() {
		super.viewInfomation();
		System.out.println("부서 : " + department);
	}

	public static void main(String[] args) {

		Test41 ob = new Test41("홍길동", 85000000, "개발부");
		ob.viewInfomation();
	}
}
