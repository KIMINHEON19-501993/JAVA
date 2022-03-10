package step02_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileInputStreamTest01 {

	public static void main(String[] args) throws IOException, InterruptedException {
//------------------3.BufferedReader 줄단위 단위 읽기------------------------------
		InputStreamReader isr = new FileReader("src/step02_file/data1.txt");
		BufferedReader br = new BufferedReader(isr);
		//BufferedReader 줄단위 단위 읽기
		
		String str;
		while ((str = br.readLine()) != null) {
			
			System.out.println(str);
			Thread.sleep(100); //100/1000초
		}
		br.close();
		isr.close();
		
//------------------2.InputStreamReader 문자 단위 읽기------------------------------
//		InputStreamReader isr = new FileReader("src/step02_file/data1.txt");
////	InputStreamReader 문자 단위 읽기
//		
//		int readDate;
//		
//		while(true){
//			readDate = isr.read(); 
//			//바이트 단위 읽기 수행, 단점 : 한글이 깨져서 나온다. 객체 is가 InputStream 이기 때문
//			
//			if (readDate == -1 ) {//데이터의 끝
//				break;
//			}
//			System.out.print((char)readDate);
//			Thread.sleep(100);
//		}
//		isr.close();
//------------------1.InputStream 바이트 단위 읽기-------------------------------
//		InputStream is = new FileInputStream("src/step02_file/data1.txt");
////		InputStream 바이트 단위 읽기
//		
//		int readDate;
//		
//		while(true){
//			readDate = is.read(); 
//			//바이트 단위 읽기 수행, 단점 : 한글이 깨져서 나온다. 객체 is가 InputStream 이기 때문
//			
//			if (readDate == -1 ) {//데이터의 끝
//				break;
//			}
//			System.out.print((char)readDate);
//			Thread.sleep(100);
//		}
//		is.close();
	}

}
