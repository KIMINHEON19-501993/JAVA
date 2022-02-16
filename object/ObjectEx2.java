package object;

/* 접근 지정자
 * +(public), -(private), #(protected), (default)
 * 클래스명 : Person
 * +name : String
 * +age : int
 * +score : float
 * 
 * +setPerson(name:String, a:int, s:flaat) : void
 * +viewPerson() : void
 */

public class ObjectEx2 {

	public static void main(String[] args) {
		User us = new User();
		us.setUser("뽀로로", 100, 100, 100);
		System.out.println(us.getUser());

	}

}
