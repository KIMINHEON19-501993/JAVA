package stringex;

import java.util.Calendar;

class Today{
	public void print() {
//		System.out.println("���� ��¥" + new Date());
		
//		Calendar cal = new GregorianCalendar();
//		Calendar cal = new Calendar();
		Calendar cal = Calendar.getInstance(); //�ý��� ���� �ð�
//		System.out.println("dd");
//		System.out.println(cal);
		System.out.println("���� ��¥ : " 
							+ cal.get(Calendar.YEAR) +"�� "
							+ cal.get((Calendar.MONDAY)+2)+"�� "
							+ cal.get(Calendar.DAY_OF_MONTH)+"��");
		
		System.out.println("���� �ð� : " 
				+ cal.get(Calendar.HOUR_OF_DAY) +"�� "
				+ cal.get((Calendar.MINUTE))+"�� "
				+ cal.get(Calendar.SECOND)+"��");
	}
}

public class CalendarEx {

	public static void main(String[] args) {
		Today to = new Today();
		to.print();
	}

}
