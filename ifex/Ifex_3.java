package ifex;

/*--���� a�� �����ϰ� 55�Ǵ� 46�� ��������
1.�ܼ� if�� �̿� ���ǽĿ��� "55�� 50���� ũ�ų� ����.", 
					   "50���� ������ 46�� 50���� �۴�."
2.if-else �̿� a%2 == 0
	a�� ���� Ȧ�� ���� ¦�� ���� ���
3.if~else~if �̿�
 a�� ���� ���� "���" "����" "zero" ���� ���
*/
public class Ifex_3 {

	public static void main(String[] args) {

		int a = 55;

		// 1��

		if (a >= 50) {
			System.out.println(a + "�� 50���� ũ�ų� ����.");
		}
		if (a < 50) {
			System.out.println(a + "�� 50���� �۴�.");
		}
		// 2��

		if (a % 2 == 0) {
			System.out.println(a + "�� ¦���Դϴ�.");
		} else {
			System.out.println(a + "�� Ȧ���Դϴ�.");
		}

		// 3��
		if (a > 0) {
			System.out.println(a + "�� ����Դϴ�.");
		} else if (a < 0) {
			System.out.println(a + "�� �����Դϴ�.");
		} else {
			System.out.println(a + "�� zore�Դϴ�.");

		}

	}

}
