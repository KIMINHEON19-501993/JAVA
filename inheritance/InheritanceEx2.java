package inheritance;
//������ 

class ParentEx{
	public ParentEx() {
		super();
		System.out.println("parent class");
	}
}

class ChildEx extends ParentEx{
	public ChildEx() {
		super(); 	// ��������, ��� ���۵� 
		System.out.println("child class");
	}
}
public class InheritanceEx2 {

	public static void main(String[] args) {
		new ChildEx();
	}

}
/* this.����
 * this.�޼���()
 * this()
 * this(����, ����, ..)  ---������(�ڱ� �ڽ��� ��ü�� ���� ������ ȣ��)
 * 
 * super.����
 * super.�޼���()
 * super()
 * super(����, ����, ..)  ---������(�θ� Ŭ������ ������ ȣ��)
 */














































