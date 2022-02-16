package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//크기가 5개인 정수형 배열을 선언하고 배열에 데이터를 입력 받아서 출력, 최대 최솟값 출력
public class ArrayEx5 {
//배열 : 동일한 자료형의 연속된 기억공간
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("[" + i + "]번 방에 들어갈숫자를 입력 하시오.");
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
		System.out.println("최댓값 = " + max);
		System.out.println("최솟값 = " + min);
		
	}

}
