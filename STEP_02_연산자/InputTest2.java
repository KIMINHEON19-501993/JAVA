package STEP_02_������;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//A���� �Է��ϼ��� : 15
//B���� �Է��ϼ��� : 7
// 15 + 7 = 22

public class InputTest2 {

	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int A;
		int B;

		System.out.print("A���� �Է� �ϼ��� : ");
		A = Integer.parseInt(br.readLine());

		System.out.print("B���� �Է� �ϼ��� : ");
		B = Integer.parseInt(br.readLine());
		
		System.out.println(A + " + " + B + " = " + (A+B));
	}

}