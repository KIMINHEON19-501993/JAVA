package STEP_01_����;
//System.out.printf("�޼��� or ���Ĺ���", ����) ���Ĺ��ڿ� ������ ������ ���ƾ��Ѵ� 

/*
 * %d ���� int, char, long
 * %c ���� char
 * %f �Ǽ� float, double
 * %s ���ڿ� String
*/

public class Datatype2 {


	
	public static void main(String[] args) {
		String name = "�̼���";
		String dept = "���ߺ�";
		char gender = 'M';
		double score = 85.3;
		int age = 25;
		float tall = 183.4f;
		
		
		System.out.printf("�̸� : %s\n", name);
		System.out.printf("�μ� : %s\n" , dept);
		System.out.printf("���� : %c\n" , gender);
		System.out.printf("���� : %.1f\n" , score);
		System.out.printf(String.format("���� : %.1f\n" , score));
		System.out.printf("���� : %d\n" , age);
		System.out.printf("���� : %.1f\n" , tall);
	}

}
