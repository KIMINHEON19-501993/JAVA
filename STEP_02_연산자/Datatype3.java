package STEP_02_연산자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//System.out.printf("메세지 or 서식문자", 변수) 서식문자와 변수의 개수는 같아야한다 

/*
 * 이름 : 이순신 <-- println
 * 나이 : 25세 <-- print
 * 부서 : 개발부 <-- printf 부서와 성적 함께 출력
 * 성적 : 87.5점
*/

public class Datatype3 {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String name;
		int age;
		String dept;
		double score;

		System.out.print("이름을 입력 하시오 : ");
		name = br.readLine();
		
		System.out.print("나이를 입력 하시오 : ");
		age = Integer.parseInt(br.readLine());
		
		System.out.print("부서를 입력 하시오 : ");
		dept = br.readLine();
		
		System.out.print("점수를 입력 하시오 : ");
		score = Double.parseDouble(br.readLine());

		System.out.println("이름 : " + name);
		System.out.print("나이 : " + age + "세\n");
		System.out.printf("부서 : %s\n성적 : %.1f점", dept, score);

	}

}
