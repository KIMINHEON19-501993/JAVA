package overload;

/*�����ε�޼��� overload method, �ߺ��Լ�  : ���� �̸��� �Լ��� ������ ����
 * 1.�ݵ�� �Լ��� �̸��� ����
 * 2.�Ű������� �ڷ����� �ٸ��ų� ������ �޶�� �Ѵ�.
 * ex)println()
 * 
 */
public class OverloadEx1 {
	int a = 10;
	int b = 20;
	
	private int max() {
		return (a > b) ? a : b;
	}
	
	public int max(int a, int b) {
		//a,b�� ��������
		//�� ���������� (���������� ������ �̸��� ������) ���������� ������.
		return (a > b) ? a : b;
	}
	
	public float max(float a, float b) {
		return (a > b) ? a : b;
	}
	
	public char max(char a, char b) {
		return (a > b) ? a : b;
	}

	public static void main(String[] args) {
		OverloadEx1 ob = new OverloadEx1();

		System.out.println("ū�� : " + ob.max());
		System.out.println("ū�� : " + ob.max(1,2));
		System.out.println("ū�� : " + ob.max(1.0f,2.0f));
		System.out.println("ū�� : " + ob.max('b','B'));
	}

	

}
