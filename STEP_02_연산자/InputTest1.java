package STEP_02_연산자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest1 {

	public static void main(String[] args) throws IOException{
		
		  InputStreamReader isr = new InputStreamReader(System.in);//입력 스트림 처리
		  BufferedReader br = new BufferedReader(isr);
		  
		  //표준 입력 장치 : 키보드 , 표준 출력 장치 : 모니터 
		  //System.in 콘솔로 입력 --> 키보드 //System.out 콘솔로
		  //출력 --> 모니터
		  
		  String name;
		  char gender;
		  int age;
		  float tall;
		  double weight;
		  
		  System.out.print("이름을 입력 하세요 : "); 
		  name = br.readLine();
		  
		  System.out.print("성별을 입력 하세요(M or W) : "); 
		  gender = br.readLine().charAt(0);
		  
		  System.out.print("나이를 입력 하세요 : "); 
		  age = Integer.parseInt(br.readLine());
		  
		  System.out.print("신장을 입력 하세요 : "); 
		  tall = Float.parseFloat(br.readLine());
		  
		  System.out.print("체중을 입력 하세요 : "); 
		  weight = Double.parseDouble(br.readLine());
		  
		  /* charAt(index) 인덱스로 주어진 위치값에 해당하는 문자를 리턴
		   * 인덱스는 0 부터 시작 가장 큰 수는 문자열 -1(마지막 인덱스를 의미)
		   * . 은 두가지 의미를 가짐
		   * 1. 포함 :특정 개체 내부의 함수를 호출 할때 객체명.함수명  ex) System 의 ~~
		   * 2. 입력 ex) charAt()
		   */
		  
		  System.out.println("이름 : " + name);
		  System.out.println("성별 : " + gender);
		  System.out.println("나이 : " + age);
		  System.out.println("신장 : " + tall);
		  System.out.println("체중 : " + weight);
		  // . 은 두가지 의미를 가짐
		  //1. 포함 ex) System 의 ~~
		  //2. 입력 ex) charAt
		  
		  isr.close();
		 
		
	
	}

}