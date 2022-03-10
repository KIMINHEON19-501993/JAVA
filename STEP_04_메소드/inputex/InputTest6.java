package inputex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//argument를 이용하여 입력을 받아 출력
//eno: 101 ename:뽀로로 dept:A score 85.9 를 출력
// printf 한번만 사용하여 표시
public class InputTest6 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int eno;
		String ename;
		char dept;
		double score;
		
		System.out.print("사원번호를 입력 하시오 : ");
		eno = Integer.parseInt(br.readLine());
		
		System.out.print("사원이름을 입력 하시오 : ");
		ename = br.readLine();
		
		System.out.print("부서코드를 입력 하시오 : ");
		dept = br.readLine().charAt(0);
		
		System.out.print("입사성적을 입력 하시오 : ");
		score = Double.parseDouble(br.readLine());
		
		
		System.out.println("사원번호 : " + eno);
		System.out.println("사원이름 : " + ename);
		System.out.println("부서코드 : " + dept);
		System.out.printf("입사성적 : %.2f" , score);
		
	}


}
