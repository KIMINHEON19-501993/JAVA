package STEP_02_������;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//System.out.printf("�޼��� or ���Ĺ���", ����) ���Ĺ��ڿ� ������ ������ ���ƾ��Ѵ� 

/*
 * �̸� : �̼��� <-- println
 * ���� : 25�� <-- print
 * �μ� : ���ߺ� <-- printf �μ��� ���� �Բ� ���
 * ���� : 87.5��
*/

public class Datatype3 {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String name;
		int age;
		String dept;
		double score;

		System.out.print("�̸��� �Է� �Ͻÿ� : ");
		name = br.readLine();
		
		System.out.print("���̸� �Է� �Ͻÿ� : ");
		age = Integer.parseInt(br.readLine());
		
		System.out.print("�μ��� �Է� �Ͻÿ� : ");
		dept = br.readLine();
		
		System.out.print("������ �Է� �Ͻÿ� : ");
		score = Double.parseDouble(br.readLine());

		System.out.println("�̸� : " + name);
		System.out.print("���� : " + age + "��\n");
		System.out.printf("�μ� : %s\n���� : %.1f��", dept, score);

	}

}
