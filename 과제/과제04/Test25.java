package 과제04;

public class Test25 {

	public static int sum(int x, int y) {
		return x + y;
	}

	public static int sub(int x, int y) {
		return x - y;
	}

	public static int multi(int x, int y) {
		return x * y;
	}

	public static double divi(double x, double y) {
		return x / y;
	}

	public static void main(String[] args) {
		// argument에서 데이터를 받아 프로그램을 구현하시오.
		int x;
		int y;

		x = Integer.parseInt(args[0]);
		y = Integer.parseInt(args[1]);

		System.out.println("더하기: " + sum(x, y));
		System.out.println("빼기: " + sub(x, y));
		System.out.println("곱하기: " + multi(x, y));
		System.out.printf("나누기: %.2f\n", divi(x, y));

	}

}
