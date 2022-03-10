package 과제08;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
---------------------------------------------------------------------------------------------------
[문제 45] 추상클래스를 이용하여 다음 프로그램을 완성하시오
(1)추상클래스:  Height 
   +INCH:double                              ==> final변수, 초기값:2.54 
   +getInch(double cm):double          ==> 추상메서드
(2)Test45클래스에서 Height를 상속받으시오
(3)Test45클래스 main에서
      - Scanner를 이용해서 cm를 입력받는다
      - getInch()메서드를 호출해서 결괏값을 출력한다
*/

abstract class Height {
	final public double INCH = 2.54;

	abstract double getInch(double cm);
}

class Test45 extends Height {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df1 = new DecimalFormat("###,###,###.###");
		double cm;
		System.out.print("입력(cm)를 입력하시오 : ");
		cm = sc.nextDouble();

		Test45 test = new Test45();
		System.out.println(df1.format(test.getInch(cm)) + "인치 입니다.");
		
		sc.close();
	}

	@Override
	double getInch(double cm) {
		return cm / INCH;
	}
}
