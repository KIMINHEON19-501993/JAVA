package abstractex;

abstract class Shape {
	abstract public void OneDraw();

	abstract public void OneDelete();
}

class Rectangle extends Shape {

	@Override
	public void OneDraw() {
		System.out.println("�簢���� �׷���...");
	}

	@Override
	public void OneDelete() {
		System.out.println("�簢���� ������...");
	}

}

class Triangle extends Shape {

	@Override
	public void OneDraw() {
		System.out.println("�ﰢ���� �׷���...");
	}

	@Override
	public void OneDelete() {
		System.out.println("�ﰢ���� ������...");
	}

}

public class AbstractEx2 {

	public static void main(String[] args) {
		Shape sh = null;
		sh = new Rectangle();
		sh.OneDraw();
		sh.OneDelete();
		sh = new Triangle();
		sh.OneDraw();
		sh.OneDelete();
		
		Rectangle re = new Rectangle();
		Triangle tr = new Triangle();
		
		re.OneDraw();
		re.OneDelete();
		
		tr.OneDraw();
		tr.OneDelete();
	}

}
