package 과제08;

import java.text.DecimalFormat;

/*
[문제44] 오버라이드(override)를 이용하여 다음 프로그램을 작성하시오
(1)클래스명: Emp
   name:String                   ==> 초깃값 : 홍길동
   salary:int                        ==> 초깃값 : 32000000
   +getDisplay():String        ==> 이름과 연봉출력

(2)클래스명: EmpExt
   department:String        ==> 초깃값 : "홍보부";
   +getDisplay():String    ==> 부서출력

(3)Test44클래스 main()에서
    Emp ob = new EmpExt();   
    //나머지를 완성하시오
*/

class Emp{
	String name = "홍길동";
	int salary = 32000000;	
	
	public String getDisplay() {
		return "";
	}
}
class EmpExt extends Emp{
	String department = "홍보부";
	
	@Override
	public String getDisplay() {
		DecimalFormat df1 = new DecimalFormat("###,###,###");
		return "이름 : " + name + "\n연봉 : " +(df1.format(salary)) + "원\n부서 : " + department;
	}
}
class Test44  {

	public static void main(String[] args) {
		Emp ob = new EmpExt();
		System.out.println(ob.getDisplay());

	}
}
