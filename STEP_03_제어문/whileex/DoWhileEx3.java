package whileex;

import java.util.Random;

//65~90사이의 난수 10개를 생성 하시오


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
