package step02_file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class FileOuputStreamTest01 {

	public static void main(String[] args) throws IOException {
		OutputStream out = new FileOutputStream("src/step02_file/data1.txt");

		String name = "뽀로로";
		int age = 25;
		double tell = 183.4;
		
		out.write(name.getBytes());//name 변수의 값을 byte 형태로 변환해서 리턴
		out.write(Integer.toString(age).getBytes());
		//정수형 변수를 문자열로 변환 시켜 byte형태로 변환해 리턴
		out.write(Double.toString(tell).getBytes());
		//실수형 변수를 문자열로 변환 시켜 byte형태로 변환해 리턴
		
		//출력 byte stream filestream
		
		PrintStream ps = new PrintStream(out); //out : 12번 라인의 파일로 출력
//		PrintStream ps = new PrintStream(System.out); //out : 12번 라인의 콘솔로 출력
		ps.printf("\n\n\r이름 : %s\n나이 : %d\n신장 : %.2f",name,age,tell);
		
		PrintWriter pw = new PrintWriter(out);
//		pw.printf("\n\n이름 : %s\n나이 : %d\n신장 : %.2f",name,age,tell);
//		pw.flush();//버퍼 버리기 ,운영체제에 요청, 반드시 기록 된다고 보장하지는 않음
		
		pw.close();
		ps.close();
		out.close();
		
		
		
		
		
	}

}
