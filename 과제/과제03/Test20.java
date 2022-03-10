package 과제03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test20 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// [문제 20] for문을 이용해서 제곱승을 구하시오
		// x값을 입력하시오: 2
		// y값을 입력하시오: 3
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x;
		int y;
		int n;

		System.out.print("x의 값을 입력 하시오. : ");
		x = Integer.parseInt(br.readLine());
		System.out.print("y의 값을 입력 하시오. : ");
		y = Integer.parseInt(br.readLine());
		n = x;

		for (int i = 0; i <= y; i++) {
			if (y == 0) {
				System.out.println(n + "의 " + y + "승은 1");
			} else {
				x = x * n;
				if (i == 1) {
					x = n;
					if (y == 1) {
						System.out.println(n + "의 " + y + "승은 " + n);
					}
				} else if (i == y) {
					System.out.println(n + "의 " + y + "승은 " + x);
				}

			}
		}
	}
}
