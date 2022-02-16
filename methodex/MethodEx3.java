package methodex;

//call vy value : 값에 의한 호출 --> 매개변수가 있는경우
public class MethodEx3 {
//call by name

	public static void show1(int a, char b, double c, float d) {
		System.out.println(a + " " + b + " " + c + " " + d);
	}

	public static int show2(int a, int b, int c) {
		return a + b + c;
	}

	public static double show3(int a, int b, int c) {
		return (a + b + c) / 3.0;
	}

	public static String show4(int a, int b, int c) {
		double avg = show3(a, b, c);
		if (avg > 60) {
			return "합격";
		} else {
			return "불합격";
		}

	}

	public static void main(String[] args) {

		show1(10, 'A', 10.5, 100.3f);
		int sum = show2(100, 100, 100);
		System.out.println("합계 : " + sum);
		double avg = show3(100, 100, 100);
		System.out.println("평균 : " + avg);
		System.out.println("합격/불합격 : " + show4(100, 100, 100));

	}
}
