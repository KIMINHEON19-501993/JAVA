package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//checked exception : 명시적 예외 필요
public class ExceptionEx3 {
	int num;
	
	public ExceptionEx3() {
		input();
	}
	
	public void input() /*throws IOException*/ {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자열을 입력하세요 : ");
		try {
			num = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			System.out.println("입력된 값에 문제가 있습니다. ---- 1");
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("입력된 값에 문제가 있습니다. ---- 2");
		} catch (Exception e) {
			System.out.println("입력된 값에 문제가 있습니다. ---- 3");
		}
		
	}

	public void output() {
		System.out.println("결과 : " + num);
	}
	public static void main(String[] args) {
		new ExceptionEx3().output();
		
		System.out.println("--------------");
	}

	
	
}
