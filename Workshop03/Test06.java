
public class Test06 {

	public static void main(String[] args) {
//		[ 문제 6 ] 다음과 같은 조건을 만족하는 프로그램을 작성 하시오 
//		1. 조건 
//		1부터 100까지 더하는 프로그램을 작성 한다. 단, eclipse에서 argument로 
//		1자리 정수형이터를 입력 받아 입력 받은 수의 배수만 더한다. 
//		입력 예1: 5  
//		5,10,15, … , 100의 합

		int a = Integer.parseInt(args[0]);
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % a == 0) {
				if(i <= 99) {
					sum += i;
					System.out.print(i + " + ");
				}
				else if(i == 100) {
					sum += i;
					System.out.print(i);
				}
			}
		}
		System.out.println(" = " + sum);
	}

}
