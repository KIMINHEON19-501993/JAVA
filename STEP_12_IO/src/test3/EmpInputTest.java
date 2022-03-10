package test3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;

public class EmpInputTest {

	public static void main(String[] args) throws IOException {
		Reader reader = new FileReader("src/test3/emp.txt");
		BufferedReader br = new BufferedReader(reader);
		
		String name;
		String dept;
		int salary;
		
		//문자열을 파싱 하기위한 객체 선언
		StringTokenizer st = null;
		String str = null;
		
		while ((str = br.readLine()) != null) {
			st = new StringTokenizer(str, "\t");
			name = st.nextToken();
			dept = st.nextToken();
			salary = Integer.parseInt(st.nextToken());
			
			System.out.println("이름 : " + name + " 부서 : " + dept + " 급여 : " + salary);
		}
		br.close();
	}

}
