package db2;

import java.util.Scanner;

/*1.전체 2.추가 3.수정 4.삭제 5.검색 6.종료
 * 선택하세요(1~6) : 1
 * aaa 010-111-1111 서울
 */
public class EmpMain {
	EmpDao dao = null;
	Scanner sc = null;

	public EmpMain() {
		sc = new Scanner(System.in);
		dao = new EmpDao();
	}

	public void menu() {
		int n = 0;
		
		String name = null, phone = null, addr = null;
		
		while (true) {
			System.out.println("1.전체 2.추가 3.수정 4.삭제 5.검색 6.종료");
			System.out.print("1~6 :");
			n = sc.nextInt();

			switch (n) {
			case 1:
				dao.addressList();
				break;
			case 2:
				System.out.print("이름 입력 : "); name = sc.next();
				System.out.print("전화 입력 : "); phone = sc.next();
				System.out.print("주소 입력 : "); addr = sc.next();
				dao.addressInsert(name,phone,addr);	
				break;
			case 3:
				System.out.print("수정할 사람 이름 : "); name = sc.next();
				if (dao.addressSearch(name)) {
					System.out.print("바꿀전화 입력"); phone = sc.next();
					System.out.print("바꿀주소 입력"); addr = sc.next();
					dao.addressUpdate(name,phone,addr);
				}else {
					System.out.println("수정 대상이 없습니다.");
				}
				break;
			case 4:
				System.out.println("삭제할 사람 : "); name = sc.next();
				if (dao.addressSearch(name)) {
					dao.addressDelete(name);
				}else {
					System.out.println("삭제할 대상이 없습니다.");
				}
				break;
			case 5:
				System.out.print("찾는 사람 이름 : "); name = sc.next();
				if (!dao.addressSearch(name)) {
					System.out.println("찾는 대상이 없습니다.");
				}
				break;
			case 6:
				sc.close();
				System.out.println("***** 종료합니다 *****");
				System.exit(0);
			default: 
				System.out.println("입력값에 문제가 있습니다.");

			}

		}
	}

	public static void main(String[] args) {

		new EmpMain().menu();

	}

}
