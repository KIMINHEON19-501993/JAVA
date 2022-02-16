package step_03_제어문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 다음과 같이 출력
 반지름 입력
 원의 넓이 78.5  <-- 3.14 * r * r
 원의 둘레 31.4  <-- 2 * 3.14 * r
*/
public class InputTest_4 {

	public static void main(String[] args) throws NumberFormatException, IOException   {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int r;
		double a;
		double b;

		//입력(키보드, 파일, 네트워크, 대입)
		System.out.print("반지름 을 입력 하세요 : ");
		r = Integer.parseInt(br.readLine());

		//계산
		a = 3.14 * r * r;
		b = 2 * 3.14 * r;

		//출력
		System.out.printf("원의 넓이 : %.1f\n", a);
		System.out.printf("원의 넓이 : %.1f", b);

	}

}
