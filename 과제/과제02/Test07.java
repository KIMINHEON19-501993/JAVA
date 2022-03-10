package 과제02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test07 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//﻿[문제7] BufferedReader를 이용하여 입력받아 두수중 큰수를 출력하시오
        //(단, 비교연산은 삼항연산자를 이용하시오)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a;
		int b;
		int big;
		
		System.out.print("a를 입력 하시오 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("b를 입력 하시오 : ");
		b = Integer.parseInt(br.readLine());
		
		big = (a > b)? a : b;
		
		System.out.println("큰수 : " + big);
		
	}

}
