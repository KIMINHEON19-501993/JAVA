package com.elite.test01;

/*
 * [ 문제 1 ] 다음과 같은 조건을 만족하는 프로그램을 작성하시오
2차원 배열에 들어 있는 데이터들의 합계와 평균을 구한다.
1. 사용 데이터
int [][] array = {

{12, 41, 36, 56, 21},
{82, 10, 12, 61, 45},
{14, 16, 18, 78, 65}, {45, 26, 72, 23, 34}
};
 */
public class ArrayTest {

	public static void main(String[] args) {
		int[][] array = { { 12, 41, 36, 56, 21 }, { 82, 10, 12, 61, 45 }, { 14, 16, 18, 78, 65 },
				{ 45, 26, 72, 23, 34 } };

		double sum = 0;
		int count = 0;
		double avg = 0.0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				count++;
			}
		}
		System.out.println("합계 : " + sum);
		avg = sum / (double) count;
		System.out.println("평균 : " + avg);

	}

}
