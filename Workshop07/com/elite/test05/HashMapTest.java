package com.elite.test05;

import java.util.HashMap;
import java.util.Random;

/*
 * 문제 5 ] 아래 조건에 맞는 프로그램을 작성하시오
HashMap에 1~100사이의 정수형 데이터 10개를 랜덤하게 만들어서 저장한다
HashMap에 데이터 입력 시, 순서대로 1부터 10까지의 Number를 Key로 이용하여 입력한다.
 */
public class HashMapTest {
	public static void main(String[] args) {

		Random rm = new Random();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		double sum = 0.0;

		for (int i = 0; i < 10; i++) {
			// HashMap에 1~100까지의 정수를 랜덤하게 10개 저장한다.
			map.put(i, rm.nextInt(100) + 1);
		}
		for (int i = 0; i < 10; i++) {
			// HashMap 데이터를 화면에 출력한다.
			System.out.print(map.get(i) + " ");
		}

		for (int i = 0; i < 10; i++) {
			// HashMap 데이터의 합계를 계산한다.
			sum += map.get(i);
		}
		System.out.println("\n합계 : " + String.format("%.2f", sum));
		System.out.println("평균 : " + String.format("%.2f", (sum / 10.0)));
		// 합계와 평균을 화면에 출력한다.
	}
}
