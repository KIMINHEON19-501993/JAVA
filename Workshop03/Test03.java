
public class Test03 {

	public static void main(String[] args) {
//		[ 문제 3 ] 다음과 같은 조건을 만족하는 프로그램을 작성 하시오 
//		1. 조건 
//		두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을하시오

		for (int i = 1; i <= 6; i++) {
			
			for (int j = 1; j <= 6; j++) {
				
				if ((i + j) == 6) {
					
					System.out.println(i + " + " + j + " = " + (i + j));
					
				}
			}

		}
	}
}
