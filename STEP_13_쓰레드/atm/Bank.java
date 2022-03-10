package atm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bank implements Runnable {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private long balance; // 찾는 금액
	private long depositMoney = 100000; // 잔액

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName() + " 고객님 어서오세요.");
		// Thread.currentThread().getName() Thread의 이름을 뽑아 낼때 사용

		System.out.println("출금하실 금액을 입력 하세요");
		try {
			balance = Long.parseLong(br.readLine());
		} catch (NumberFormatException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}

		withDraw();

	}

	public void withDraw() {
		if (depositMoney >= balance) {
			if (balance % 10000 == 0) {
				depositMoney = depositMoney - balance;
				System.out.println("남은 금액 : " + depositMoney + "원 입니다.");
			}else {
				System.out.println("만원 단위로 입력해 주세요.");
			}
		} else {
			System.out.println("잔액이 부족 합니다.");
		}

	}
}
