package methodex;

//�Ի� ���� : 815��
//�Ի� ��� : �հ�  --> ������ 800�� �̻� �̸� �հ�
//call by value ���� ���� ����
//call by reference ������ ���� ����
public class MethodEx6 {

	public static int total(int toeic, int it) {
		int tot = toeic + it;

		return tot;
	}

	public static String rs(int total) {
		String sr = null;

		if (total >= 800) {
			sr = "�հ�";
		} else {
			sr = "���հ�";
		}

		return sr;
		
//		return (total>=800) ? "�հ�" : "���հ�";
	}

	public static void main(String[] args) {
		int toeic = 750, it = 65;
		System.out.println("�Ի� ���� : " + total(toeic, it) + "��");
		System.out.println("�Ի� ��� : " + rs(total(toeic, it)));
	}

}
