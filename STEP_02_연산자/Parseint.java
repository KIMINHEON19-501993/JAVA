package STEP_02_������;

//Parsing(�Ľ�) : ���� �м� (��� �ǹ̸� ������ �ּ� ����)
public class Parseint {

	public static void main(String[] args) {
		String a = "100";// ���ڿ� 100
		// int b = 100;// ������ 100
		String b = "200";
		
		System.out.println(a + b);

		// ���ڿ��� ������ ���ڸ� ���������� ��ȯ
		int a1 = Integer.parseInt(a); // "100" -> 100
		int b1 = Integer.parseInt(b); // "200" -> 200

		System.out.println(a1 + b1);
		
		// ���ڿ��� ������ ���ڸ� float�� ���� ��ȯ
		float a2 = Integer.parseInt(a); // "100" -> 100.0
		float b2 = Integer.parseInt(b); // "200" -> 200.0

		System.out.println(a2 + b2);

		// ���ڿ��� ������ ���ڸ� double������ ��ȯ
		double a3 = Integer.parseInt(a); // "100" -> 100.0
		double b3 = Integer.parseInt(b); // "200" -> 200.0

		System.out.println(a3 + b3);
	}

}
