package test3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmpOutputTest {

	public static void main(String[] args) throws IOException {

		// 입력 스트림 처리
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 출력 스트림 처리
//		PrintWriter pw  = new PrintWriter(new FileWriter("src/test3/emp"));

//		OutputStream file = new FileOutputStream("src/test3/emp");
//		FileWriter file = new FileWriter("src/test3/emp",true); //새파일 생성
//		FileWriter file = new FileWriter("src/test3/emp",true); //기존파일에 추가
//		FileWriter file = new FileWriter(new File("src/test3/emp"),true);//기존파일에 추가
//		PrintWriter pw  = new PrintWriter(file); //print(), write() 사용가능

		FileWriter file = new FileWriter(new File("src/test3/emp.txt"), true);// 기존파일에 추가
		BufferedWriter pw = new BufferedWriter(file); // write() 만 사용가능

		String name;
		String dept;
		int salary;

		System.out.println("입력을 종료하려면 Ctrl+Z를 입력하시오");

		do {

			System.out.print("이름을 입력 하시오 : ");
			name = br.readLine();
			System.out.print("부서를 입력 하시오 : ");
			dept = br.readLine();
			System.out.print("급여를 입력 하시오 : ");
			salary = Integer.parseInt(br.readLine());
			
			// print() 와 write()는 비슷
//			pw.print(name+"\t"+dept+"\t"+salary+"\n");
			pw.write(name + "\t" + dept + "\t" + salary + "\n");
			pw.flush();// 중요!
			System.out.println("계속 입력하려면 Enter키를 누르시오");
		} while (br.readLine() != null); 
		pw.close();
		System.out.println("emp.txt 파일이 저장되었습니다");
	}

}
