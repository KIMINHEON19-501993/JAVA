package stringex;

import java.util.Calendar;

class Today{
	public void print() {
//		System.out.println("오늘 날짜" + new Date());
		
//		Calendar cal = new GregorianCalendar();
//		Calendar cal = new Calendar();
		Calendar cal = Calendar.getInstance(); //시스템 설정 시각
//		System.out.println("dd");
//		System.out.println(cal);
		System.out.println("오늘 날짜 : " 
							+ cal.get(Calendar.YEAR) +"년 "
							+ cal.get((Calendar.MONDAY)+2)+"월 "
							+ cal.get(Calendar.DAY_OF_MONTH)+"일");
		
		System.out.println("현재 시각 : " 
				+ cal.get(Calendar.HOUR_OF_DAY) +"시 "
				+ cal.get((Calendar.MINUTE))+"분 "
				+ cal.get(Calendar.SECOND)+"초");
	}
}

public class CalendarEx {

	public static void main(String[] args) {
		Today to = new Today();
		to.print();
	}

}
