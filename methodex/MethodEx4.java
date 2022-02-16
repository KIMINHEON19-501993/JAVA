package methodex;

//call by value : ���� ���� ȣ�� --> �Ű������� �ִ°��

//���� switch �� �̿��Ͽ� ��� ���ϱ�
//90�� �̻� 'A' 80�� �̻� 'B' 70�� �̻� 'C' 60���̻� 'D' ������ 'F'
//if~else �� �̿� �Ͽ� F�ΰ�� "���հ�" ������ �� "�հ�"
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
			rs =  "���հ�";
		} else {
			rs =  "�հ�";
		}
		
		return rs;
	}

	public static void main(String[] args) {

		int a = 100, b = 100, c = 100;
		System.out.println("���� : " + total(a, b, c) + "��");
		System.out.println("��� : " + avg(total(a, b, c)) + "��");
		System.out.println("���� : " + grade(avg(total(a, b, c))));
		System.out.println("��� : " + result(grade(avg(total(a, b, c)))));
	}

}
