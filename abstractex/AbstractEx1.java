package abstractex;

////--------------------------------------------------------------------3
//abstract class A { // abstract Ŭ����(�߻� Ŭ����),�̿ϼ� Ŭ����--->������ �ǹ�
//	public /*abstract*/ void view1() { //abstract�� public �� �� �� ��𿡵� ��밡��
//		System.out.println("view1 method");
//	}// abstract method�� ��� abstract class�� ���� �Ҽ� �ִ�.
//
//	public void view2() {
//		System.out.println("view2 method");
//	}
//}
//
//class B extends A {
//
//	@Override
//	public void view1() {
//		System.out.println("view11 method");
//		// A Ŭ������ view1�� ������ ---- �������� ����
//	}
//
//}
//
//public class AbstractEx1 {
//
//	public static void main(String[] args) {
//		A ob1 = new A(); // ��ü���� �Ұ���
//		ob1.view1(); // v1
//		ob1.view2(); // v2
//
//		B ob2 = new B();
//		ob2.view1(); // v11
//		ob2.view2(); // v2
//
//		A ob3 = new B();
//		ob3.view1(); // v11
//		ob3.view2(); // v2
//	}
//}
////--------------------------------------------------------------------2
//abstract class A{ // abstract Ŭ����(�߻� Ŭ����),�̿ϼ� Ŭ����--->������ �ǹ�
//	abstract public void view1();//abstract method(�߻�  method) ,�̿ϼ� �޼���
//	public void view2() {System.out.println("view2 method");}
//}
//	
//class B extends A{
//
//	@Override
//	public void view1() {
//		System.out.println("view11 method");
//		//A Ŭ������ view1�� ������ ---- �������� ����
//	}
//		
//}
//
//public class AbstractEx1 {
//
//	public static void main(String[] args) {
//		A  ob1 = new A(); //��ü���� �Ұ���
//		ob1.view1(); //v1
//		ob1.view2(); //v2
//		
//		B ob2 = new B();
//		ob2.view1(); //v11
//		ob2.view2(); //v2
//		
//		A ob3 = new B();
//		ob3.view1(); //v11
//		ob3.view2(); //v2
//	}
//}
//-----------------------------------------------------------1
//class A{ // �Ϲ� Ŭ����
//	public void view1() {System.out.println("view1 method");}
//	public void view2() {System.out.println("view2 method");}
//}
//	
//class B extends A{
//		@Override
//		public void view1() {System.out.println("view11 method");}
//		//AŬ������ view1()�� ������ ---- ������ ���� X
//}
//
//public class AbstractEx1 {
//
//	public static void main(String[] args) {
//		A  ob1 = new A(); //��ü���� ����
//		ob1.view1(); //v1
//		ob1.view2(); //v2
//		
//		B ob2 = new B();
//		ob2.view1(); //v11
//		ob2.view2(); //v2
//		
//		A ob3 = new B();
//		ob3.view1(); //v11
//		ob3.view2(); //v2
//	}
//}
