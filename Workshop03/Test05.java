
public class Test05 {

	public static void main(String[] args) {
//		[ 문제 5 ] 다음과 같은 조건을 만족하는 프로그램을 작성 하시오 
//		 
//		세 개의 주사위를 던졌을 때, 눈의 곱이 3의 배수인 값을 출력하는 프로그램을 작성하시오 

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				for (int k = 1; k <= 6; k++) {
					if ((i * j * k) % 3 == 0) {

						System.out.println(i + " * " + j + " * " + k + " = " + (i * j * k));
					}
				}
			}
		}
	}

}
	