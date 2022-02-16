package collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx3 {

	public static void main(String[] args) {
		Book bk1 = new Book("java", "kim", 200);
		Book bk2 = new Book("network", "lee", 300);
		Book bk3 = new Book("programming", "park", 400);

		List<Book> list = new ArrayList<Book>();
		list.add(bk1);
		list.add(bk2);
		list.add(bk3);

		// å�̸� : java å���� : kim ������ : 200
		System.out.println("========================================================");
		// for���� �̿��� ���
		for (Book book : list) {
			System.out.print("å�̸� : " + book.getTitle()+"\t");
			System.out.print("å���� : " + book.getAuthor()+"\t");
			System.out.print("������ : " + book.getPage() + "\n");
		}
		System.out.println("========================================================");
		// ���ͷ����͸� �̿��Ͽ� ���

		Iterator<Book> iter = list.iterator();

		while (iter.hasNext()) {
			Book ob = iter.next();
			//next()�� ����ϸ� ���� �����ϰ� ���� ����Ʈ�� �̵��ؼ� ���
			System.out.print("å�̸� : " + ob.getTitle()+"\t");
			System.out.print("å���� : " +ob.getAuthor()+"\t");
			System.out.print("������ : " + ob.getPage() + "\n");
		}
		System.out.println("========================================================");
	}

}
