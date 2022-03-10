package workshop;

/*
 * [ 문제 1 ] 다음과 같은 조건을 만족하는 프로그램을 작성 하시오
각 부서 별 평가 점수를 입력 받아 부서 별 평가를 하고자 한다.
 A, B, C, D, E 와 같이 5개의 평가 기준으로 구성 되며 각각의 점수를 이용하여 구한다.
(A+B)/2 : 60%
(C+D)/2 : 20%
E : 20%
90 이상이면: Gold Class
80 이상이면: Silver Class
70 이상이면: Bronze Class
70 미만이면: Normal Class
1. 사용 데이터
5개의 점수를 입력 받는다.
5개가 아니면 “다시 입력 하세요”라고 메시지를 출력 한다.
10부터 99가지의 값을 입력 받는다. 입력된 10부터 99까지의 정수가 아닌 경우 
“다시 입력 하세요”라고 메시지를 출력 한다.
 */
public class Test01 {

	public static void main(String[] args) {
		double sum = 0.0;
		String Class = null;
		double A, B, C, D, E;
		try {
			A = Double.parseDouble(args[0]);
			B = Double.parseDouble(args[1]);
			C = Double.parseDouble(args[2]);
			D = Double.parseDouble(args[3]);
			E = Double.parseDouble(args[4]);

			if (((A + B + C + D + E) >= 50 && (A < 99 || B < 99 || C < 99 || D < 99 || E < 99))) {
				sum = (((A + B) / 2) * 0.6) + (((C + D) / 2) * 0.2) + (E * 0.2);

				switch ((int) sum / 10) {
				case 9:
					Class = "Gold Class";
					break;
				case 8:
					Class = "Silver Class";
					break;
				case 7:
					Class = "Bronze Class";
					break;
				default:
					Class = "Normal Class";
				}
			} else {
				System.out.println("10 미만 또는 99 초과 다시 입력 하세요");
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("다시입력 하세요");
		}
		System.out.println("평가 점수 : " + sum);
		System.out.println("Class : " + Class);
	}

}
