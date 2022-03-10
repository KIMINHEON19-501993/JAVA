package account;

/*
[ 문제 6] 다음과 같은 조건을 만족하는 프로그램을 작성 하시오.
1. 조건
7번에서 생성 한 Account Class를 이용하여 다음 조건에 맞는 프로그램을 작성 하시오.
1) Account 객체 5개를 저장하기 위한 배열을 선언한다.
2) for 문을 이용하여 5개의 Account 객체를 생성하고 배열에 저장 한다.
- 계좌번호: 221-0101-211X(X 부분은 1부터 5까지의 정수를 사용한다)
- 잔액 및 이자율은 모두 100000원, 4.5% 이다.
3) Account class에 Account의 모든 정보를 출력 할 수 있는 accountInfo()를 추가 한다.
( + accountInfo() : void )
- 출력예: 계좌번호: 221-0101-2111 잔액: 100000원 이자율: 4.5%
4) for문을 이용하여 생성된 배열의 모든 정보를 출력 한다.(출력 시 accountInfo()함수 이용)
5) for문을 이용하여 모든 Account 객체의 이자율을 3.7% 변경 하고 이자를 화면에 출력 한다.
*/
public class Account2 {

	public static void main(String[] args) {
		
		
		// 5개의 Account 형 객체 배열 선언
		Account[] account = new Account[5];
		// for문을 이용하여 Account 객체를 생성 후 배열에 저장
		for (int i = 0; i < account.length; i++) {
			account[i] = new Account("221-0101-211"+i+"",100000,4.5);
		}
		// for문을 이용하여 Account 정보 출력
		System.out.println("-----변경 전------");
		for (Account account2 : account) {
			account2.accountInfo();
			System.out.println();
		}
		
		
		System.out.println("\n-----변경 후------");
		// for문을 이용하여 이자율을 변경하고 Account 정보와 이자를 화면에 출력
		for (int i = 0; i < account.length; i++) {
			account[i].setInterestRate(3.7);
		}
		for (Account account2 : account) {
			account2.accountInfo();
//			System.out.println(" " +num.format(account2.calculateInterest()) + "원");
			System.out.println(" 이자 : " +
						String.format("%.0f", account2.calculateInterest()) + "원");
		}
	}

}
