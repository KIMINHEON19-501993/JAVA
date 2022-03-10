package object;

import java.util.Scanner;

/*
 * *****사다리꼴 넓이구하기*****
 * 밑변을 입력 하세요. 4
 * 윗변을 입력 하세요. 5
 * 높이를 입력 하세요. 6
 * 넓이 : 27.0
 * 한번더 수행 할까요? (Y/y) y
 * 밑변을 입력 하세요. 4
 * 윗변을 입력 하세요. 5
 * 높이를 입력 하세요. 6
 * 넓이 : 27.0
 * 한번더 수행 할까요? (Y/y) n
 */
public class ObjectEx7 {

	public static void main(String[] args) {

		Trapezoid tz = new Trapezoid();
		Scanner sc = new Scanner(System.in);

		int base;
		int top;
		int height;
		char why;

		do {//입력값이 있기전 while문을 사용할 경우
				System.out.println("*****사다리꼴 넓이 구하기*****");
				System.out.print("밑변을 입력 하세요. : ");
				base = sc.nextInt();
				System.out.print("윗변을 입력 하세요. : ");
				top = sc.nextInt();
				System.out.print("높이를 입력 하세요. : ");
				height = sc.nextInt();
	
				// Trapezoid 클래스로 객체를 만들어 넓이 구하기
	
				tz.setTrapezoid(base, top, height);
				System.out.println(tz.toString());
	
				System.out.print("한번더 수행 할까요? (Y/y) : ");
				why = sc.next().charAt(0);
		} while (why == 'Y' || why == 'y');
		System.out.println("*******수고하셨습니다.********");
		sc.close();
	}
}
