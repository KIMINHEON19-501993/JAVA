package STEP_02_������;

public class CastingEx {

	public static void main(String[] args) {

		
		int pay = 857650;
		double tax = 0.033; //3.3%
		
		int rPay  = pay - (int)(pay * tax);
		
		System.out.println("�Ǽ��ɾ� : " + rPay + "��");
		
		
//		int k = 87, e = 88, m = 75;
//		int tot = k + e + m;
//
//		double age = tot / 3.0; // �ڵ� ����ȯ
//		// double age = (double)tot / 3; 3.0 ���� ����ȯ �� �ڵ� ����ȯ
//
//		System.out.println("���� : " + tot);
//		System.out.println("��� : " + age);
//		System.out.printf("��� : %.2f", age);

//		byte a = 100;
//		int b = a; //�ڵ� ����ȯ
//		
//		System.out.println(a + " " + b);
//		
//		double c = 73.45;
//		int d = (int)c; //���� ����ȯ
//		
//		System.out.println(c + " " + d);
	}

}
