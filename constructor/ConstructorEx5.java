package constructor;
/*
 * �����ڿ��� �μ��� �Է¹޾� ū���� ���� ���� ���
 * show() ���� maxValue(), minValue()ȣ��
 * Ŭ���� �� : Max
 * -a : int
 * -b : int
 * +Max()
 * +minValue() : int
 * +maxValue() : int
 * +show() : void
 */

import java.util.Scanner;

class Max{
	private int a;
	private int b;
	
	public Max() {
		Scanner sc = new Scanner(System.in);
		System.out.print("input A : "); a = sc.nextInt();
		System.out.print("input B : "); b = sc.nextInt();
		sc.close();
	}
	public void show() {
		System.out.println("ū�� : " + maxValue());
		System.out.println("������ : " + minValue());
	}
	
	public int maxValue() {
		return (a > b) ? a : b;
	}
	
	public int minValue() {
		return (a < b) ? a : b;
	}
}
public class ConstructorEx5 {
	
	public static void main(String[] args) {
		new Max().show();
	}

}
