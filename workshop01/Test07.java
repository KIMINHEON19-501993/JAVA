package workshop01;

public class Test07 {

	public static void main(String[] args) {
		//[ 문제 7 ] 다음과 같은 조건을 만족하는 프로그램을 작성 하시오 
		//선언된 정수형 데이터가 홀수인지 짝수인지 출력한다. 
		//단, 연산처리는 삼항 연산자를 이용한다. 
		//선언 변수: int inx = 5;
		//출력은 아래와 같이 이루어 진다. 
		//선언 변수 5 일때 결과: 숫자 5는 홀수입니다.

		int inx = 5; 
		String result = (inx % 2 == 0) ? "짝수" : "홀수"; 
		System.out.println(result); 



	}

}
