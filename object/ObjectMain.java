package object;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectMain {

	public static void main(String[] args) {
//------------��ü ����ȭ : io stream ----------------
		
		UserInfo ob1 = new UserInfo("�ε鷡", 20, 89.5);
		UserInfo ob2 = new UserInfo("���޷�", 22, 73.4);

		ObjectOutputStream oos;

		try {
			oos = new ObjectOutputStream(new FileOutputStream("storage/user.txt", false));

			oos.writeObject(ob1);
			oos.writeObject(ob2);
			System.out.println("��ü �������Ⱑ ���� �Ͽ����ϴ�.");
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO �ڵ� ������ catch ���
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �ڵ� ������ catch ���
			e.printStackTrace();
		}
		 
		
//------��ü ������ȭ------------------

//		try {
//			ObjectInputStream ois =
//					new ObjectInputStream(new FileInputStream("storage/user.txt"));
//			
//			UserInfo ui1 = (UserInfo)ois.readObject();
//			UserInfo ui2 = (UserInfo)ois.readObject();
//			
//			System.out.println("��ü �������⿡ ���� �Ͽ����ϴ�.");
//			
//			ui1.disp();
//			System.out.println();
//			ui2.disp();
//			
//			ois.close();
//			
//		} catch (FileNotFoundException e) {
//			// TODO �ڵ� ������ catch ���
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO �ڵ� ������ catch ���
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			// TODO �ڵ� ������ catch ���
//			e.printStackTrace();
//		}
//	                       
	}

}
