package constructor;

//constructor ������ :  ��ü �ʱ�ȭ ���, �޸� �Ҵ�
//���� �� ���������� Ŭ������(){}
public class ConstructorEx1 {

	public ConstructorEx1() { // ����Ʈ ������,���� Ÿ�� ���� X
		System.out.println("default constructor");
	}

	public ConstructorEx1(String str) { // ����Ʈ ������,���� Ÿ�� ���� X
		System.out.println(str + " constructor");
	}

	public ConstructorEx1(String str, int n) { // ����Ʈ ������,���� Ÿ�� ���� X
		System.out.println(str + " " + n + " constructor");
	}

	public static void main(String[] args) {
		new ConstructorEx1(); // ��ü ����,������ ȣ��
		new ConstructorEx1("�Ƿη�");
		new ConstructorEx1("�Ƿη�", 5);
	}

}
