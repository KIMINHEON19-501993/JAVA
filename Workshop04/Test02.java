
public class Test02 {

	public static void main(String[] args) {
//		1. 조건 
//		다음 배열의 홀수 번째(배열의 인덱스의 홀수 번째) 정수의 합을 구하는 프로그램을 작성오. 
//		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				sum += arr[i];
			}
		}
		System.out.println("sum=" + sum);
	}

}
