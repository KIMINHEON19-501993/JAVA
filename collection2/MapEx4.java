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
	
		System.out.println("ã�� ������ �Է� �ϼ���.");
		String title = sc.next();
		
		//������ �˻��ؼ� ����ϼ���
		//ã�� ������ �Է��ϼ��� : java
		//å�̸� : java å���� : kim ������ : 200
		
		//ã�� ������ �Է� �ϼ��� : jcvascript
		//ã�� ������ �����...
		
		
		if(map.containsKey(title)) {
			System.out.println("å�̸� : "+map.get(title).getTitle()
							 +" å���� : "+ map.get(title).getAuthor()
							 +" ������ : "+ map.get(title).getPage());
		}else {
			System.out.println("ã�� ������ �����...");
		}

//		if (map.get(title)==null) {
//			System.out.println("ã�� ������ �����...");
//		}else {
//			System.out.println("å�̸� : "+map.get(title).getTitle()
//							 +" å���� : "+ map.get(title).getAuthor()
//							 +" ������ : "+ map.get(title).getPage());
//		}
		
				
		sc.close();
	}

}
