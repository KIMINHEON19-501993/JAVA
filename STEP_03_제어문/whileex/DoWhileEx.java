package whileex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoWhileEx {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;
		
		//입력 반복의 경우 입력을 하기전 반복을 하면 오류가 생기 므로 입력 후 나중에 조건문을 확인 하는 do~while을 사용 
		
		 do{
			System.out.println("점수를 입력 하세요.");
			num = Integer.parseInt(br.readLine());
		}while (num < 0 || num > 100);
		 
		 System.out.println("입력하신 점수는 : " + num + "입니다.");
	}

}
