package month;

/*
 * [ 문제 2 ] 아래 조건에 맞는 프로그램을 작성 하시오
월을 입력 받아 그 월의 마지막 일자를 출력하는 프로그램을 작성 한다
1. 사용 데이터
l 프로그램 실행 시 1개의 숫자를 argument로 받아 들인다
l 1개의 숫자는 1~12까지의 정수형태로만 받아 들인다, 1~12이외의 숫자를 입력 하면
“입력된 값이 잘못 되었습니다”라고 화면에 출력 한다
l 각 월의 마지막 날은 아래와 같다
 */
public class MontTest {

	public static void main(String[] args) {

		Months mon = new Months();
		int num, day;
		num = Integer.parseInt(args[0]);
		
		if (num >= 1 && num <= 12) {
			System.out.println("입력한 달 : " + num + "월");
			day = mon.getDays(num);
			System.out.println("마지막 날짜 : " + day + "일");
		} else {
			System.out.println("입력된 값이 잘못 되었습니다.");
		}
	}

}
