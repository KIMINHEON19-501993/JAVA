package finalex;


//��� :  �̸��� ������ ������, �Ű������� �ְ� ������ ���
class Final {
	final int n = 100; //������ ���ȭ , final ���� n
	final public void view(final int a) {
		//n=200; final ������ ���� ���� �Ұ���
		//a= 200; ���� ���� a�� final �����̱� ������ ���� �Ұ�
		System.out.println(a);
	}
}

class FonalEx extends Final{
	
//	@Override
//	public void view(final int a) { //final �޼���� �������̵� �Ұ�
//		
//}
}

public class FinalEx1 {

	public static void main(String[] args) {
		Final ob = new Final();
		ob.view(200);
	}
}
