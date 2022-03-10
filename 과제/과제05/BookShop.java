package 과제05;
//test33
public class BookShop {

	private static String bname; 
	private static String author;
	private static int price;
	
	 public void setBook(String bname,  String author, int price) {
		 setBname(bname);
		 setAuthor(author);
		 setPrice(price);
	 }
	 public void viewBook() {
		System.out.println("책이름 : " + bname);
		System.out.println("저 자 : " + author);
		System.out.println("가 격 : " + price + "원");
		
	 }
	 
	public  String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		BookShop.bname = bname;
	}
	public  String getAuthor() {
		return author;
	}
	public  void setAuthor(String author) {
		BookShop.author = author;
	}
	public  int getPrice() {
		return price;
	}
	public  void setPrice(int price) {
		BookShop.price = price;
	}

}
