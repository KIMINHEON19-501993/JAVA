package 과제09;

import java.text.NumberFormat;
import java.util.Scanner;

/*
[문제 48]급여명세서 프로그램 
다형성을 이용하여 다음 프로그램을 작성하시오

                **** 급여명세서 ****
------------------------------------------------------------------------------------------------------
이름      기본급    가족수   가족수당   시간외근무  시간외수당   세금     인센티브(%)  성과금      실수령액
--------------------------------------------- ---------------------------------------------------------
소서노   750,000원    2     40,000원     3         15,000원  75,000원     0.5     375,000원   1,105,000원
고주몽   800,000원    1     20,000원     4         20,000원  80,000원     0.5     400,000원   1,160,000원
모팔모   650,000원    6     60,000원     2         10,000원  65,000원     0.5     325,000원     980,000원
인원수 : 3명

인센티브(%)입력:0.7

                **** 급여명세서 ****
------------------------------------------------------------------------------------------------------
이름      기본급    가족수   가족수당   시간외근무  시간외수당   세금     인센티브(%)  성과금      실수령액
------------------------------------------------------------------------------------------------------
소서노   750,000원    2     40,000원     3        15,000원    75,000원    0.7      525,000원  1,255,000원
고주몽   800,000원    1     20,000원     4        20,000원    80,000원    0.7      560,000원  1,320,000원
모팔모   650,000원    6     60,000원     2        10,000원    65,000원    0.7      455,000원  1,110,000원
인원수 : 3명
계속하려면 아무 키나 누르십시오 . . .


1. 클래스명 : Salary
필드명   : -name:String 
         -pay:int
         -family_p:int
         -overtime_p:int
         -incen_p:int
         -tax:int
         -total_pay:int
         -family:int
         -overtime:int
         -incentive:float     ==> 초기값: 0.5, static
         +count:int        ==>  초기값: 0, static, 총인원
생성자 : Salary(String name, long pay, int family, int overtime)
      +getter & setter

2. 인터페이스명 : Calculate
메서드       :   +calc():void           ==> 급여계산

3. 인터페이스명 : Output
메서드       : +out():void             ==> 출력

4. Salary, Calulate, Output를 다중 상속받아서 처리(오브젝트배열이용)
①클래스명 : PayTable
②메서드명 : +title():void           ==> 급여명세서,이름,기본급등 제목Line을 출력하는 메서드
             +footer():void        ==> 인원수를출력하는메서드

③main()메서드에서 다음과 같이 오브젝트배열(Object Array)를 이용하여 프로그램을 작성하시오
PayTable []pt = new PayTable[3];
pt[0] = new PayTable("소서노",750000,2,3);
pt[1] = new PayTable("고주몽",800000,1,4);
pt[2] = new PayTable("모팔모",650000,6,2);

(처리조건)
1. 가족수당 : 가족이 3명미만이면 가족수*20000, 3명이상이면 무조건 60000
2. 시간외수당 : 시간외근무 * 5000
3. 세금 : 기본급의 10%
4. 성과금 : 인센티브 * 기본급
5. 실수령액 : 기본급 + 가족수당 + 성과금 + 시간외수당 - 세금
6. 모든금액에는 세자리마다(,)콤마와 화폐단위 "원"을 붙이시오
(NumberFormat클래스 사용)
7.main()메서드에서 인센티브를 입력받아 급여명세서를 다시출력하시오
*/

class Salary {
	private String name;
	private int pay;
	private int family_p;
	private int overtime_p;
	private int incen_p;
	private int tax;
	private int total_pay;
	private int family;
	private int overtime;
	private static float incentive = 0.5f;
	public static int count = 0;

	public Salary() {
		// TODO 자동 생성된 생성자 스텁
	}

	Salary(String name, long pay, int family, int overtime) {
		this.name = name;
		this.pay = (int) pay;
		this.family = family;
		this.overtime = overtime;
	}

	public String getName() {
		return name;
	}

	public int getPay() {
		return pay;
	}

	public int getFamily_p() {
		return family_p;
	}

	public int getOvertime_p() {
//2. 시간외수당 : 시간외근무 * 5000
		return overtime_p;
	}

	public int getIncen_p() {
//4. 성과금 : 인센티브 * 기본급
		return incen_p;
	}

	public int getTax() {
//3. 세금 : 기본급의 10%
		return tax;
	}

