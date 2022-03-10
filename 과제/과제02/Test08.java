package 과제02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test08 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//[문제8] 값을 입력받아 0보다 작거나 100보다 크면 "입력오류!!"  출력
        //(if문과 ||연산자를 이용하시오)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n;
		
		System.out.println("숫자를 입력 하시오 : ");
		n = Integer.parseInt(br.readLine());
		
		if(n< 0 || n >100) {
			System.out.println("입력오류!!");
		}else {
			System.out.println("입력된값 : " + n);
		}
	}

}
