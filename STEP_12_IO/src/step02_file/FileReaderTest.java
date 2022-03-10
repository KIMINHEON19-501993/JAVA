package step02_file;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) throws IOException {
		
		File file =  new File("storage/data3.txt");
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		
		byte[] buffer = new byte[(int)file.length()];
		bis.read(buffer, 0,buffer.length);
		System.out.println(new String(buffer));
		
		bis.close();
		
		//data3.txt를 읽어서 출력 하세요.
//		File file =  new File("storage/data3.txt");
//		Reader re = new FileReader(file);
//		
//		
//		int readData;
//		while ((readData = re.read()) != -1) {
//			System.out.print((char)readData);
//		}
//		
//		re.close();
		
	}

}
