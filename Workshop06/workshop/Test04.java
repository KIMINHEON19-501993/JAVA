package workshop;

import java.util.Random;

/*
[ 문제 4 ] 다음과 같은 조건을 만족하는 프로그램을 작성 하시오. 
1. 조건 
1) eclipse Argument 에서 1~5까지의 두 개의 정수형 데이터를 입력 받는다. 
2) 입력 받은 데이터가 2개 미만 또는 2개 초과로 입력 하면 “다시 입력 하세요” 출력 
3) 1~5이외의 숫자가 입력 될 경우 “숫자를 확인 하세요” 출력 
4) 입력 받은 두 개의 정수를 이용하여 2차원 배열을 생성한다. 
5) 2차원 배열에 1~5까지의 랜덤한 숫자(중복허용)를 넣는다. 
6) 배열의 내용을 출력 한다. 
7) 배열의 총합과 평균을 실수형으로 출력 한다. 
*/

public class Test04 {
	public static void main(String agrs[]) {
		
		
		try {
			int num1 = Integer.parseInt(agrs[0]);
			int num2 = Integer.parseInt(agrs[1]);
			
			double sum = 0.0;
			double avg = 0.0;
			Random rs = new Random();
			
			if((num1 > 5 || num1 < 1) && (num2 > 5 || num2 < 1)){//num 이 1 보다 작거나 5보다 클때 
				System.out.println("숫자를 확인 하세요");
			}
			else {
				int[][] arr = new int[num1][num2];//2차원 배열의 크기
				
				for (int i = 0; i < arr.length; i++) {//행의 길이
					for (int j = 0; j < arr[i].length; j++) {//열의 길이
						arr[i][j] = rs.nextInt(5)+1;//1부터 5까지의 수
					}
				}
				
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						System.out.print(arr[i][j] + " ");
						sum += arr[i][j];
					}
					System.out.println();
				} 
				System.out.println("합계 : " + sum);
				avg = sum / (num1*num2); //합계 / (정수의 개수)
				System.out.println("평균 : "+avg);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("다시입력 하세요");
		} 
		
	
		
	}
}
