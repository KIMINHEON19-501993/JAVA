package methodex;

import java.util.Random;

//call by  reference : ������ ���� ȣ��, �Լ��� �Ű������� �����ּҷ� ����
public class MethodEx8 {
	
	public static void view1() {
		System.out.println("static method");
	}
	public void view2() {
		System.out.println("non-static method");
	}
	
	public static void main(String[] args) {
		//Ŭ���� �޼���(static method) : ��ü ���� ȣ�� ���� ex)Math.random()
		view1(); // �ڱ� �ڽ��� ���� �޼��忡 ���� �Ҷ��� Ŭ���� �̸� ��������.
		MethodEx8.view1();//�ڱ� �ڽ��� ���� �޼��忡 ���� �Ҷ��� Ŭ���� �̸� ��������.
				
		//�ν���Ʈ �޼���(�ݵ�� ��ü�� ���� �Լ� ȣ��.)
		Random rd  = new Random();
		rd.nextInt();
		MethodEx8 ob = new MethodEx8();
		ob.view2();
		

	}

}
