package shape;

public class ShapeMain {

	public static void main(String[] args) {
		Shape sh = null;

		sh = new Rrctangle(4, 5);
		System.out.println("�簢���� ���� : " + sh.getSize());
		sh = new Triangle(3, 7);
		System.out.println("�ﰢ���� ���� : " + sh.getSize());
		
		
		Rrctangle rr = new Rrctangle(4, 5);
		System.out.println("�簢���� ���� : " + rr.getSize());
		Triangle tr = new Triangle(3, 7);
		System.out.println("�ﰢ���� ���� : " + tr.getSize());
	}

}