	public int getTotal_pay() {
//5. 실수령액 : 기본급 + 가족수당 + 성과금 + 시간외수당 - 세금

		return total_pay;
	}

	public int getFamily() {
		return family;
	}

	public int getOvertime() {
		return overtime;
	}

	public static float getIncentive() {
		return incentive;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public void setFamily_p(int family_p) {

		this.family_p = family_p;

	}

	public void setOvertime_p(int overtime_p) {
		this.overtime_p = overtime * 5000;
	}

	public void setIncen_p(int incen_p) {
		this.incen_p = incen_p;
	}

	public void setTax(int tax) {

		this.tax = (int) (tax * 0.1);
	}

	public void setTotal_pay(int total_pay) {
		this.total_pay = total_pay;
	}

	public void setFamily(int family) {
		this.family = family;
	}

	public void setOvertime(int overtime) {
		this.overtime = overtime;
	}

	public static void setIncentive(float incentive) {
		
		Salary.incentive = incentive;
		
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Salary.count = count;
	}

}

interface Calculate {
	public void calc();
}

interface Output {
	public void out();
}

class PayTable extends Salary implements Calculate, Output {
	public PayTable() {
		// TODO 자동 생성된 생성자 스텁
	}

	public PayTable(String name, long pay, int family, int overtime) {
		super(name, pay, family, overtime);
		// TODO 자동 생성된 생성자 스텁
	}

	public void title() {
		System.out.println("                               *****급여명세서 *****                               ");
		System.out.println(
				"--------------------------------------------------------------------------------------------");
		System.out.println("이름      기본급    가족수   가족수당   시간외근무  시간외수당     세금     인센티브(%)  성과금      실수령액");
		System.out.println(
				"--------------------------------------------------------------------------------------------");

	}

	public void footer() {

		System.out.println(count);
	}

	@Override

	public void out() {
		NumberFormat num = NumberFormat.getInstance();
		System.out.print(getName() + "   ");
		System.out.print(num.format(getPay()) + "원   ");
		System.out.print(getFamily() + "    ");
		System.out.print(num.format(getFamily_p()) + "원      ");
		System.out.print(num.format(getOvertime()) + "      "); 
		System.out.print(num.format(getOvertime_p()) + "원   ");
		System.out.print(num.format(getTax()) + "원     ");
		System.out.print(num.format(getIncentive()) + "%    ");
		System.out.print(num.format(getIncen_p()) + "원     ");
		System.out.print(num.format(getTotal_pay()) + "원\n");
	}

	@Override
	public void calc() {
		//가족수당
		if (this.getFamily() >= 3) {
			setFamily_p(60000);
		} else {
			setFamily_p(getFamily() * 20000);
		}
		//시간외수당
		setOvertime_p(getOvertime() * 5000);
		//세금
		setTax(getPay());
		//성과금
		setIncen_p((int)(getIncentive()*getPay()));
		//실수령액
		setTotal_pay(getPay() + getFamily_p() + getIncen_p() + getOvertime_p() - getTax());

//		1. 가족수당 : 가족이 3명미만이면 가족수*20000, 3명이상이면 무조건 60000
//		2. 시간외수당 : 시간외근무 * 5000
//		3. 세금 : 기본급의 10%
//		4. 성과금 : 인센티브 * 기본급
//		5. 실수령액 : 기본급 + 가족수당 + 성과금 + 시간외수당 - 세금
//		6. 모든금액에는 세자리마다(,)콤마와 화폐단위 "원"을 붙이시오
//		(NumberFormat클래스 사용)
//		7.main()메서드에서 인센티브를 입력받아 급여명세서를 다시출력하시오
	}

}

class Test48 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PayTable[] pt = new PayTable[3];
		pt[0] = new PayTable("소서노", 750000, 2, 3);
		pt[1] = new PayTable("고주몽", 800000, 1, 4);
		pt[2] = new PayTable("모팔모", 650000, 6, 2);
		
		
		PayTable pt2 = new PayTable();
		pt2.title();

		for (PayTable ob : pt) {
			ob.calc();
			ob.out();
			Salary.count++;
		}
		System.out.println("인원수 : " + Salary.getCount() + "명");
		System.out.print("인센티브(%)입력 : "); 
		Salary.setIncentive(sc.nextFloat());
		
		pt2.title();
		for (PayTable ob : pt) {
			
			ob.calc();
			ob.out();
		}
		sc.close();
	}
}
