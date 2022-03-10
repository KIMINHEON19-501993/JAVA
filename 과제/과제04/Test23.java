package 과제04;

public class Test23 {

	public static void main(String[] args) {
		// [문제 23] 단일for문과 if문을 이용해서
		// 1-10까지의 합을 출력하는 프로그램을 완성하시오

		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum += i;
			System.out.print(i + "+");
			if (i == 10) {
				System.out.println("=" + sum);
			}
		}
	}
}
