
public class Test01 {

	public static void main(String[] args) {
//		[ 문제 1 ] 다음과 같은 조건을 만족하는 프로그램을 작성 하시오 
//		1. 조건 
//		다음 배열의 합과 평균을 구하는 프로그램을 작성 하시오. 
//		int[] arr = {10, 20, 30, 40, 50};
		
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		double avg = sum/arr.length;
		System.out.println("sum=" + sum);
		System.out.println("avg=" + (int)avg);

	}

}
