package object;

//setter : ������� �ϳ��� �ϳ��� ���� �����ϴ� �Լ�
//getter : ������� �ϳ��� �ϳ��� ��(�����Ѱ�)�� �����ϴ� �Լ� 

class Member {
	private String name;
	private int age;
	private double tall;
 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getTall() {
		return tall;
	}

	public void setTall(double tall) {
		this.tall = tall;
	}

}

public class ObjectEx3 {

	public static void main(String[] args) {
		Member mb = new Member();
		mb.setName("�Ƿη�");
		System.out.println("�̸� : " + mb.getName());
		mb.setAge(20);
		System.out.println("���� : " +mb.getAge());
		mb.setTall(160.0);
		System.out.println("���� : " + mb.getTall());
		
	}

}
