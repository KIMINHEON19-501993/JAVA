package whileex;

import java.util.Random;

//65~90������ ���� 10���� ���� �Ͻÿ�


public class DoWhileEx3 {

	public static void main(String[] args)  {
		
		int i = 0;
		
		Random rd = new Random();
		while(i < 10) {
			int num = rd.nextInt(25)+65;
			System.out.print(num + " ");
			i++;
		}
	}

}
