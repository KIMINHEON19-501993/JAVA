package com.elite;

/*
 * [ 문제 1 ] 다음과 같은 조건을 만족하는 프로그램을 작성 하시오. 
1. 조건 
프로그램 실행 시 eclipse argument로 5~10까지의 정수형 데이터를 입력 받는다.
 5~10 이외의 정수형이 입력되면 “다시 입력하세요”라고 출력 한다. 
 입력 받은 정수 값을 Calc class의 calculate()함수를 이용하여 1부터 입력 받은 숫자까지짝수만 
 더하는 프로그램을 작성 한다.
 */
public class Test01 {

	public static void main(String[] args) {
		Calc cale = new Calc();
		int data;
		int sum;

		data = Integer.parseInt(args[0]);
		if (data >= 5 && data <= 10) {
			System.out.println("입력값 : " + data);
			sum = cale.calculate(data);
			System.out.println("결과 : " + sum);
		} else
			System.out.println("다시 입력하세요.");

	}

}
