package step_03_���;

import java.util.Random;

//���� �Լ� : ��ǻ�Ͱ� ������ ���ڸ� �߻�, �ǻ糭��(pseudo random)
public class RandomEx {

	public static void main(String[] args) {
		// Math �Լ�
		System.out.println(Math.random());//0~1�̸��� �Ǽ� ���� ����
		System.out.println((int)(Math.random()*10+1));//1~11�̸�
		System.out.println((int)(Math.random()*31+50)); //50~81 �̸��� ���� ����
		System.out.println((int)(Math.random()*30+51)); //51~81 �̸��� ���� ����

		// Random Ŭ����
		Random rd = new Random();
		int a = rd.nextInt(100) + 1; // 1~100 �̸� ����
		int b = rd.nextInt(101) + 0; // 0~100 �̸� ����
		int c = rd.nextInt(30) + 50; // 50~80 �̸� ����
		System.out.println(a + " " + b + " " + c);
	}

}
