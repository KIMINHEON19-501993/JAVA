package shape;

public class ShapeTest {
	public static void main(String[] args) {
		Shape shape[] = new Shape[6];
		shape[0] = new Triangle(7, 5, "Blue");
		shape[1] = new Rectangle(4, 6, "Blue");
		shape[2] = new Triangle(6, 7, "Red");
		shape[3] = new Rectangle(8, 3, "Red");
		shape[4] = new Triangle(9, 8, "White");
		shape[5] = new Rectangle(5, 7, "White");

		System.out.println("기본정보");
		for (Shape n : shape) {
			System.out.println(n.getClass().toString().substring(
					n.getClass().toString().lastIndexOf(".")+1)+" : " + n.getArea() + " " + n.colors);			
		}
		
		 for (int i = 0; i < shape.length; i++) {
			((Resize)shape[i]).setResize(5);//
		}
		
		System.out.println();
		System.out.println("사이즈를 변경한 후 정보");
		for (Shape n : shape) {
			System.out.println(n.getClass().toString().substring(
					n.getClass().toString().lastIndexOf(".")+1)+" : " + n.getArea() + " " + n.colors);			
		}

		// (1.조건)에서 주어진 데이터를 기반으로 Shape type의 객체를 생성 하여
		// 6개의 도형 객체를 배열에 넣는다.
		// 모든 객체의 넓이 정보와 색상 정보를 for Loop를 이용하여 화면에 출력 한다
		// 모든 객체들을 setResize함수를 이용하여 5를 입력 하고 사이즈를 변경 후
		// 화면에 출력 한다. 단 for Loop문을 이용한다.
		
	}

}
