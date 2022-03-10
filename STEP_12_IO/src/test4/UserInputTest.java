package test4;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class UserInputTest {

	public static void main(String[] args) {
		ObjectInputStream ois=null;
		try {
			ois = new ObjectInputStream(
					new FileInputStream("src/test4/user.txt"));
			
			while(true) {
				try {
					User ob=(User) ois.readObject();
					System.out.print(ob.toString());
				}catch (EOFException e) {
					break;
				
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
	}

}
