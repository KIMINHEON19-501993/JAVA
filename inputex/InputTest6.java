package inputex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//argument�� �̿��Ͽ� �Է��� �޾� ���
//eno: 101 ename:�Ƿη� dept:A score 85.9 �� ���
// printf �ѹ��� ����Ͽ� ǥ��
public class InputTest6 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int eno;
		String ename;
		char dept;
		double score;
		
		System.out.print("�����ȣ�� �Է� �Ͻÿ� : ");
		eno = Integer.parseInt(br.readLine());
		
		System.out.print("����̸��� �Է� �Ͻÿ� : ");
		ename = br.readLine();
		
		System.out.print("�μ��ڵ带 �Է� �Ͻÿ� : ");
		dept = br.readLine().charAt(0);
		
		System.out.print("�Ի缺���� �Է� �Ͻÿ� : ");
		score = Double.parseDouble(br.readLine());
		
		
		System.out.println("�����ȣ : " + eno);
		System.out.println("����̸� : " + ename);
		System.out.println("�μ��ڵ� : " + dept);
		System.out.printf("�Ի缺�� : %.2f" , score);
		
	}


}
