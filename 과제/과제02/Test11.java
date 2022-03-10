package 과제02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Test11 {

	public static void main(String[] args) throws IOException {
		//[문제11]2개의 숫자와 연산자를 입력하여 계산하시오 <-- args입력
        //조건1) 실수인경우는 소수이하 2째자리까지 출력하시오 콘솔입력(BufferedReader를 이용)
        //조건2) 연산자가 +,-,*,/ 이외의 문자가 들어오면 
        //"연산자error"출력하시오
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a,b;
		char ch;
		
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		
		System.out.println("연산자를 입력하시오.(+,-,*,/)");
		ch = br.readLine().charAt(0);
		
		if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
			switch (ch) {
			case '+':
				System.out.printf("%d + %d = %d",a,b, (a+b));
				break;
			case '-':
				System.out.printf("%d - %d = %d",a,b, (a-b));			
				break;
			case '*':
				System.out.printf("%d * %d = %d",a,b, (a*b));
				break;
			case '/':
				System.out.printf("%d / %d = %.2f",a,b, ((double)a/b));
				break;
			}
			
		}else {
			System.out.println("연산자 error");
		}
		
		
		
	}



}
