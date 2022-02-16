package inheritance;

//----------------------------------------------------------2
class SuperEx{
	public void show() {
		System.out.println("show1 method");
	}
}

class SubEx extends SuperEx{ //SubEx가 SuperEx를 상속받는다
	@Override
	public void show() {
		super.show();
		System.out.println("show2 method");
	}
}

public class InheritanceEx1 {

	public static void main(String[] args) {
		SubEx ob=new SubEx();
		ob.show();
	}

}

//---------------------------------------------1
//class SuperEx{
//	public void show1() {
//		System.out.println("show1 method");
//	}
//}
//
//class SubEx extends SuperEx{ //SubEx가 SuperEx를 상속받는다
//	public void show2() {
//		System.out.println("show2 method");
//	}
//}
//
//public class InheritanceEx1 {
//
//	public static void main(String[] args) {
//		SubEx ob=new SubEx();
//		ob.show1();
//		ob.show2();
//	}
//
//}















































