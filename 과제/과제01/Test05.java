package 과제01;

public class Test05 {

	public static void main(String[] args) {
		// [문제5] 다음을 각각 변수에 대입해서 계산하시오.

		String name = "민들레";
		int kor = 90;
		int eng = 70;
		int mat = 75;
		int tot;
		double avg;

		tot = kor + eng + mat;
		avg = tot / 3.0;

		System.out.println("이름 : " + name);
		System.out.println("합계점수 : " + tot + "점");
		System.out.printf("평균점수 : %.1f", avg);
	}

}
