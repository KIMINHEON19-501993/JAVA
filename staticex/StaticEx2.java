package staticex;

import java.util.Scanner;

class EC{
	private static double rate; //�޷��� ��ȭ

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
		System.out.print("ȯ���� �Է� �ϼ��� : ");
		rate = sc.nextDouble();
		
		EC.setRate(rate);
		
		System.out.println("10������ " + EC.toDollar(100000) + "�޷� �Դϴ�.");
		System.out.println("10�޷��� " + EC.toWon(10) + "�� �Դϴ�.");
		sc.close();
	}

}
