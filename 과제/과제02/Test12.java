package 과제02;

public class Test12 {

	public static void main(String[] args) {
//		[문제12]성적처리프로그램
//        중간고사,기말고사,레포트,출석점수를 Argument로 입력받아서 계산하시오
//
//        조건1) 
//        (중간+기말)/2       ---> 60%
//        과제                   ---> 20%
//        출석                   ---> 20%
//     
//        조건2)   
//        90이상 'A'학점 
//        80이상 'B'학점         
//        70이상 'C'학점          
//        60이상 'D'학점         
//        나머지 'F'학점
//        (if~else if문이용)
//		조건3)A,B학점  ---->"excellent"
//		 C,D학점  ---->"good"
//		 F학점    ---->"poor"
//		 (switch문이용)

		int exam;
		int finals;
		int report;
		int Attend;
		double tot;
		char grade;

		exam = Integer.parseInt(args[0]);
		finals = Integer.parseInt(args[1]);
		report = Integer.parseInt(args[2]);
		Attend = Integer.parseInt(args[3]);

		System.out.println("중간고사 : " + exam);
		System.out.println("기말고사 : " + finals);
		System.out.println("과제점수: " + report);
		System.out.println("출석점수 : " + Attend);

		tot = (((exam + finals) / 2) * 0.6) + (report * 0.2) + (Attend * 0.2);

		System.out.printf("성적=%.2f\n", tot);

		if (tot >= 90)
			grade = 'A';
		else if (tot >= 80)
			grade = 'B';
		else if (tot >= 70)
			grade = 'C';
		else if (tot >= 60)
			grade = 'D';
		else
			grade = 'F';

		System.out.printf("학점=%c\n", grade);

		switch (grade) {
		case 'A':
		case 'B':
			System.out.println("평가=excellent");
			break;
		case 'C':
		case 'D':
			System.out.println("평가=good");
			break;
		case 'F':
			System.out.println("평가=poor");
			break;

		}
	}

}
