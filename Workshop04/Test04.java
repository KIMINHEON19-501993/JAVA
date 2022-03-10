
public class Test04 {
	
	private static int calcSum(int kor, int eng, int mat, int sci) {
		
		return kor + eng + mat + sci;
	}
	
	public static void main(String[] args) {
//		[문제 4] 다음과 같은 조건을 만족하는 프로그램을 작성 하시오
//		1. 조건
//		4개의 점수를 입력 받아 점수의 합계와 평균을 구하는 프로그램을 작성 하시오.
//		1) 정수형 데이터 0~100범위에서 4개의 점수는 eclipse argument로 받아 들인다.
//		2) 0~100까지의 범위의 숫자가 입력된다고 가정 한다.
//		3) 합계를 구하기 위해서 calcSum() 메소드를 만든다.
//		4) 평균은 합계를 이용하여 구한다.
//		5) 평균 점수가 100이하~90이상 점이면 A학점, 90미만~70이상 이면 B학점, 70미만~50이상
//		이면 C학점, 50미만~30이상 이면 D학점, 나머지는 F학점으로 화면에 출력 한다.
//		6) 합은 정수형으로, 평균은 실수형으로 출력한다.]
		
		int kor = Integer.parseInt(args[0]);
		int eng = Integer.parseInt(args[1]);
		int mat = Integer.parseInt(args[2]);
		int sci = Integer.parseInt(args[3]);
		
		double avg;
		int sum;
		
		sum = calcSum(kor,eng,mat,sci);
		avg = (double)sum/args.length;
		
		System.out.println("sum=" + sum);
		System.out.println("avg=" + avg);
		switch((int)avg / 10) {
			case 10 : 
			case 9 :
				System.out.println("A");
				break;
			case 8 :
			case 7 : 
				System.out.println("B");
				break;
			case 6 :
			case 5 :
				System.out.println("C");
				break;
			case 4 :
			case 3 :
				System.out.println("D");
				break;
			default:
				System.out.println("F");
		}
	}
	
	

}
