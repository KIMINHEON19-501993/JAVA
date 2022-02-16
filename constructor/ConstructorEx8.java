package constructor;

public class ConstructorEx8 {

	public static void main(String[] args) {
		
		Book bk1 = new Book();
		bk1.setTitle("자바의 정석");
		bk1.setAuthor("김자바");
		bk1.setPage(300);
		
		System.out.println(bk1);
	}

}
