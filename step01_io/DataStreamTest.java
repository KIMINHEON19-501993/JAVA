package step01_io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) throws FileNotFoundException, IOException   {
		//result.txt 파일을 읽어 file 객체를 생성
		FileInputStream file = new FileInputStream("src/step01_io/result.txt");
		DataInputStream dis =  new DataInputStream(file);
		
		System.out.println("이름 : " + dis.readUTF());
		System.out.println("나이 : " + dis.readInt());
		System.out.println("신장 : " + dis.readDouble());
		System.out.println();
		System.out.println("이름 : " + dis.readUTF());
		System.out.println("나이 : " + dis.readInt());
		System.out.println("신장 : " + dis.readDouble());
		
		
			
//		//파일로 출력
//		//저장소에 result.txt 이름으로 파일을 생성하고 자바에서 file 객체로 처리 하겠다는 의미
//		FileOutputStream file = new FileOutputStream("C:\\JAVA JDK\\JAVA\\STEP_12_IO\\src\\step01_io\\result.txt"); 	
//		//file 객체 생성,상대 경로로 표기
//
//		//FileOutputStream file = new FileOutputStream("src/step01_io/result.txt");
//		//상대경로
//		
//		
//		
//		DataOutputStream dos = new DataOutputStream(file);
//		
//		dos.writeUTF("뽀로로");
//		dos.writeInt(23);
//		dos.writeDouble(173.5);
//		
//		dos.writeUTF("크롱");
//		dos.writeInt(25);
//		dos.writeDouble(170.5);
//		
//		dos.close();
//		file.close();
//		System.out.println("result.txt 파일이 저장되었습니다.");
				
		
		
		
		
		
	}

}
