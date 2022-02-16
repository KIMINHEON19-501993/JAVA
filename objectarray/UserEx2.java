package objectarray;
//오브젝트 배열, 객체배열------1
public class UserEx2 {

	public static void main(String[] args) {
		User[] ob = new User[3];
		ob[0] = new User("kim", "010-111-1111");
		ob[1] = new User("lee", "010-222-2222");
		ob[2] = new User("park", "010-333-3333");
		
		
		for (User user : ob) {
			System.out.println(user.getName() + " : " + user.getPhone());
		}
	}

}
