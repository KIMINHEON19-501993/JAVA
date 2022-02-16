package test;
//db연동, 비즈니스 로직
import java.util.ArrayList;
import java.util.List;



public class BookProc {
	public BookProc() {
		// TODO 자동 생성된 생성자 스텁
	}
	

	
	public List<Book> getList() {
		Book bk1 = new Book("java", "kim", 200);
		Book bk2 = new Book("network", "lee", 300);
		Book bk3 = new Book("programming", "park", 400);
		
		List<Book> list = new ArrayList<Book>();
		list.add(bk1);
		list.add(bk2);
		list.add(bk3);
		
		return  list;
		
		
		
	}
	


}
