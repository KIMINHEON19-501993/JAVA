package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//ũ�Ⱑ 5���� ������ �迭�� �����ϰ� �迭�� �����͸� �Է� �޾Ƽ� ���, �ִ� �ּڰ� ���
public class ArrayEx5 {
//�迭 : ������ �ڷ����� ���ӵ� ������
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("[" + i + "]�� �濡 �����ڸ� �Է� �Ͻÿ�.");
			arr[i] = Integer.parseInt(br.readLine()); 
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");			 
		}
		
		for(int i = 0; i < arr.length; i++) {
			
			if(max <= arr[i]) {
				max = arr[i];
			}
			if(min >= arr[i]) {
				min = arr[i];
			}
		}
		System.out.println();
		System.out.println("�ִ� = " + max);
		System.out.println("�ּڰ� = " + min);
		
	}

}
