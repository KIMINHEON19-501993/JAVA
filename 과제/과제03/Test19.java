package 과제03;

public class Test19 {

	public static void main(String[] args) {
//		[문제 19] 다중for문을 이용해서 다음과 같이 출력하시오
//		Korea 0  0
//		Korea 0  1
//		Korea 0  2
//
//		Korea 1  0
//		Korea 1  1
//		Korea 1  2
//
//		Korea 2  0
//		Korea 2  1
//		Korea 2  2
		
				
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println("korea " + i + " " + j);
			}
			System.out.println();
		}
		
	}
}
