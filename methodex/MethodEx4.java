package methodex;

//call by value : 값에 의한 호출 --> 매개변수가 있는경우

//학점 switch 를 이용하여 결과 구하기
//90점 이상 'A' 80점 이상 'B' 70점 이상 'C' 60점이상 'D' 나머지 'F'
//if~else 를 이용 하여 F인경우 "불합격" 나머지 는 "합격"
public class MethodEx4 {
	public static int total(int a, int b, int c) {
		return a + b + c;
	}

	public static double avg(int total) {
		return total / 3.0;
	}

	public static char grade(double avg) {
	
		switch ((int) avg / 10) {
		case 10:
		case 9:
			return 'A';
		case 8:
			return 'B';
		case 7:
			return 'C';
		case 6:
			return 'D';
		default:
			return 'F';
		}
	}

	public static String result(char grade) {
		String rs = null;
		
		if (grade == 'F') {
			rs =  "불합격";
		} else {
			rs =  "합격";
		}
		
		return rs;
	}

	public static void main(String[] args) {

		int a = 100, b = 100, c = 100;
		System.out.println("총점 : " + total(a, b, c) + "점");
		System.out.println("평균 : " + avg(total(a, b, c)) + "점");
		System.out.println("학점 : " + grade(avg(total(a, b, c))));
		System.out.println("결과 : " + result(grade(avg(total(a, b, c)))));
	}

}
