package access1;

import access2.AccessEx3;

public class AccessEx1 extends AccessEx3{
	//자기 자신의 클래스 내에서만 접근이 가능
	private int x = 10;
	private int y = 20;

	public static void main(String[] args) {
		AccessEx1 a1 = new AccessEx1();
		System.out.println(a1.x + "\t" + a1.y);

		AccessEx2 a2 = new AccessEx2();
		System.out.println(a2.x + "\t" + a2.y);

		AccessEx3 a3 = new AccessEx3();
		System.out.println(a3.x + "\t" + a3.y);
		
//		AccessEx4 a4 = new AccessEx4();
//		System.out.println(a4.a + "\t" + a4.b);
	}

}
