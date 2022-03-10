package 과제05;

public class Test32 {
	public final static double PI = 3.141592;

	public double area(int a) {
		return a * a * PI;
	}

	public double area(int a, int b) {
		return (double) a * b;
	}

	public double area(int a, int b, int c) {
		return ((a + b) * c) / 2.0;
	}

	public static void main(String[] args) {
//	문제32]함수 overloading을 이용하여 다음을 완성하시오
//	(1)클래스명:Test32
//	    ① 필드명 : PI:double     (초기값:3.141592, final로 선언)
//	               public final double PI=3.141592; 
//
//	    ② 메소드 : 
//	           +area(a:int):double                     => 원의넓이=반지름*반지름*PI
//	           +area(a:int, b:int):double           => 사각형의넓이=가로*세로
//	           +area(a:int, b:int, c:int):doble    => 사다리꼴의 넓이=(밑변 + 윗변 )*높이/2 
//	(2)조건
//	     1)각각의 area(3),area(4,5),area(3,4,7) 메서드를 만들어 결과값을 구한다
//	     2) main에서
//	             System.out.println("원의 넓이:" + ob.area(3));

		Test32 ob = new Test32();
		System.out.printf("원의 넓이 : %f\n", ob.area(3));
		System.out.printf("원의 넓이 : %.1f\n", ob.area(4, 5));
		System.out.printf("원의 넓이 : %.1f", ob.area(3, 4, 7));

	}
}
