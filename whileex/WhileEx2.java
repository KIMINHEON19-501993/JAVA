package whileex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//���� �Է� �޾� �������� ���
public class WhileEx2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int dan;
		int i = 1;
		
		System.out.print("���� �Է� �ϼ��� : ");
		dan = Integer.parseInt(br.readLine());
		while(i < 10) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
			i++;
		}
		
	}

}
