package whileex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoWhileEx {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;
		
		//�Է� �ݺ��� ��� �Է��� �ϱ��� �ݺ��� �ϸ� ������ ���� �Ƿ� �Է� �� ���߿� ���ǹ��� Ȯ�� �ϴ� do~while�� ��� 
		
		 do{
			System.out.println("������ �Է� �ϼ���.");
			num = Integer.parseInt(br.readLine());
		}while (num < 0 || num > 100);
		 
		 System.out.println("�Է��Ͻ� ������ : " + num + "�Դϴ�.");
	}

}
