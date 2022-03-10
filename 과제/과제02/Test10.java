package 과제02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test10 {

	public static void main(String[] args) throws IOException {
		// [문제10] 4개의 값을 콘솔에서 입력받아 처리하시오
		// 조건) 성별 : M 이면 "남자", 나머지 "여자"
		// (삼항연산자 이용)

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name;
		char gender;
		int age;
		double tall;

		System.out.print("이름을 입력 하시오.: ");
		name = br.readLine();
		System.out.print("성별을 입력 하시오.( M / F ): ");
		gender = br.readLine().charAt(0);
		System.out.print("나이를 입력 하시오.: ");
		age = Integer.parseInt(br.readLine());
		System.out.print("신장을 입력 하시오.: ");
		tall = Double.parseDouble(br.readLine());

		gender = (gender == 'M' || gender == 'm') ? '남' : '여';

		System.out.println("이름 : " + name);
		System.out.println("성별 : " + gender + "성");
		System.out.println("나이 : " + age + "세");
		System.out.printf("신장 : %.1fcm", tall);

	}

}
