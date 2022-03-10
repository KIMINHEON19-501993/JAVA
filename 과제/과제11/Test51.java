package 과제11;

import java.util.Calendar;
import java.util.Random;

/*
 * [문제 51]오늘의 금전운세 만들기 
        Calendar, Math 또는 Random클래스를 이용하여 다음 프로그램을 완성하시오
(1) Calender클래스를 이용해서 오늘 날짜를 구하시오
(2) 오늘의 금전운은 0~100사이의 난수를 발생해서 만드시오

[결과화면]
2020년 7월 3일 당신의 금전운은 95%입니다
*/
class Test51  {

	public static void main(String[] args) {
//		(1) Calender클래스를 이용해서 오늘 날짜를 구하시오.
		Calendar cl = Calendar.getInstance(); 
		System.out.print(cl.get(Calendar.YEAR) + "년 ");
		System.out.print(cl.get(Calendar.MONDAY)+1+ "월 ");
		System.out.print(cl.get(Calendar.DAY_OF_MONTH) + "일");
//		(2) 오늘의 금전운은 0~100사이의 난수를 발생해서 만드시오.
		Random rd = new Random();
		int luck;
		luck = rd.nextInt(101);
		
		System.out.print("당신의 금전운은 " + luck + "%입니다");
		
	}
}
