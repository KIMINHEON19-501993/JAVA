package finalex;

import java.lang.String;
import java.lang.System;

class Test {
	final String name = "�Ƿη�";
	public Test() {
		super();
		
	}
	
	public void view() {
		System.out.println("�̸� : " + this.name.toString());
		//this.����.toString ���� ������ ���� Ŭ���� �ȿ� �ִ� ��� this �� toString�� ���� ����	
	}
}

public class ObjectEx {

	public static void main(String[] args) {
			new Test().view();
			Test ob = new Test();
			ob.view();
	}

}
