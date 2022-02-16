package step_03_제어문;

import java.util.Random;

//난수 함수 : 컴퓨터가 임의의 숫자를 발생, 의사난수(pseudo random)
public class RandomEx {

	public static void main(String[] args) {
		// Math 함수
		System.out.println(Math.random());//0~1미만의 실수 난수 생성
		System.out.println((int)(Math.random()*10+1));//1~11미만
		System.out.println((int)(Math.random()*31+50)); //50~81 미만의 정수 난수
		System.out.println((int)(Math.random()*30+51)); //51~81 미만의 정수 난수

		// Random 클래스
		Random rd = new Random();
		int a = rd.nextInt(100) + 1; // 1~100 미만 정수
		int b = rd.nextInt(101) + 0; // 0~100 미만 정수
		int c = rd.nextInt(30) + 50; // 50~80 미만 정수
		System.out.println(a + " " + b + " " + c);
	}

}
