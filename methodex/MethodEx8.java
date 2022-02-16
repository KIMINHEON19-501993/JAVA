package methodex;

import java.util.Random;

//call by  reference : 참조에 의한 호출, 함수의 매개변수를 참조주소로 전달
public class MethodEx8 {
	
	public static void view1() {
		System.out.println("static method");
	}
	public void view2() {
		System.out.println("non-static method");
	}
	
	public static void main(String[] args) {
		//클래스 메서드(static method) : 객체 없이 호출 가능 ex)Math.random()
		view1(); // 자기 자신이 가진 메서드에 접근 할때는 클래스 이름 생략가능.
		MethodEx8.view1();//자기 자신이 가진 메서드에 접글 할때는 클래스 이름 생략가능.
				
		//인스턴트 메서드(반드시 객체를 만들어서 함수 호출.)
		Random rd  = new Random();
		rd.nextInt();
		MethodEx8 ob = new MethodEx8();
		ob.view2();
		

	}

}
