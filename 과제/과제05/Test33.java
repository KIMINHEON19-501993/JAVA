package 과제05;

public class Test33 {

	public static void main(String[] args) {
//		[문제33]다중클래스를 만들고 setter & getter를 이용하여 다음을 완성하시오
//		(1)클래스명:  BookShop
//		    -bname:String   (책이름)
//		    -author:String   (저자) 
//		    -price:int          (가격) 
//		    +setBook(bname:String,  auth  or:String, price:int):void
//		    +viewBook():void
//		    +setter & getter
//
//		(2)조건
//		    1) Test33클래스의 main()메서드에서 BookShop 클래스로 객체 ob를 만든다
//		    2) setBook("자바완성","황완성",25000)로 값을 대입한후 viewBook()메서드로 출력한다
//		    3) setBname("JSP잡기"),  setAuthor("송JP"), setPrice(3500)로 값을 대입한후
//		         getBname(), getAuthor(), getPrice()로 출력한다
		BookShop ob = new BookShop();

		ob.setBook("자바완성", "황완성", 25000);
		ob.viewBook();
		ob.setBname("JSP잡기");
		ob.setAuthor("송JP");
		ob.setPrice(35000);
		System.out.println();
		System.out.println("책이름 : " + ob.getBname());
		System.out.println("저자 : " + ob.getAuthor());
		System.out.println("가격 : " + ob.getPrice() + "원");

	}
}
