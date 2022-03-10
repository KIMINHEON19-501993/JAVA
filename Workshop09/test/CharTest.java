package com.test;
/*
 * [ 문제 1 ] 아래와 같은 결과가 나올 수 있도록 프로그램을 작성 하시오 
1. 사용 데이터 
프로그램 실행 시 String 형태의 문자열을 스페이스 없이 argument로 받아 들인다. 
입력 받은 String 문자를 반드시 char[]에 담고 이를 거꾸로 출력 한다. 
단, 모두 대문자로 만들어 출력 한다. 

 */
public class CharTest {

	public static void main(String[] args) {
		String str = args[0].toUpperCase();
		
		char[] ch = str.toCharArray();
		
		for (int i = ch.length-1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
	}

}
