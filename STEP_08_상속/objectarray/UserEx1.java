package objectarray;
//참조변수, 객체변수, 오브젝트 변수
public class UserEx1 {

	public static void main(String[] args) {
		User ob1 = new User("kim", "010-111-1111");
		User ob2 = new User("lee", "010-222-2222");
		User ob3 = new User("park", "010-333-3333");
		
		System.out.println(ob1.getName() + " : " + ob1.getPhone());
		System.out.println(ob2.getName() + " : " + ob2.getPhone());
		System.out.println(ob3.getName() + " : " + ob3.getPhone());
	}

}
