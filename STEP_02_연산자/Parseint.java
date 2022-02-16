package STEP_02_연산자;

//Parsing(파싱) : 구문 분석 (어떠한 의미를 가지는 최소 단위)
public class Parseint {

	public static void main(String[] args) {
		String a = "100";// 문자열 100
		// int b = 100;// 정수형 100
		String b = "200";
		
		System.out.println(a + b);

		// 문자열로 들어오는 숫자를 정수형으로 변환
		int a1 = Integer.parseInt(a); // "100" -> 100
		int b1 = Integer.parseInt(b); // "200" -> 200

		System.out.println(a1 + b1);
		
		// 문자열로 들어오는 숫자를 float형 으로 변환
		float a2 = Integer.parseInt(a); // "100" -> 100.0
		float b2 = Integer.parseInt(b); // "200" -> 200.0

		System.out.println(a2 + b2);

		// 문자열로 들어오는 숫자를 double형으로 변환
		double a3 = Integer.parseInt(a); // "100" -> 100.0
		double b3 = Integer.parseInt(b); // "200" -> 200.0

		System.out.println(a3 + b3);
	}

}
