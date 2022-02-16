package constructor;
/*
 * 생성자에서 두수를 입력받아 큰수와 작은 수를 출력
 * show() 에서 maxValue(), minValue()호출
 * 클래스 명 : Max
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
		System.out.println("큰수 : " + maxValue());
		System.out.println("작은수 : " + minValue());
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
