package step02_file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOuputStreamTest2 {

	public static void main(String[] args) throws IOException {
		OutputStream out = new FileOutputStream("src/step02_file/data2.txt"	);
		
		
		int readData;
		System.out.println("문자열을 입력 하고 마지막에 Ctrl+z로 종료하세요.");
		
		while ((readData = System.in.read()) != -1) {
			out.write(readData);
		}	
		System.out.println("data2.txt로 저장이 되었습니다.");
		out.flush(); //버퍼 비우기
		out.close();
	}

}
