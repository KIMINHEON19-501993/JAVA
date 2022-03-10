package 과제03;

import java.util.Random;

public class Test14 {

	public static void main(String[] args) {
//		[문제14] 50개의 난수를 만들어서 다음과 같이 출력하시오
//	       조건1) 0 - 100 사이의 수 일것
//	       조건2) 1줄에 6개씩 표시하시오
		Random rd = new Random();
		int k = 0;
		int sum = 0;
			for(int i = 0; i <9; i++) {
				
				for(int j = 0; j < 6; j++) {
					int num = rd.nextInt(100)+0;
					System.out.print(num + "\t");
					k++;
					sum += num;
					if(k == 50) {
						break;
					}
				}
				System.out.println();
			}
			System.out.println("합=" + sum);	
	}
		
}

