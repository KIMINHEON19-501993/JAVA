package constructor;

import java.util.Scanner;

/*
 * Ŭ������ :  ConstructorEx4
 * x:int
 * y:int
 * +ConstructorEx4()--- �Է¹ޱ�(��ĳ��)
 * +cal():int
 * +display():void 
 */

class ConstructorEx4 {
	int x;
	int y;
	
	public ConstructorEx4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���θ� �Է� : "); x = sc.nextInt();
		System.out.print("���θ� �Է� : ");y = sc.nextInt();
		sc.close();
		
	}
	
	public int cal() {
		return x * y;
	}
	
	public void display() {
		System.out.println("�簢���� ���� : " + cal());
	}
	
	public static void main(String[] args) {
		new ConstructorEx4().display();
	}

}
