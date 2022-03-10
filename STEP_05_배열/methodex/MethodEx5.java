package methodex;

public class MethodEx5 {

	public static void show1() {
		System.out.println("안녕하세요.~");
		return; // 생략가능
	}

	public static void show2(char a, int b) {
		System.out.println("코드 : " + a);
		System.out.println("값 : " + b);
		return; // 생략가능
	}

	public static String show3() {
		return "hello";
	}

	public static float show4(int a, int b, int c) {
		return (a + b + c) / 3.0f;
	}

	public static void main(String[] args) {
		show1();
		show2('A', 25);
		System.out.println("return 값 : " + show3());
		System.out.printf("return 값 : %.2f", show4(100, 100, 100));
	}

}
