package step_03_제어문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *이름 : 강호동
 *나이 : 23
 *성별 : 남
 *
 *
*/
public class InputTest_3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String name;
		int age;
		char gender;
		
		System.out.print("이름 : ");
		name = br.readLine();
		System.out.print("나이 : ");
		age = Integer.parseInt(br.readLine());
		System.out.print("성별 : ");
		gender = br.readLine().charAt(0);
		
		System.out.println("이름은 " + name + "입니다.");
		System.out.println("나이는 " + age + "세 입니다.");
		System.out.println("성별은 " + gender + "자 입니다.");
		
	}

}
