package employee;

/*
 * �����ȣ : 101
 * ����̸� : �Ƿη�
 * ������ȣ : 1234
 * �⺻�޿� : 2500000
 * ���ʼ� + ���� : 450000
 * ���ޱݾ� : 2950000��
 * 
 * �����ȣ : 201
 * ����̸� : ũ��
 * ������ȣ : 5378
 * �⺻�޿� : 1500000
 * ���ʼ� + ���� : 225000
 * ���ޱݾ� : 1725000��
 */
public class EmpMain {
	public static void main(String[] args) {
		Emp mp = null;
		
		mp = new Engineer(101,"�Ƿη�","1234");
		mp.setSalary(2500000);
		mp.setBonus(350000);
		System.out.println(mp.toString());
		
		System.out.println();
		
		mp = new Developer(201,"ũ��","5678");
		mp.setSalary(1500000);
		mp.setBonus(75000);
		System.out.println(mp.toString());
		
//		Engineer eng = new Engineer(101,"�Ƿη�","1234");
//		eng.setSalary(2500000);
//		eng.setBonus(350000);
//		System.out.println(eng.toString());
//		
//		System.out.println();
//		
//		Developer dev = new Developer(201,"ũ��","5678");
//		dev.setSalary(1500000);
//		dev.setBonus(75000);
//		System.out.println(dev.toString());
		
		
	}
}
