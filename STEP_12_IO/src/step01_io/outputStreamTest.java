package step01_io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class outputStreamTest {

	public static void main(String[] args) throws IOException    {
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String str = "자바 IO 학습중.....";
		bw.write(str); // System.out.println();
		bw.flush();
		bw.close();
		osw.close();
		
		//System.out 는 콘솔로 출력
	}

}
