package workshop;



public class Test03 {
//	[ 문제 3 ] 다음과 같은 조건을 만족하는 프로그램을 작성 하시오. 1. 조건
//	eclipse에서 argument로 1~5까지의 정수형 데이터 하나를 입력 받아 입력 받은 수부터 10까지 합을 구
//	한다. 단, 3의 배수와 5의 배수는 합에서 제외 한다.
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int sum = 0;
		String str = "";
		
		for (int i = num; i <= 10; i++) {

			if (i % 3 == 0 || i % 5 == 0) {
				continue;
			}else {
				sum += i;
				str = str + i + " + ";//+를 없에기 위해 문자열로 저장
				
			}
		}
		
		System.out.print(str.substring(0,str.length()-3));// + 삭제
		System.out.println("\n합계 : " + sum);
	}

}
