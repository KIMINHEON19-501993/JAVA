package inheritance;

public class SubTest extends SuperTest{
	private int age;
	private double score;

	public SubTest() {
		super();
		// TODO �ڵ� ������ ������ ����
	}

	public SubTest(String name, String addr, int age, double score) {
		super(name, addr);
		this.age = age;
		this.score = score;
		
	}
	@Override
	public String toString() {
		
		return super.toString() +"���̴� " + age + "�� �̰� ������ " + score +"�� �Դϴ�.";
	}

	public static void main(String[] args) {
		SuperTest ob1 = new SuperTest("�Ƿη�","���ﵿ");
		System.out.println(ob1);
		
		SubTest ob2 = new SubTest("ũ��", "������", 23, 85.4);
		System.out.println(ob2);
	}

}
