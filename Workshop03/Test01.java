
public class Test01 {

	public static void main(String[] args) {
//		[ 문제 1 ] 다음과 같은 조건을 만족하는 프로그램을 작성 하시오 
//		1. 조건 
//		1부터 20까지의 정수 중에서 2의 배수가 아니고 3의 배수가 아닌 수의 총합을 구하시오.


		int sum = 0;

		for (int i = 1; i < 21; i++) {
			if (i % 2 != 0) {
				if (i % 3 != 0) {
					sum += i;
				}
			}
		}
		System.out.println("sum=" + sum);
	}

}
