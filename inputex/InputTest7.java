package inputex;


//eno: 101 ename:�Ƿη� dept:A score 85.9 �� �Է¿� ���
//eno,ename,dept --> printin
//score --> printf �� �Ҽ��� 2° �ڸ����� ǥ��
public class InputTest7 {

	public static void main(String[] args) {
		
		
		
		int eno = Integer.parseInt(args[0]);
		String ename = args[1];
		char dept = args[2].charAt(0);
		double score = Double.parseDouble(args[3]);
		
	
		System.out.printf("�����ȣ : %d\n����̸� : %s\n�μ��ڵ� : %s\n�Ի缺�� : %.2f" ,eno,ename,dept,score);
		
	}


}
