package staticex;
//�ν��Ͻ� �޼��� ���õǴ� �۾��� �ϴ� �޽�Ʈ�� �ν��Ͻ� �޼���(static�� ���� ���� �޼���)
//static����(Ŭ���� ����)�� ���õǴ� �۾��� �ϴ� �޼��带 static�޽���(Ŭ�����޼���)

class Test{
	int x;
	int y;
	static int z;
	
	static {
		z=100;
		System.out.println("static �ʱ�ȭ ����");
	}
	public Test() {
		// TODO �ڵ� ������ ������ ����
	}
	public Test(int x, int y, int z1) {
		this.x = x;
		this.y = y;
		//static ������ this. ���X
		//Ŭ����.���� �� ���� ���� �Ǵ� ����ƽ ���� = ����(����ƽ����X) ����
		//Test.z = z;
		z = z1;
	}
	public void view() {
		System.out.println(x + "\t" + y + "\t" + z);
	}
}
public class StaticEx {

	public static void main(String[] args) {
//		new Test().view();
		
//		Test ob1 = new Test(1,2,3);
//		ob1.view();
//		Test ob2 = new Test(4,5,6);
//		ob2.view();
		
		Test ob1 = new Test(1,2,3);
		Test ob2 = new Test(4,5,6);//static ������ 6�� ���� ������ ���� �����ν� ob1�� ob2 �Ѵ� z���� 6�� �ȴ�.
		ob1.view();
		ob2.view();
		
	}

}
