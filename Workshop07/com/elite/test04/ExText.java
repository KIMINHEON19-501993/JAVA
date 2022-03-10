package com.elite.test04;

/*
 * [ 문제 4 ] 아래 조건에 맞는 프로그램을 작성하시오
2부터 5까지의 정수형 데이터만을 argument로 입력 받아, 1부터 입력 받은 데이터까지의 합을 출력한다. 단, 입력 받은 데이터가 2부터 5까지의 범위를 벋어나면 “입력 값에 오류가 있습니다.”를 출력한다. 1. 사용 데이터
2부터 5까지의 정수를 입력 받는다.
 */
public class ExText {
	public static void main(String[] args) {
		Calc calc = new Calc();

		
		int num = Integer.parseInt(args[0]) ;

		int n = (int) calc.getSum(num);
		
		if (n == 0) {
			new InvalidException();
		}else {
			System.out.println(calc.getSum(num));
		}
		
	}
}
