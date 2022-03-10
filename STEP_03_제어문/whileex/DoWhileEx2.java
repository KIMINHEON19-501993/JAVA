package whileex;

//do-while 을 이용하여 반복 처리
//다시 실행 할까요?(Y/N)
//다시 실행 할까요?(Y/N)Y
//다시 실행 할까요?(Y/N)N
//*****수고하셨습니다.*****

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoWhileEx2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char why;
			
		do {
			System.out.print("다시 실행 할까요?(Y/N) : ");
			why = br.readLine().charAt(0);
		} while (why == 'Y' || why == 'y');
		
		System.out.println("*****수고하셨습니다.*****");
	}

}
