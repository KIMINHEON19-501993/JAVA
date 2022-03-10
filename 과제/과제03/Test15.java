package 과제03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Test15 {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		[문제15] 2자리의 난수를 발생하여 발생된 숫자를 맞추는 게임 프로그램 난수발생) 

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Random rd = new Random(); 
		int a = rd.nextInt(99) + 0;
		int b;
		int count = 1;
		char why;
		System.out.println("0 ~ 99 사이의 난수가 발생 하였습니다. 맞추어 보세요.");
		
		while(true) 
		{
			
			System.out.print("숫자 입력 : ");
			b = Integer.parseInt(br.readLine());
			
			if(a == b) 
			{
				System.out.println("추카추카 " + count + "번 만에 맞추셨습니다.");
				System.out.print("다시 할까요?(y/n)");
				why = br.readLine().charAt(0);
				if(why == 'Y' || why == 'y') 
				{
					count = 0;
					a = rd.nextInt(99) + 0;
					continue;
				}
				else
				{
					System.out.println("수고하셨습니다.");
					break;
				}
			}
			else if(a < b)
			{
				System.out.println("컴퓨터(난수)의 숫자가 입력한 수보다 더 작습니다.");
				count++;
			}
			else if(a > b)
			{
				System.out.println("컴퓨터(난수)의 숫자가 입력한 수보다  더 큽니다.");
				count++;
			}		
		}
   }
}
