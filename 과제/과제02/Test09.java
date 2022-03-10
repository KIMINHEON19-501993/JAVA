package 과제02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test09 {

	public static void main(String[] args) throws IOException {
		// [문제9] 입력된 문자가 대문자이면 소문자로 출력하고
		// 소문자이명 대문자로 변환하여 출력하시오
		// 그외의 문자이면 "입력데이타오류"라고 표시하시오
		// (if-else문 이용)

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char ch;
		int result;

		System.out.print("단어를 입력 하시오 : ");
		ch = br.readLine().charAt(0);

		if ((int)ch >= (int)'A' && (int)ch <= (int)'Z') {
			result = (int)ch + 32;
			System.out.print("대문자 에서 소문자 변환 ->" + (char)result);
		}else if((int)ch >= (int)'a' && (int)ch <= (int)'z') {
			result = (int)ch - 32;
			System.out.print("소문자 에서 대문자 변환 ->" + (char)result);
		}else {
			System.out.print("입력 데이타 오류");
		}
		
		
	}

}
