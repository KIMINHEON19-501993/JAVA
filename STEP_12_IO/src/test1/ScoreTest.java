package test1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ScoreTest {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("src/test1/Score.txt"));

		String name;
		int kor;
		int eng;
		int mat;

		while (true) {
			name = br.readLine();
			if (name == null) {
				break;
			}
			kor = Integer.parseInt(br.readLine());
			eng = Integer.parseInt(br.readLine());
			mat = Integer.parseInt(br.readLine());

			System.out.println("이름 : " + name + " 총점 : " + (kor + eng + mat) + " 평균 : "
					+ String.format("%.2f", (kor + eng + mat) / 3.0));
		}

//			while((name = br.readLine()) != null) {
//				
//				kor = Integer.parseInt(br.readLine());
//				eng = Integer.parseInt(br.readLine());
//				mat = Integer.parseInt(br.readLine());
//				
//				System.out.println("이름 : " + name 
//						        + " 총점 : " + (kor + eng + mat)
//						        + " 평균 : " + String.format("%.2f",(kor + eng + mat)/3.0));
//			}
		
		br.close();
		
	}

}
