package com.elite.test03;

import java.util.StringTokenizer;

/*
[ 문제 3 ] 다음과 같은 조건을 만족하는 프로그램을 작성하시오
주어진 String 데이터를 “,”로 나누어 5개의 실수 데이터를 추출하고 합과 평균을 구한다. 단, String 문자열의 모든 실수 데이터를 배열로 만들어 계산한다.
1. 사용 데이터
String str = "1.22,4.12,5.93,8.71,9.34";
*/
public class StringTest {

	public static void main(String[] args) {
		String str = "1.22,4.12,5.93,8.71,9.34";
		double data []= new double[5];
		double sum = 0;
		double avg = 0.0;
		// StringTokenizer를 이용하여 데이터를 꺼낸다.
		StringTokenizer token = new StringTokenizer(str,",");
		for (int i = 0; i < data.length; i++) {
			// 배열에 실수 데이터를 넣는다.
			
			data[i] = Double.parseDouble(token.nextToken());
		}
		
		
		for (int i = 0; i < data.length; i++) {
			//배열 데이터의 합을 구한다.
			sum += data[i];
		}		
		avg = sum / data.length;
		
		// 결과 값을 출력한다.
		System.out.println("합계 : "+String.format("%.3f",sum) + "\n평균 : "+ avg);
	}

}
