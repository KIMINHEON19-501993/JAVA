package 과제03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test13 {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		﻿[문제13]연도를 입력받아 윤년/평년 구하기
//	      (공식) ①윤년 : 연도를 4로 나누어 떨어져야 하고 
//				  평년 : 연도를 100으로 나누어 떨어지지 않아야함
//		        ②윤년 : 또는 연도를 400으로 나누어 떨어져야 함 
//		  (참고) 4(윤년), 100(평년), 400(윤년)임 

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year;

		System.out.print("연도를 입력 하시오. : ");
		year = Integer.parseInt(br.readLine());

//		if (year % 100 != 0) 
//		{
//			if (year % 4 == 0) 
//			{
//				System.out.println("윤년 입니다.");
//			}
//			else 
//			{
//				System.out.println("평년 입니다.");
//			}
//		} 
//		else if(year % 400 == 0) 
//		{
//			System.out.println("윤년 입니다.");
//		}
		if (year % 4 == 0) {
			
			if(year % 100 == 0) {
				
				if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0){
					System.out.println("윤년 입니다.");
				}else {
					System.out.println("평년 입니다.");
				}
			}else if(year % 400 == 0 || year % 4 == 0){
				System.out.println("윤년 입니다.");
			}
		} else {
			System.out.println("평년 입니다.");
		}
	}
}
