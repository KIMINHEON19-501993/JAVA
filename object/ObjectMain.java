package object;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectMain {

	public static void main(String[] args) {
//------------객체 직렬화 : io stream ----------------
		
		UserInfo ob1 = new UserInfo("민들래", 20, 89.5);
		UserInfo ob2 = new UserInfo("진달래", 22, 73.4);

		ObjectOutputStream oos;

		try {
			oos = new ObjectOutputStream(new FileOutputStream("storage/user.txt", false));

			oos.writeObject(ob1);
			oos.writeObject(ob2);
			System.out.println("객체 내보내기가 성공 하였습니다.");
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}
		 
		
//------객체 역질렬화------------------

//		try {
//			ObjectInputStream ois =
//					new ObjectInputStream(new FileInputStream("storage/user.txt"));
//			
//			UserInfo ui1 = (UserInfo)ois.readObject();
//			UserInfo ui2 = (UserInfo)ois.readObject();
//			
//			System.out.println("객체 가져오기에 성공 하였습니다.");
//			
//			ui1.disp();
//			System.out.println();
//			ui2.disp();
//			
//			ois.close();
//			
//		} catch (FileNotFoundException e) {
//			// TODO 자동 생성된 catch 블록
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO 자동 생성된 catch 블록
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			// TODO 자동 생성된 catch 블록
//			e.printStackTrace();
//		}
//	                       
	}

}
