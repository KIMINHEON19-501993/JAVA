package 과제01;
public class Test03 {

	public static void main(String[] args) {
		// [문제3] 급여명세서를 작성하시오.
		// 조건1) 기본급이 1,500,000원,시간수당이 55,000원,세금은 기본급의 10%
		// 조건2) 실수령액 = 기본급 + 시간수당 - 세금

		int money = 1500000; 
		int time = 55000; 
	    double tax = 0.1; 
	    int tot;
			  
		tot = money + time - ((int) (money * tax));
				  
		System.out.println("실수령액 : " + tot + "원");
	}

}
