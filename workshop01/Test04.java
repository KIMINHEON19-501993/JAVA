package workshop01;

public class Test04 {

	public static void main(String[] args) {
		//[문제 4]다음과 같은 조건을 만족하는 프로그램을 완성 하시오. 
		//문자형 변수 ch가 영문자(대문자 또는 소문자)일 때만 변수 b의 값이 true가 되도록 프로그램을 완성 하시오.
		//출력은 아래와 같이 이루어 진다.
		//true
		
		char ch = 'A';
		boolean b = (int)'A' <= (int)ch && (int)'z' >= (int)ch; 
		System.out.println(b);
	}

}
