package object;

/* ���� ������
 * +(public), -(private), #(protected), (default)
 * Ŭ������ : Person
 * +name : String
 * +age : int
 * +score : float
 * 
 * +setPerson(name:String, a:int, s:flaat) : void
 * +viewPerson() : void
 */
class Person {
	// ���� ����,������� : Ŭ���� ������ ���� �ϴ� ����(Ŭ������ ������ �ִ� ����) --> �ʵ�(��ü���� ����� ǥ��)
	public String name;
	public int age;
	public float score;
	
	public void setPerson(String name, int age, float score) {//����Լ� --> �޼���
		// this. �ڱ� �ڽ��� ��ü
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public void viewPerson() {
		System.out.println("�̸� : " + name + "\n���� : " + age + "\n���� : " + score);
	}
}

public class ObjectEx1 {

	public static void main(String[] args) {
		Person ps = new Person(); // ��ü ����, ���� ����
		// ��ü(������Ʈ), ������Ʈ, �ν���Ʈ, Ŭ���� --> ������ �Լ��� ����
		// Ŭ������ ������Ʈ�� �ν��Ͻ� --> ��ü
		ps.setPerson("�Ƿη�", 23, 100.0f);
		ps.viewPerson();
		System.out.println("�Ƿη� �ؽ� �ڵ� : " + ps.hashCode());
		// �ؽ��ڵ�(hashCode) : ��ü�� �����ϱ� ���� ������ �������� ��� ���ִ� �޼ҵ�

		//���ο� ��ü�� ����� �ؽ��ڵ尡 �޶�����.
		ps = new Person();
		ps.setPerson("ũ��", 20, 10.0f);
		ps.viewPerson();
		System.out.println("ũ�� �ؽ� �ڵ� : " + ps.hashCode());
		System.out.println(ps);
		
		
	}

}
