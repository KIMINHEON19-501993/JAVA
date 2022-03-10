package db4;

import java.util.List;

public class UserMain {

	public static void main(String[] args) {
		UserDao dao = new UserDao();
		
		List<UserEntity> list = dao.userList();
		
		for (UserEntity entity : list) {
			System.out.print(entity.getNum()+"\t");
			System.out.print(entity.getId()+"\t");
			System.out.print(entity.getPasswd()+"\t");
			System.out.print(entity.getName()+"\t");
			System.out.println(entity.getScore());
		}
		
		
		System.out.println("-------------------------------------");
		UserEntity entity = dao.selectUser("aa");
		System.out.print(entity.getNum()+"\t");
		System.out.print(entity.getId()+"\t");
		System.out.print(entity.getPasswd()+"\t");
		System.out.print(entity.getName()+"\t");
		System.out.println(entity.getScore());
		
		
		System.out.println("-------------------------------------");
//		int n = dao.insertUser(new UserEntity("cc", "2222", "in", 88.83));
//		
//		if (n > 0) {
//			System.out.println(n + "건의 데이터가 추가 되었습니다.");
//		}else
//			System.out.println("데이터가 추가에 실패했습니다.");		
		
	}

}
