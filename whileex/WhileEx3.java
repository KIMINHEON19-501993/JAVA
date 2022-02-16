package whileex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//switch와 while 를 이용 하여 메뉴 프로그램 작성
//1.사각형 2.삼각형 3.원. 4.종료
public class WhileEx3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n;

		while(true){
			System.out.print("1.사각형 2.삼각형 3.원. 4.종료 \n선택하세요 : ");
			
			n = Integer.parseInt(br.readLine());
			
			switch (n) {
				case 1: 
					System.out.println("사각형이 선택 되었 습니다."); 
					break;
				case 2: 
					System.out.println("삼각형이 선택 되었 습니다."); 
					break;
				case 3: 
					System.out.println("원이 선택 되었 습니다.");
					break;
				case 4: 
					System.out.println("*******프로그램을 종료합니다.*******");
					System.exit(0);
				default : System.out.println("입력된 값이 잘못 되었습니다."); break;
			}
		}
		
	}

}
