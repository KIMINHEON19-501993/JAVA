package methodex;

public class MethodEx5 {

	public static void show1() {
		System.out.println("�ȳ��ϼ���.~");
		return; // ��������
	}

	public static void show2(char a, int b) {
		System.out.println("�ڵ� : " + a);
		System.out.println("�� : " + b);
		return; // ��������
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
		System.out.println("return �� : " + show3());
		System.out.printf("return �� : %.2f", show4(100, 100, 100));
	}

}
