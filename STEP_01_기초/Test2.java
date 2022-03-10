package STEP_01_기초;

//4개의 변수를 만들어서 변수를 출력


public class Test2 {

	public static void main(String[] args) {

		String name = "강호동";
		int kor = 95;
		int eng = 85;
		int mat = 73;
		int total = kor + eng + mat;
		
		System.out.printf("이름:%s\n", name);
		System.out.printf("국어:%d\n", kor);
		System.out.printf("영어:%d\n", eng);
		System.out.printf("수학:%d\n", mat);
		System.out.printf("총점:%d점", total);
	}

}
