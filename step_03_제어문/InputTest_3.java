package step_03_���;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *�̸� : ��ȣ��
 *���� : 23
 *���� : ��
 *
 *
*/
public class InputTest_3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String name;
		int age;
		char gender;
		
		System.out.print("�̸� : ");
		name = br.readLine();
		System.out.print("���� : ");
		age = Integer.parseInt(br.readLine());
		System.out.print("���� : ");
		gender = br.readLine().charAt(0);
		
		System.out.println("�̸��� " + name + "�Դϴ�.");
		System.out.println("���̴� " + age + "�� �Դϴ�.");
		System.out.println("������ " + gender + "�� �Դϴ�.");
		
	}

}
