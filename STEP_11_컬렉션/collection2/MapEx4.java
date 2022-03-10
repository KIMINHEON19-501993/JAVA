package collection2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapEx4 {

	public static void main(String[] args) {
		Book bk1 = new Book("java", "kim", 200);
		Book bk2 = new Book("network", "lee", 300);
		Book bk3 = new Book("programming", "park", 400);
		
		Map<String, Book> map = new HashMap<>();
		map.put(bk1.getTitle(), bk1);
		map.put(bk2.getTitle(), bk2);
		map.put(bk3.getTitle(), bk3);
		
//		System.out.println(map);
		Scanner sc = new Scanner(System.in);
	
		System.out.println("찾는 도서를 입력 하세요.");
		String title = sc.next();
		
		//도서를 검색해서 출력하세요
		//찾는 도서를 입력하세요 : java
		//책이름 : java 책저자 : kim 페이지 : 200
		
		//찾는 도서를 입력 하세요 : jcvascript
		//찾는 도서가 없어요...
		
		
		if(map.containsKey(title)) {
			System.out.println("책이름 : "+map.get(title).getTitle()
							 +" 책저자 : "+ map.get(title).getAuthor()
							 +" 페이지 : "+ map.get(title).getPage());
		}else {
			System.out.println("찾는 도서가 없어요...");
		}

//		if (map.get(title)==null) {
//			System.out.println("찾는 도서가 없어요...");
//		}else {
//			System.out.println("책이름 : "+map.get(title).getTitle()
//							 +" 책저자 : "+ map.get(title).getAuthor()
//							 +" 페이지 : "+ map.get(title).getPage());
//		}
		
				
		sc.close();
	}

}
