package ifex;

/*--변수 a를 선언하고 55또는 46을 대입한후
1.단수 if문 이용 조건식에서 "55는 50보다 크거나 같다.", 
					   "50보다 작으면 46은 50보다 작다."
2.if-else 이용 a%2 == 0
	a의 값이 홀수 인지 짝수 인지 출력
3.if~else~if 이용
 a의 변수 값이 "양수" "음수" "zero" 인지 출력
*/
public class Ifex_3 {

	public static void main(String[] args) {

		int a = 55;

		// 1번

		if (a >= 50) {
			System.out.println(a + "는 50보다 크거나 같다.");
		}
		if (a < 50) {
			System.out.println(a + "는 50보다 작다.");
		}
		// 2번

		if (a % 2 == 0) {
			System.out.println(a + "는 짝수입니다.");
		} else {
			System.out.println(a + "는 홀수입니다.");
		}

		// 3번
		if (a > 0) {
			System.out.println(a + "는 양수입니다.");
		} else if (a < 0) {
			System.out.println(a + "는 음수입니다.");
		} else {
			System.out.println(a + "는 zore입니다.");

		}

	}

}
