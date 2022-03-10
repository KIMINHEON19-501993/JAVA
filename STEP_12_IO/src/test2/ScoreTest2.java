package test2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ScoreTest2 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = null;
		PrintWriter writer = null;
		
		reader = new BufferedReader(new FileReader("src/test1/Score.txt"));
		writer = new PrintWriter("src/test2/desc.txt");
		
		String name;
		int kor;
		int eng;
		int mat;

		while (true) {
			name = reader.readLine();
			if (name == null) {
				break;
			}
			kor = Integer.parseInt(reader.readLine());//문자열을 숫자로 처리
			eng = Integer.parseInt(reader.readLine());
			mat = Integer.parseInt(reader.readLine());//br.readLine 줄마다 읽음

			System.out.println("이름 : " + name + " 총점 : " + (kor + eng + mat) + " 평균 : "
					+ String.format("%.2f", (kor + eng + mat) / 3.0));
		
		
		writer.printf("\n이름 : %s 총점 : %d 평균 : %.2f",name,(kor + eng + mat),(kor + eng + mat) / 3.0);
		writer.flush();
		}
		reader.close();
		writer.close();
	}

}
