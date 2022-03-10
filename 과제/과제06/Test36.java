package 과제06;

public class Test36 {

	public Test36(int a, int b) {
		int max =(a > b) ? a : b;
		System.out.println("max = " + max);
	}

	public Test36(double a, double b) {
		double max =  (a > b) ? a : b;
		System.out.println("max = " + max);
	}
	
	public Test36(char a, char b) {
		char max = ((int)a > (int)b) ? a : b;
		System.out.println("max = " + max);
	}

	
	
	public static void main(String[] args) {
//		[문제36]생성자 함수를 overloading하여 두수중 큰수를 출력하는 
//		overloading : 한 클래스내에 같은 이름을 가진 메서드를 여러 개 정의하는 행위
//        프로그램을 완성하시오.(단, 계산과 출력은 생성자에서 할것)
//		(1) main()에서
//		new Test36(10,20);
//		new Test36(12.4, 9.45);
//		new Test36('Z', 'p');
//		
//		(2) main()함수를 보고 나머지를 완성하시오
		
		new Test36(10,20);
		new Test36(12.4, 9.45);
		new Test36('Z', 'p');

	}
}
