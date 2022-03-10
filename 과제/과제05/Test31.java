package 과제05;

public class Test31 {
	
	static double base = 5.0;
	static double height = 3.5;
	
	public double getArea(double base, double height) {
		return (base * height) / 2.0;
	}

	public double getHypotenuse(double base, double height) {
		return Math.sqrt((base * base) + (height * height));
	}

	public double getPerimeter(double base, double height, double getHypotenuse) {
		return base + height + getHypotenuse;
	}

	public static void main(String[] args) {
//		[문제31]다음을 수정/완성하시오
//		(1)클래스명:Test31
//		     필드명 : -base:double  (초기값:5.0)
//		                 -height:double (초기값:3.5)
//		     메서드명: +getArea():double
//		                   +getHypotenuse():double 
//		                   +getPerimeter():double
//		(2)조건
//		   1)공  식 : 삼각형의 넓이 = (밑변 * 높이) /2
//		                 빗변길이 = Math.sqrt(밑변*밑변+높이*높이)  
//		                 둘레길이 = 밑변 + 높이 + 빗변길이 
//		   2) getArea()는 삼각형의 넓이를 리턴한다
//		       getHypotenuse() 빗변의 길이를 리턴한다
//		       getPerimeter()는 둘레길이를 리턴한다
//		   3) main에서 Test31으로 객체 ob를 생성한다 
//		           Sytem.out.println("삼각형의 넓이 :" + ob.getArea());

				
		Test31 ob = new Test31();
		System.out.printf("삼각형의 넓이 : %.2f\n", ob.getArea(base, height));
		System.out.printf("빗변 길이 : %.2f\n", ob.getHypotenuse(base, height));
		System.out.printf("둘레 길이 : %.2f\n", ob.getPerimeter(base, height,ob.getHypotenuse(base, height)));
		
	}

}
