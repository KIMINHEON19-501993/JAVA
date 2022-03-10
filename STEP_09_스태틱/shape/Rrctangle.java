package shape;

public class Rrctangle extends Shape{
	public Rrctangle() {
	
	}
	
	public Rrctangle(int x, int y) {
		super(x, y);
	}

	@Override
	public double getSize() {
		return getX() * getY();
	}
	
}
