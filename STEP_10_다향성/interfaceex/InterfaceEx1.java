package interfaceex;

////abstract 클래스
//abstract class Shape{
//	final int r = 10;
//	abstract public void draw();
//	abstract public void erase();	
//}
//
//class Circle extends Shape{
//	@Override
//	public void draw() { //abstract 형 이므로 오버라이드 강제성 O
//		System.out.println("반지름이 " +  r + "인 원을 그린다.");
//	}
//	@Override
//	public void erase() {
//		System.out.println("원을 지운다.");
//	}
//}
//
//public class InterfaceEx {
//
//	public static void main(String[] args) {
//		Circle cir = new Circle();
//		cir.draw();
//		cir.erase();
//	}
//
//}
//인터페이스 다이어그램상 표기는 ----->(점선 화살표),반드시 오버라이딩 사용

//일반 클래스
//class Shape{
//	final int r = 10;
//	public void draw(){}
//	public void erase() {}
//	
//}
//class Circle extends Shape{
//	@Override
//	public void draw() { //public 형 이므로 오버라이드 강제성 X
//		System.out.println("반지름이 " +  r + "인 원을 그린다.");
//	}
//	@Override
//	public void erase() {
//		System.out.println("원을 지운다.");
//	}
//}
//
//public class InterfaceEx1 {
//
//	public static void main(String[] args) {
//		Circle cir = new Circle();
//		cir.draw();
//		cir.erase();
//	}
//
//}