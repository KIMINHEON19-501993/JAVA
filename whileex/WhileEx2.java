package whileex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//단을 입력 받아 구구단을 출력
public class WhileEx2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int dan;
		int i = 1;
		
		System.out.print("단을 입력 하세요 : ");
		dan = Integer.parseInt(br.readLine());
		while(i < 10) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
			i++;
		}
		
	}

}
