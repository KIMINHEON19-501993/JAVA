package override;
//�������̵� : �Լ� ������

class Test1{
	public void view1() {System.out.println("view1 method");}
	public void view3() {System.out.println("view3 method");}
}
class Test2 extends Test1 {

	@Override
	public void view1() {/*super.view1();*/ System.out.println("view11 method");}
	public void view2() {System.out.println("view22 method");}
	
}

public class OverrideEx1 {

	public static void main(String[] args) {
		
		Test1 ob = new Test2();//�θ� Ŭ������ ���������� �ڽİ�ü ����
		ob.view1();//v11
		ob.view3();//v3
//		ob.vise2() �θ� Ŭ������ �������� �ʴ� �żҵ� �̱� ������ ���� �߻�
//		Test2 ob = new Test2(); // Ŭ���� ������ = new ������();
//		ob.view1();//v11
//		ob.view2();//v22
//		ob.view3();//v3
	}

}
