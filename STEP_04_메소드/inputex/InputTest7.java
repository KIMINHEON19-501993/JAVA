package inputex;


//eno: 101 ename:뽀로로 dept:A score 85.9 를 입력여 출력
//eno,ename,dept --> printin
//score --> printf 단 소숫점 2째 자리까지 표시
public class InputTest7 {

	public static void main(String[] args) {
		
		
		
		int eno = Integer.parseInt(args[0]);
		String ename = args[1];
		char dept = args[2].charAt(0);
		double score = Double.parseDouble(args[3]);
		
	
		System.out.printf("사원번호 : %d\n사원이름 : %s\n부서코드 : %s\n입사성적 : %.2f" ,eno,ename,dept,score);
		
	}


}
