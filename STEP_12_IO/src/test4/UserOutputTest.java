package test4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

public class UserOutputTest {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name;
		int age;
		double tall;

		System.out.println("입력을 종료하려면 Ctrl+Z를 입력하시오");

		//변수 입력 

		try {
			
			ObjectOutputStream oos = new ObjectOutputStream(
					new FileOutputStream("src/test4/user.txt",true)); //true :append허용
			do {
				System.out.print("Enter your name : ");
				name = br.readLine();
				System.out.print("Enter your age: ");
				age = Integer.parseInt(br.readLine());
				System.out.print("Enter your tall : ");
				tall = Double.parseDouble(br.readLine());
	
				//직렬화 및 //객체 생성
				oos.writeObject(new User(name, age, tall));
				System.out.print("계속 입력하려면 Enter키를 누르시오 ");
//				System.in.read();
//			}while(System.in.read()!=-1);
			}while(br.readLine()!=null);
			
			oos.flush();
			oos.close();
			System.out.println("\n\nuser.txt파일이 저장되었습니다");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일낫파운드");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("아이오익셉션");
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
