package object;
/*
 * -base : int
 * -top : int
 * -height : int
 * 
 * +setTrapezoid :(base : int, top : int, height : int) : void
 * +cal():double
 * toString():String 
 */
public class Trapezoid {
	
	private int base;
	private int top;
	private int height;
	
	public void setTrapezoid(int base, int top, int height) {
		this.base = base;
		this.top = top;
		this.height = height;
	}
	
	public double cal() {
		return ((base  + top) * height )/ 2.0;
	}
	
	public String toString() {
		return "≥–¿Ã : " + cal();
	}
	
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
