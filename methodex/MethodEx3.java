package methodex;

//call vy value : ���� ���� ȣ�� --> �Ű������� �ִ°��
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
			return "�հ�";
		} else {
			return "���հ�";
		}

	}

	public static void main(String[] args) {

		show1(10, 'A', 10.5, 100.3f);
		int sum = show2(100, 100, 100);
		System.out.println("�հ� : " + sum);
		double avg = show3(100, 100, 100);
		System.out.println("��� : " + avg);
		System.out.println("�հ�/���հ� : " + show4(100, 100, 100));

	}
}
