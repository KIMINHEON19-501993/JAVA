package finalex;

import java.lang.String;
import java.lang.System;

class Test {
	final String name = "뽀로로";
	public Test() {
		super();
		
	}
	
	public void view() {
		System.out.println("이름 : " + this.name.toString());
		//this.변수.toString 에서 변수가 같은 클래스 안에 있는 경우 this 와 toString는 생략 가능	
	}
}

public class ObjectEx {

	public static void main(String[] args) {
			new Test().view();
			Test ob = new Test();
			ob.view();
	}

}
