package 과제06;

import java.util.Scanner;
//[문제 35] 원의 반지름을 입력받아 넓이를 계산하고 출력하시오
//(1)클래스명: Circle
//        -r:int                          ==> 반지름을 저장할 정수형변수
//       -PI:double                   ==> 초기값=3.141592 , final키워드
//
//       +Circle()                      ==> Scanner이용해서 입력받을것
//       +process():double        ==> 원의넓이를 계산해서 리턴
//       +output():void             ==> 결과를 출력
//(2) main()에서
//       Circle ob=new Circle();
//       ob.output();
class Circle{
	private int r;
	final private double PI = 3.141592;
	
	public Circle(){
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력하시오. : "); r = sc.nextInt();
		sc.close();
	}
	
	public double process() {
		return r * r * PI;
	}
	public void output() {
		System.out.printf("원의넓이 : %.1f", process());
	}
}
public class Test35 {

	public static void main(String[] args) {
		 Circle ob=new Circle();
		 ob.output();
	}
}

	

