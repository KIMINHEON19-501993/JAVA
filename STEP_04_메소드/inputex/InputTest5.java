package inputex;
//eno: 101 ename:뽀로로 dept:A score 85.9 를 대입혀여 출력
//printf 사용
public class InputTest5 {

	public static void main(String[] args) {
		
		String ename = "뽀로로";
		int eno = 101;
		char dept = 'A';
		double score = 85.9;
		
		System.out.printf("사원번호 : %d\n" , eno);
		System.out.printf("사원이름 : %s\n" , ename);
		System.out.printf("부서코드 : %c\n" , dept);
		System.out.printf("입사성적 : %.1f" , score);
		
	}


}
