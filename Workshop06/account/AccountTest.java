package account;

/*
[ 문제 5 다음과 같은 조건을 만족하는 프로그램을 작성 하시오
1. 조건
고정 금리의 계좌를 생성 하여 현재 잔액을 기준으로 이자를 계산하는 프로그램을 작성 한다. 사용 데이터
Account(계좌번호): 441-0290-1203, balance(잔액): 500000원, interestRate(이율): 7.3%
*/

public class AccountTest {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int money;
		
		// account 객체 생성
		Account account = new Account("441-0290-1203",500000,7.3); 
		// account 기본 정보 출력
		System.out.println("계좌정보 : " + account.getAccount() + " 현재잔액 : " +account.getBalance());
		// account 에서 600000원 출금
//		money = sc.nextInt();
		account.withdraw(600000);
		// account 에 20000원 입금
		account.deposit(20000);
		// account 변경 정보 출력
		System.out.println("계좌정보 : " + account.getAccount() + " 현재잔액 : " +account.getBalance());
		// 이자 출력 – 현재 잔고를 기준으로 고객에게 줄 이자 금액을 출력 한다.
		System.out.println(account.calculateInterest());
		
	}

}
