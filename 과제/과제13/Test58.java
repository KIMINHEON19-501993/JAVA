package 과제13;

import java.util.Scanner;

/*
 * [문제 58] interface와 다형성을 이용하여 프로그램을 완성하시오(동적바인딩)
(1) 인터페이스명 : Shape
     메서드 : onDraw():void        <-- 추상메서드
                 onDelete():void      <-- 추상메서드

(2) 클래스명 :  Rectangle  (Shape상속받음)

(3) 클래스명 :  Circle     (Shape상속받음)

(4) 클래스명 : ShapeMain  <--- main()이 있는 클래스
 */
interface Shape {
	void onDraw();

	void onDelete();

}

class Rectangle implements Shape {

	@Override
	public void onDraw() {
		System.out.println("사각형을 그린다.");
	}

	@Override
	public void onDelete() {
		System.out.println("사각형을 지운다.");
	}

}

class Circle implements Shape {

	@Override
	public void onDraw() {
		System.out.println("삼각형을 그린다.");
	}

	@Override
	public void onDelete() {
		System.out.println("삼각형을 지운다.");
	}

}

public class Test58 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		Shape sh = null;

		while (true) {
			System.out.println("1.사각형  2.원  3.종료");
			n = sc.nextInt();

			switch (n) {
			case 1:
				sh = new Rectangle();
				sh.onDraw();
				sh.onDelete();
				break;
			case 2:
				sh = new Circle();
				sh.onDraw();
				sh.onDelete();
				break;
			case 3 :
				System.exit(0);
			}
		}

	}
}
