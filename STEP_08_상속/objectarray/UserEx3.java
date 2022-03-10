package objectarray;
//오브젝트 배열, 객체배열------2

//new User("kim" , "010-111-1111")
//new User("lee", "010-222-2222")
//new User("park", "010-333-3333")
public class UserEx3 {

	public static void main(String[] args) {
//		User[] ob = new User[] {new User("kim" , "010-111-1111"),
//								  new User("lee", "010-222-2222"),
//								  new User("park", "010-333-3333")};
//		for (User user : ob) {
//			System.out.println(user.getName() + " : " + user.getPhone());
//		}
		
		User[] ob = {
				new User("kim" , "010-111-1111"),
				new User("lee", "010-222-2222"),
				new User("park", "010-333-3333")
		};
		for (User user : ob) {
			System.out.println(user.getName() + " : " + user.getPhone());
		}
		
	}

}
