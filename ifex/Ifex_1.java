package ifex;

//if : ���� �˻縦 �������� ����� ���� ����
//if�� �� ���ǽ� �������� �Ǵ� ���迬����
public class Ifex_1 {

	public static void main(String[] args) {
		int score = 75;
		char grade;

		if (score >= 90) grade = 'A';
		else if (score >= 80) grade = 'B';
		else if (score >= 70) grade = 'C';
		else if (score >= 60) grade = 'D';
		else grade = 'F';

		System.out.println("������ " + score + "���̰� ������ " + grade + "�Դϴ�");
		
//		if (score >= 90 && score <=100) grade = 'A';
//		else if (score >= 80 && score <90) grade = 'B';
//		else if (score >= 70 && score <80) grade = 'C';
//		else if (score >= 60 && score <70) grade = 'D';
//		else grade = 'F';
//		
//		System.out.println("������ " + score + "���̰� ������ " + grade + "�Դϴ�");
		
//		//if��
//		String str = "hello";
//		
//		if (str == "hello") {
//			System.out.println("Hello");
//			System.out.println("JAVA");
//		}

//		//if-else��
//		int score = 65;
//		if(score >= 60) {
//			System.out.println("�հ�");
//			System.out.println("������ " + score + " �Դϴ�.");
//		}else {
//			System.out.println("���հ�");
//			System.out.println("������ " + score + " �Դϴ�.");
//		}
//		System.out.println((score >= 60) ? "�հ�" : "���հ�");
//		System.out.println("������ " + score + " �Դϴ�.");
	}

}
