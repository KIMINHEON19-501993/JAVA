package 과제05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test30 {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		[문제30] 아래와 같이 12달의 날수를 배열를 만들어 기억시킨후 
//		원하는 month을 입력받아 그 달의 날수를 출력하시오
//
//		(1) main()에서 배열선언후 코드를 완성하시오
//		      int []month={31,28,31,30,31,30,31,31,30,31,30,31};
//		 (2)콘솔에서 달(month)을 입력받아 해당하는 일(day)를 출력하시오.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] month={31,28,31,30,31,30,31,31,30,31,30,31};
		int num;
		
		System.out.print("원하는 month을 입력하시오. : ");
		num = Integer.parseInt(br.readLine());
		
		System.out.println(num + "월은 " + month[num-1] + "일 입니다.");
			
		
	}
}
