package staticex;

import java.util.Scanner;

class EC{
	private static double rate; //달러당 원화

	public static void setRate(double r) {
		rate = r;
	}
	public static double toDollar(int won) {
		return won/rate;	
	}
	public static double toWon(int dollar) {
		return dollar*rate;	
	}
}

public class StaticEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double rate;
		System.out.print("환율을 입력 하세요 : ");
		rate = sc.nextDouble();
		
		EC.setRate(rate);
		
		System.out.println("10만원은 " + EC.toDollar(100000) + "달러 입니다.");
		System.out.println("10달러는 " + EC.toWon(10) + "원 입니다.");
		sc.close();
	}

}
