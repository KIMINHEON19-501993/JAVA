package 과제06;

import java.util.Random;

public class Test34 {

	public static void main(String[] args) {
//		﻿[문제 34] 크기가 5인 정수형배열을 만들고 난수(1~50)를 저장하여 출력하시오.

		int[] num = new int[5];
		Random rd = new Random();
		int result;
		int sum = 0;
		System.out.println("-정렬 전-");

		// 1~50 사이의 난수를 배열에 저장
		for (int i = 0; i < num.length; i++) {
			num[i] = rd.nextInt(50) + 1;// 1~50
			sum += num[i];
			System.out.print("num[" + i + "] = " + num[i] + " ");
		}

		// 작은숫자 부터 정렬
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				//num[i] 보다 num[j] 가 크거나 같으면 
				if (num[i] <= num[j]) {
					result = num[j];
					num[j] = num[i];
					num[i] = result;
				}
			}
		}
		System.out.println("\n");
		System.out.println("-정렬 후-");
		for (int i = 0; i < num.length; i++) {
			
			System.out.print("num[" + i + "] = " + num[i] + " ");
		}
		System.out.println();
		System.out.println("합 = " + sum);

	}
}
