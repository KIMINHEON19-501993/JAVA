package object;

import java.util.Scanner;

/*
 * *****��ٸ��� ���̱��ϱ�*****
 * �غ��� �Է� �ϼ���. 4
 * ������ �Է� �ϼ���. 5
 * ���̸� �Է� �ϼ���. 6
 * ���� : 27.0
 * �ѹ��� ���� �ұ��? (Y/y) y
 * �غ��� �Է� �ϼ���. 4
 * ������ �Է� �ϼ���. 5
 * ���̸� �Է� �ϼ���. 6
 * ���� : 27.0
 * �ѹ��� ���� �ұ��? (Y/y) n
 */
public class ObjectEx7 {

	public static void main(String[] args) {

		Trapezoid tz = new Trapezoid();
		Scanner sc = new Scanner(System.in);

		int base;
		int top;
		int height;
		char why;

		do {//�Է°��� �ֱ��� while���� ����� ���
				System.out.println("*****��ٸ��� ���� ���ϱ�*****");
				System.out.print("�غ��� �Է� �ϼ���. : ");
				base = sc.nextInt();
				System.out.print("������ �Է� �ϼ���. : ");
				top = sc.nextInt();
				System.out.print("���̸� �Է� �ϼ���. : ");
				height = sc.nextInt();
	
				// Trapezoid Ŭ������ ��ü�� ����� ���� ���ϱ�
	
				tz.setTrapezoid(base, top, height);
				System.out.println(tz.toString());
	
				System.out.print("�ѹ��� ���� �ұ��? (Y/y) : ");
				why = sc.next().charAt(0);
		} while (why == 'Y' || why == 'y');
		System.out.println("*******�����ϼ̽��ϴ�.********");
		sc.close();
	}
}
