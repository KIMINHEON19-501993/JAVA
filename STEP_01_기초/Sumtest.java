package STEP_01_기초;

/*
  + 의미
  1. 더하기
  2. 연결하기
  3. 단항연산자
*/
public class Sumtest {
	public static void main(String[] args) {
		int a = 5, b = 7;
		System.out.println(a + b); // 연결하기
		System.out.println("a" + " + b = " + (a + b)); // 연결하기(앞의 문자열과 뒤의 문자열 연결)
		System.out.println(a + " + " + b + " = " + (a + b));
	}
}
