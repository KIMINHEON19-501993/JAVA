package inheritance;
// ������, ����2�� ������, toString()
public class SuperTest {
	private String name;
	private String addr;
	public SuperTest() {
		// TODO Auto-generated constructor stub
	}
	public SuperTest(String name, String addr) {
		super();
		this.name = name;
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "�̸��� "+name+"�̰� ��� ���� "+addr+"�Դϴ�.\n";
	}

}















































