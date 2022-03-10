package STEP_02_연산자;

public class CastingEx {

	public static void main(String[] args) {

		
		int pay = 857650;
		double tax = 0.033; //3.3%
		
		int rPay  = pay - (int)(pay * tax);
		
		System.out.println("실수령액 : " + rPay + "원");
		
		
//		int k = 87, e = 88, m = 75;
//		int tot = k + e + m;
//
//		double age = tot / 3.0; // 자동 형변환
//		// double age = (double)tot / 3; 3.0 강제 형변환 후 자동 형변환
//
//		System.out.println("총점 : " + tot);
//		System.out.println("평균 : " + age);
//		System.out.printf("평균 : %.2f", age);

//		byte a = 100;
//		int b = a; //자동 형변환
//		
//		System.out.println(a + " " + b);
//		
//		double c = 73.45;
//		int d = (int)c; //강제 형변환
//		
//		System.out.println(c + " " + d);
	}

}
