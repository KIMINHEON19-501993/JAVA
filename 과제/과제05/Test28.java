package 과제05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test28 {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		[문제28] 다음 프로그램을 작성하시오
//		(1)Argument를 통해 숫자를 입력받은후 입력숫자만큼 정수형배열을 만든다
//		(2)콘솔에서 각각 배열에 데이타를 입력 받는다
//		(3)입력받은 데이타의 평균을  구한다 

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		double[] score = new double[Integer.parseInt(args[0])];
		double tot = 0.0;
		double avg;
		for (int i = 0; i < score.length; i++) {
			System.out.print("score[" + i + "]" + "를 입력 하시오. : ");
			score[i] = Double.parseDouble(br.readLine());
			tot += score[i];
		}
		avg =tot / score.length;
		
		System.out.printf("평균 : %.2f",avg);

	}
}
