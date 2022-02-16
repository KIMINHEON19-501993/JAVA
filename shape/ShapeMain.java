package shape;

public class ShapeMain {

	public static void main(String[] args) {
		Shape sh = null;

		sh = new Rrctangle(4, 5);
		System.out.println("»ç°¢ÇüÀÇ ³ĞÀÌ : " + sh.getSize());
		sh = new Triangle(3, 7);
		System.out.println("»ï°¢ÇüÀÇ ³ĞÀÌ : " + sh.getSize());
		
		
		Rrctangle rr = new Rrctangle(4, 5);
		System.out.println("»ç°¢ÇüÀÇ ³ĞÀÌ : " + rr.getSize());
		Triangle tr = new Triangle(3, 7);
		System.out.println("»ï°¢ÇüÀÇ ³ĞÀÌ : " + tr.getSize());
	}

}
