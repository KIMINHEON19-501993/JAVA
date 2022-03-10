package STEP_01_기초;
//System.out.printf("메세지 or 서식문자", 변수) 서식문자와 변수의 개수는 같아야한다 

/*
 * %d 정수 int, char, long
 * %c 문자 char
 * %f 실수 float, double
 * %s 문자열 String
*/

public class Datatype2 {


	
	public static void main(String[] args) {
		String name = "이순신";
		String dept = "개발부";
		char gender = 'M';
		double score = 85.3;
		int age = 25;
		float tall = 183.4f;
		
		
		System.out.printf("이름 : %s\n", name);
		System.out.printf("부서 : %s\n" , dept);
		System.out.printf("성별 : %c\n" , gender);
		System.out.printf("점수 : %.1f\n" , score);
		System.out.printf(String.format("점수 : %.1f\n" , score));
		System.out.printf("나이 : %d\n" , age);
		System.out.printf("신장 : %.1f\n" , tall);
	}

}
