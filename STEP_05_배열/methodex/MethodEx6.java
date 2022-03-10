package methodex;

//입사 총점 : 815점
//입사 결괄 : 합격  --> 총점이 800점 이상 이면 합격
//call by value 값에 의한 전달
//call by reference 참조에 의한 전달
public class MethodEx6 {

	public static int total(int toeic, int it) {
		int tot = toeic + it;

		return tot;
	}

	public static String rs(int total) {
		String sr = null;

		if (total >= 800) {
			sr = "합격";
		} else {
			sr = "불합격";
		}

		return sr;
		
//		return (total>=800) ? "합격" : "불합격";
	}

	public static void main(String[] args) {
		int toeic = 750, it = 65;
		System.out.println("입사 총점 : " + total(toeic, it) + "점");
		System.out.println("입사 결과 : " + rs(total(toeic, it)));
	}

}
