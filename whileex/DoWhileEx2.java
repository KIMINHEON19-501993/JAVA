package whileex;

//do-while �� �̿��Ͽ� �ݺ� ó��
//�ٽ� ���� �ұ��?(Y/N)
//�ٽ� ���� �ұ��?(Y/N)Y
//�ٽ� ���� �ұ��?(Y/N)N
//*****�����ϼ̽��ϴ�.*****

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoWhileEx2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char why;
			
		do {
			System.out.print("�ٽ� ���� �ұ��?(Y/N) : ");
			why = br.readLine().charAt(0);
		} while (why == 'Y' || why == 'y');
		
		System.out.println("*****�����ϼ̽��ϴ�.*****");
	}

}
