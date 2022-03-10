package 과제03;

public class Test21 {

	public static void main(String[] args) {
		//[문제 21] 아래 배열의 값 중 홀수방의 합과 짝수방의 합을 구하시오(단일 for문)
		//int[] num={1,5,2,7,3,9,10,4,6,8};
		
		int sumA = 0;
		int sumB = 0;
		
		int[] num={1,5,2,7,3,9,10,4,6,8};
		for(int i = 0; i < num.length; i++) {
			if(i % 2 == 0) {
				sumA += num[i];
			}else {
				sumB+=num[i];
			}
		}
		
		System.out.println("홀수 방의 합 = " + sumB);
		System.out.println("짝수 방의 합 = " + sumA);
	}
}
