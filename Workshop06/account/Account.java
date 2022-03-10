package account;

public class Account {
	private String account;
	private int balance;
	private double interestRate;
	
	public Account() {
		
	}

	public Account(String account, int balance, double interestRate) {
		super();
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public void accountInfo() {
		System.out.print("계좌번호: " + getAccount());
		System.out.print(" 잔액: " + getBalance());
		System.out.print("원 이자율: " + getInterestRate() + "%");
	}
	
	public void deposit(int money) {
		this.balance =this.balance + money;
		System.out.println(balance);
	}
	public void withdraw(int money) {
		if(this.balance - money <= 0) {
			System.out.println("출금 할수 없습니다.");
		}else {
			this.balance =this.balance - money;
			System.out.println(balance);
		}
	}
	public double calculateInterest(){
		return this.balance * (this.interestRate/100);
	}
	public String getAccount() {
		return account;
	}
	public int getBalance() {
		return balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	
}
