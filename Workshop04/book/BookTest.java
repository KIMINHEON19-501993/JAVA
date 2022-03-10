package book;

public class BookTest {

	public static void main(String[] args) {
//		[ 문제 6 ] 다음과 같은 조건을 만족하는 프로그램을 작성 하시오. 
//		서로 다른 Book 객체를 생성 하고 각각의 정보를 출력 하는 프로그램을 작성 하시오. 

		Book book1 = new Book("SQL Plus", 50000, 5.0);
		Book book2 = new Book("ava 2.0", 40000, 3.0);
		Book book3 = new Book("JSP Servlet", 60000, 6.0);

		System.out.println(book1.getBookName() + " " + book1.getBookPrice() + "원 " + book1.getBookDiscountRate() + "% "
				+ book1.getDiscountBookPrice() + "원");
		System.out.println(book2.getBookName() + " " + book2.getBookPrice() + "원 " + book2.getBookDiscountRate() + "% "
				+ book2.getDiscountBookPrice() + "원");
		System.out.println(book3.getBookName() + " " + book3.getBookPrice() + "원 " + book3.getBookDiscountRate() + "% "
				+ book3.getDiscountBookPrice() + "원");

	}

}
