package 과제05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test29 {

	public static void main(String[] args) throws IOException {
//		[문제29] 다음 프로그램을 작성하시오   
//		(1) BufferedReader를 이용하여 콘솔에서 입력받는다
//		(2) 이름, 나이....등 각각 배열을 3개씩 만들어서 입력 받는다
//		      String[] name=new String[3];
//		      int[] age=new int[3];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] name = new String[3];
		int[] age = new int[3];

		for (int i = 0; i < name.length; i++) {
			
			System.out.print("이름을 입력하시오 : ");
			name[i] = br.readLine();
			System.out.print("나이를 입력하시오 : ");
			age[i] = Integer.parseInt(br.readLine());
			
			System.out.println();
		}

		for (int i = 0; i < name.length; i++) {
			System.out.printf("%s\t%d세\n", name[i], age[i]);
		}
	}
}
