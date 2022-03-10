package 과제06;

import java.text.DecimalFormat;
import java.util.Scanner;

class Shape {
	public double area;
	final public double PI = 3.141592;
	int num;
	Scanner sc = new Scanner(System.in);

	public Shape() {

	}

	public int menu() {
		num = sc.nextInt();
		return num;
	}

	public void circle() {
		int r;
		System.out.print("반지름을 입력 : ");
		r = sc.nextInt();
		area = r * r * PI;
		output();

	}

	public void triangle() {
		int base;
		int high;

		System.out.print("밑  변 : ");
		base = sc.nextInt();
		System.out.print("높  이 : ");
		high = sc.nextInt();
		area = base * high * (1 / 2.0);
		output();
	}

	public void trapezoid() {
		int lowerside;
		int upperside;
		int high;
		System.out.print("아랫변 : ");
		lowerside = sc.nextInt();
		System.out.print("윗  변 : ");
		upperside = sc.nextInt();
		System.out.print("높  이 : ");
		high = sc.nextInt();
		area = (lowerside + upperside) * high / 2;
		output();
	}

	public void output() {

		if (num == 1 || num == 3) {
			System.out.printf("넓이 : %.2f", area);
		} else if (num == 2) {
			DecimalFormat df1 = new DecimalFormat("###,###,###.###");
			System.out.println("넓이 : " + df1.format(area));
		}

	}
}

public class Test37 {

	public static void main(String[] args) {

		Shape sp = new Shape();

		System.out.println("***도형선택*** 1.원 2.삼각형 3.사다리꼴 4.종료");
		switch (sp.menu()) {
		case 1:
			sp.circle();
			break;

		case 2:
			sp.triangle();
			break;

		case 3:
			sp.trapezoid();
			break;
		case 4:
			System.out.println("감사합니다.^-^");
			System.exit(0);
		}

	}

}
