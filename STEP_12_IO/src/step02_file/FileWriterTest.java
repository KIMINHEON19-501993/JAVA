package step02_file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterTest {

	public static void main(String[] args) throws IOException {
//		File file = new File("C:\\JAVA JDK\\JAVA\\STEP_12_IO\\storage\\data3.txt");//절대참조
		File file = new File("storage/data3.txt");
//		FileWriter fw = new FileWriter(file);
		Writer writer = new FileWriter(file);
		StringBuilder str =  new StringBuilder();
		
//		이 창에서 보는 페이지는 방문 기록에 나타나지 않으며, 
//		열려 있는 모든 게스트 창을 닫은 후 쿠키와 
//		같은 다른 흔적을 컴퓨터에 남기지 않습니다. 
//		하지만 다운로드한 파일은 모두 저장됩니다.
		str.append("이 창에서 보는 페이지는 방문 기록에 나타나지 않으며,\n");
		str.append("열려 있는 모든 게스트 창을 닫은 후 쿠키와\n");
		str.append("같은 다른 흔적을 컴퓨터에 남기지 않습니다.\n");
		str.append("하지만 다운로드한 파일은 모두 저장됩니다.\n");
		
		writer.write(str.toString());
//		writer.write("이 창에서 보는 페이지는 방문 기록에 나타나지 않으며, \r\n"
//				+ "열려 있는 모든 게스트 창을 닫은 후 쿠키와 \r\n"
//				+ "같은 다른 흔적을 컴퓨터에 남기지 않습니다. \r\n"
//				+ "하지만 다운로드한 파일은 모두 저장됩니다.");
		writer.flush();
		writer.close();
		
		System.out.println("data3.txt로 저장이 되었습니다.");
		

	}

}
