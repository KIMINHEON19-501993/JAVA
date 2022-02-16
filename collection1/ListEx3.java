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

		// 책이름 : java 책저자 : kim 페이지 : 200
		System.out.println("========================================================");
		// for문을 이용해 출력
		for (Book book : list) {
			System.out.print("책이름 : " + book.getTitle()+"\t");
			System.out.print("책저자 : " + book.getAuthor()+"\t");
			System.out.print("페이지 : " + book.getPage() + "\n");
		}
		System.out.println("========================================================");
		// 이터레이터를 이용하여 출력

		Iterator<Book> iter = list.iterator();

		while (iter.hasNext()) {
			Book ob = iter.next();
			//next()를 사용하면 값을 추출하고 다음 포인트로 이동해서 대기
			System.out.print("책이름 : " + ob.getTitle()+"\t");
			System.out.print("책저자 : " +ob.getAuthor()+"\t");
			System.out.print("페이지 : " + ob.getPage() + "\n");
		}
		System.out.println("========================================================");
	}

}
