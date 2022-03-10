package shape;

public class Rectangle extends Shape implements Resize{
	
	public Rectangle() {
		
	}

	public Rectangle(int width, int height, String colors) {
		super(width,height,colors);
	}	
	
	@Override
	public double getArea() {
			
		return width * height;

	}	
	
	@Override
	public void setResize(int size) {
		setWidth(size + width);
	}

}
