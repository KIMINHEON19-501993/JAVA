package ifex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*--��ø if���� �̿��Ͽ� �ۼ�
 * 3�� ������ ������ �Է¹޾� �հ�, ���հ��� ���
 * 3���� ������ ���� 40 �̻� �̾�� �ϰ� ����� 60�� �̻� �϶� "�հ�" ���
 * ����� 60���� ������ 1���� �����̶� 40���� ���� ���ϸ� ����
 * ����� 60���� ���� ���ϸ� ���հ�
 * 
 * �������� �Է� : 100
 * �������� �Է� : 100
 * �������� �Է� : 100
 * ��� : �հ�
 *  
 * �������� �Է� : 100
 * �������� �Է� : 100
 * �������� �Է� : 30
 * ��� : �հ�
 * 
 * �������� �Է� : 40
 * �������� �Է� : 40
 * �������� �Է� : 40
 * ��� : �հ�
*/
public class Ifex_4 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int kor;
		int eng;
		int mat;
		int tot;
		double avg;

		System.out.print("���� ������ �Է� �Ͻÿ� :");
		kor = Integer.parseInt(br.readLine());
		System.out.print("���� ������ �Է� �Ͻÿ� :");
		eng = Integer.parseInt(br.readLine());
		System.out.print("���� ������ �Է� �Ͻÿ� :");
		mat = Integer.parseInt(br.readLine());

		tot = kor + eng + mat;
		avg = tot / 3.0;
		
		if (avg >= 60) {
			if (kor >= 40 && eng >= 40 && mat >= 40) {
				System.out.println("�հ� �Դϴ�.");
			} else {
				System.out.println("�������� ���հ� �Դϴ�.");
			}
		} else {
			System.out.println("���հ� �Դϴ�.");
		}

	}

}
