package 과제10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * [문제 50] 예외상황이 발생하면 해당 예외처리를 하시오

(1)클래스명 : ThrowEx
   +dan:int   
   +inputData():void    ==> 단 입력받기
   +guguPrint():void    ==> 구구단 구하기

(2)Test50에서 ThrowEx를 상속 받아 객체생성하시오
(3)처리조건   
   ① inputData()에 단을 입력받으시오
   ② inputData()에서 guguPrint()호출하시오
   ③ BufferedReader을 통해 데이터를 입력받고, 
      입력받을때 문자가 입력되면 예외상황발생하시오,
      또, finally에서 무조건 입력버퍼 close()하시오
      ex) br.close() 
 */

class ThroEx {
	public int dan;

	public void inputData() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("단 입력 : ");
		try {
			dan = Integer.parseInt(br.readLine());
			guguPrint();
		} catch (NumberFormatException e) {
			System.out.println("정수를 입력 해주세요.");
			
		} catch (IOException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
			}
		}

	}

	public void guguPrint() {

		for (int i = 1; i < 10; i++) {

			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
	}
}

class Test50 extends ThroEx {

	public static void main(String[] args) {
		ThroEx dan = new ThroEx();

		dan.inputData();

	}
}
