package step_03_���;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 ������ ���� ���
 ������ �Է�
 ���� ���� 78.5  <-- 3.14 * r * r
 ���� �ѷ� 31.4  <-- 2 * 3.14 * r
*/
public class InputTest_4 {

	public static void main(String[] args) throws NumberFormatException, IOException   {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int r;
		double a;
		double b;

		//�Է�(Ű����, ����, ��Ʈ��ũ, ����)
		System.out.print("������ �� �Է� �ϼ��� : ");
		r = Integer.parseInt(br.readLine());

		//���
		a = 3.14 * r * r;
		b = 2 * 3.14 * r;

		//���
		System.out.printf("���� ���� : %.1f\n", a);
		System.out.printf("���� ���� : %.1f", b);

	}

}
