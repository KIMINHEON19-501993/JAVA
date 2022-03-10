package ifex;

//if : 조건 검사를 수행한후 결과에 따라 동작
//if문 의 조건식 논리연산자 또는 관계연산자
public class Ifex_1 {

	public static void main(String[] args) {
		int score = 75;
		char grade;

		if (score >= 90) grade = 'A';
		else if (score >= 80) grade = 'B';
		else if (score >= 70) grade = 'C';
		else if (score >= 60) grade = 'D';
		else grade = 'F';

		System.out.println("점수는 " + score + "점이고 학점은 " + grade + "입니다");
		
//		if (score >= 90 && score <=100) grade = 'A';
//		else if (score >= 80 && score <90) grade = 'B';
//		else if (score >= 70 && score <80) grade = 'C';
//		else if (score >= 60 && score <70) grade = 'D';
//		else grade = 'F';
//		
//		System.out.println("점수는 " + score + "점이고 학점은 " + grade + "입니다");
		
//		//if문
//		String str = "hello";
//		
//		if (str == "hello") {
//			System.out.println("Hello");
//			System.out.println("JAVA");
//		}

//		//if-else문
//		int score = 65;
//		if(score >= 60) {
//			System.out.println("합격");
//			System.out.println("점수는 " + score + " 입니다.");
//		}else {
//			System.out.println("불합격");
//			System.out.println("점수는 " + score + " 입니다.");
//		}
//		System.out.println((score >= 60) ? "합격" : "불합격");
//		System.out.println("점수는 " + score + " 입니다.");
	}

}
