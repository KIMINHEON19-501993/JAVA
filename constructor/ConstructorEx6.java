package constructor;

public class ConstructorEx6 {
	
	public static void main(String[] args) {
//		Student st = new Student("�Ѹ�",100,100,100);
//		System.out.println(st.toString());
		
		Student st1 = new Student();
		st1.setName("ȫ�浿");
		st1.setKor(95);
		st1.setEng(85);
		st1.setMat(73);
		System.out.println(st1.toString());
		
		//���� 4�� �����ڸ� �̿��Ͽ� "�Ƿη�", 90,75,88�� ��������
		//getter�� �̿��Ͽ� ���
		Student st2 = new Student("�Ƿη�", 90,75,88);
		System.out.println("�̸� :" + st2.getName()
							+"\n���� : " + st2.getKor()
							+"\n���� : " + st2.getEng()
							+"\n���� : " + st2.getMat()
							+"\n���� : " + st2.getTotal()
							+"\n��� : " + String.format("%.2f",st2.getAvg())
							+"\n���� : " + st2.getGrade());
	}
}
