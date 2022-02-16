package test;

import java.util.List;
import java.util.Scanner;

/*
 * ID를 입력하세요 : pororo
 * PW를 입력하세요 : 1234
 * 
 * 뽀로로님이 입장하셨습니다.
 * 현재 포인트는 89.97점입니다.
 * 
 * ***** Book의 정보 보기*****
 * 책이름 : java	책저자 : kim	페이지 : 200
 * 책이름 : network	책저자 : lee	페이지 : 300
 * 책이름 : programming	책저자 : park	페이지 : 400
 * ------------------------------------------------
 * ID를 입력하세요 : pororo
 * PW를 입력하세요 : 1111
 * 
 * ID 또는 PW가 잘못 되었습니다.
 */
public class UserMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String id;
		String pw;

		System.out.print("ID를 입력하세요 : ");
		id = sc.next();
		System.out.print("PW를 입력하세요 : ");
		pw = sc.next();

		UserProc up = new UserProc();
		up.getLoginUser(id, pw);
		User entity = up.getLoginUser(id, pw);
		if (entity == null) {
			System.out.println("ID 또는 PW가 잘못 되었습니다.");
		} else {
			System.out.println(entity.getName() + "님이 입장하셨습니다.");// 값의 검사 필요
			System.out.println("현재 포인트는 " + entity.getPoint() + "점입니다.");

			System.out.println("***** Book의 정보 보기*****");

			BookProc book = new BookProc();
			// book의 정보를 가지고 오는 역활

			List<Book> list = book.getList();

			for (Book ob : list) {
				System.out.print("책이름 : " + ob.getTitle());
				System.out.print("책저자 : " + ob.getAuthor());
				System.out.print("페이지 : " + ob.getPage() + "\n");
			}

		}
		sc.close();

	}
}
