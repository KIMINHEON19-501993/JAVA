package object;
/*
 * �̸��� �Ƿη� �̰� ���ߺο� �ٹ��ϸ� �޿��� 1500000��, �Ի缺���� 85.75�� �Դϴ�. 
 * 
 * setEmployee()�� �̿��Ͽ� ���� �����ϰ� ��� �ϼ���.
 * ����̸� : ���޷�
 * �ٹ��μ� : �ѹ���
 * �޴±޿� : 1500000��
 * �Ի缺�� : 85.75��
 */

public class ObjectEx4 {

	public static void main(String[] args) {
		Employee em = new Employee(); // ���� ����
//		em.setName("�Ƿη�"); // �ʱ�ȭ, ���� ����
//		em.setDept("���ߺ�");
//		em.setPay(1500000);
//		em.setScore(85.75);
//		
//		System.out.println(em.toString());

		em = new Employee();
		System.out.println(em.toString()); //em�� �ʱ�ȭ�� ������ ��� ��
		em.setEmployee("���޷�", "�ѹ���", 1500000, 85.75); // �ʱ�ȭ, ���� ����

		System.out.println("����̸� : " + em.getName());
		System.out.println("�ٹ��μ� : " + em.getDept());
		System.out.println("�޴±޿� : " + em.getPay() + "��");
		System.out.println("�Ի缺�� : " + em.getScore() + "��");
	}

}
