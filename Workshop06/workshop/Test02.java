package workshop;

public class Test02 {
//	[ 문제 2 ] 다음과 같은 조건을 만족하는 프로그램을 작성 하시오. 
//	프로그램 실행 시 eclipse argument로 5~10까지의 정수형 데이터를 입력 받는다. 
//	입력 받은 정수 값을 Calc class의 calculate()함수를 이용하여 1부터 입력 받은 숫자까지
//	짝수만 더하는 프로그램을 작성 한다.
	public static void main(String[] args) {
		int num;
		Calc ca = new Calc();
		
		num = Integer.parseInt(args[0]);
		int sum = ca.calculate(num);
		System.out.println("합계 : "+sum);
		
	}

}
