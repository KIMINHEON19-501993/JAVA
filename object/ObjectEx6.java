package object;

import java.util.Scanner;

class MemberPhone {

	String name;
	String phone;

	public void input() {
		// ��ĳ��
		
		Scanner sc = new Scanner(System.in);

		System.out.print("�̸��� �Է� �ϼ��� : ");
		name = sc.nextLine();
		System.out.print("��ȭ��ȣ�� �Է� �ϼ��� : ");
		phone = sc.nextLine();
		
		sc.close();
		
	}

	public void output() {
		System.out.println("�̸� : " + name);
		System.out.println("��ȭ��ȣ : " + phone);
		System.out.println(name + "������ ��ȭ��ȣ�� " + phone + "�Դϴ�.");
	}

}

public class ObjectEx6 {

	public static void main(String[] args) {

		MemberPhone mp = new MemberPhone();

		mp.input();
		mp.output();
	}

}
