
public class Test03 {

	public static void main(String[] args) {
//		[ 문제 3 ] 다음과 같은 조건을 만족하는 프로그램을 작성 하시오 
//		1. 조건 
//		2차원 배열 arr2에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 작성 하시오. int[][] arr2 = { 
//		{ 5, 5, 5, 5, 5}, 
//		{10,10,10,10,10}, 
//		{20,20,20,20,20}, 
//		{30,30,30,30,30} 
//		};
		int[][] arr2 = { 
						{ 5, 5, 5, 5, 5}, 
						{10,10,10,10,10}, 
						{20,20,20,20,20}, 
						{30,30,30,30,30} 
						};
		int tot = 0;
		int count = 0;
		double avg = 0;
		
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j< arr2[i].length; j++) {
				tot += arr2[i][j];
				count++;
			}
		}
		
		avg = tot/(double)count;
		
		System.out.println("tot="+tot);
		System.out.println("avg="+avg);
	}

}
