package step01_io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) throws FileNotFoundException, IOException   {
		//result.txt ������ �о� file ��ü�� ����
		FileInputStream file = new FileInputStream("src/step01_io/result.txt");
		DataInputStream dis =  new DataInputStream(file);
		
		System.out.println("�̸� : " + dis.readUTF());
		System.out.println("���� : " + dis.readInt());
		System.out.println("���� : " + dis.readDouble());
		System.out.println();
		System.out.println("�̸� : " + dis.readUTF());
		System.out.println("���� : " + dis.readInt());
		System.out.println("���� : " + dis.readDouble());
		
		
			
//		//���Ϸ� ���
//		//����ҿ� result.txt �̸����� ������ �����ϰ� �ڹٿ��� file ��ü�� ó�� �ϰڴٴ� �ǹ�
//		FileOutputStream file = new FileOutputStream("C:\\JAVA JDK\\JAVA\\STEP_12_IO\\src\\step01_io\\result.txt"); 	
//		//file ��ü ����,��� ��η� ǥ��
//
//		//FileOutputStream file = new FileOutputStream("src/step01_io/result.txt");
//		//�����
//		
//		
//		
//		DataOutputStream dos = new DataOutputStream(file);
//		
//		dos.writeUTF("�Ƿη�");
//		dos.writeInt(23);
//		dos.writeDouble(173.5);
//		
//		dos.writeUTF("ũ��");
//		dos.writeInt(25);
//		dos.writeDouble(170.5);
//		
//		dos.close();
//		file.close();
//		System.out.println("result.txt ������ ����Ǿ����ϴ�.");
				
		
		
		
		
		
	}

}
