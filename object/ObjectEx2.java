package object;

/* ���� ������
 * +(public), -(private), #(protected), (default)
 * Ŭ������ : Person
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
		us.setUser("�Ƿη�", 100, 100, 100);
		System.out.println(us.getUser());

	}

}
