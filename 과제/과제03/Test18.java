package 과제03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test18 {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		[문제18] 콘솔로 입력받아 구구단을 구하시오 (단일 for문)
//        이때, 5단을 입력하면 5단,6단 출력하시오 4단을 입력하면 4단,5단 출력하시오

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num;

		System.out.print("단을 입력 하시오 : ");
		num = Integer.parseInt(br.readLine());

		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i) + "\t" 
								+ (num + 1) + " * " + i + " = " + ((num + 1) * i));
		}

	}
}
