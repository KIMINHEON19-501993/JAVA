package test;

import java.util.List;
import java.util.Scanner;

/*
 * ID�� �Է��ϼ��� : pororo
 * PW�� �Է��ϼ��� : 1234
 * 
 * �Ƿηδ��� �����ϼ̽��ϴ�.
 * ���� ����Ʈ�� 89.97���Դϴ�.
 * 
 * ***** Book�� ���� ����*****
 * å�̸� : java	å���� : kim	������ : 200
 * å�̸� : network	å���� : lee	������ : 300
 * å�̸� : programming	å���� : park	������ : 400
 * ------------------------------------------------
 * ID�� �Է��ϼ��� : pororo
 * PW�� �Է��ϼ��� : 1111
 * 
 * ID �Ǵ� PW�� �߸� �Ǿ����ϴ�.
 */
public class UserMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String id;
		String pw;

		System.out.print("ID�� �Է��ϼ��� : ");
		id = sc.next();
		System.out.print("PW�� �Է��ϼ��� : ");
		pw = sc.next();

		UserProc up = new UserProc();
		up.getLoginUser(id, pw);
		User entity = up.getLoginUser(id, pw);
		if (entity == null) {
			System.out.println("ID �Ǵ� PW�� �߸� �Ǿ����ϴ�.");
		} else {
			System.out.println(entity.getName() + "���� �����ϼ̽��ϴ�.");// ���� �˻� �ʿ�
			System.out.println("���� ����Ʈ�� " + entity.getPoint() + "���Դϴ�.");

			System.out.println("***** Book�� ���� ����*****");

			BookProc book = new BookProc();
			// book�� ������ ������ ���� ��Ȱ

			List<Book> list = book.getList();

			for (Book ob : list) {
				System.out.print("å�̸� : " + ob.getTitle());
				System.out.print("å���� : " + ob.getAuthor());
				System.out.print("������ : " + ob.getPage() + "\n");
			}

		}
		sc.close();

	}
}
