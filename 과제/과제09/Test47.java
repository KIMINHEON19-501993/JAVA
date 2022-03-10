package 과제09;

import java.util.Scanner;

/*
﻿[문제47] 인터페이스를 이용하여 다음 프로그램을 완성하시오
(1)인터페이스명 : Speed
   +SPEED:int                        ==> 초기값 :  10
   +speedUp(inc:int):int          ==> 가속메서드
   +speedDown(dec:int):int     ==> 감속메서드
      
(2)인터페이스명 : CurrentSpeed
   +currSpeedCheck():void     ==> 현재속도를 출력하는 메서드
                                                  현재속도가 0 또는 음수값일 경우에는 "정지하셨습니다" 
			       출력하고 프로그램 종료

(3)클래스명 : SportsCar  ==> Speed, CurrentSpeed를 다중상속 
   +velocity:int                ==> 입력받을속도
   +currVelocity:int         ==> 현재속도
   +SportsCar()               ==> currVelocity에 초기값으로 SPEED설정
   +inVelocity():void         ==> 속도를 입력받음
   +outVelocity():void      ==> velocity가 0보다 크면 speedUp()호출
                                            velocity가 0보다 작으면 speedDown()호출

(4) Test47클래스 main()에서 아래 코드외에 다른 코드는 추가하지 마시오
   SportCar ob=new SportCar();
   System.out.println("**출발 속도는 10km/h입니다 **");
    while(true) {
         ob.inVelocity();
	 ob.outVelocity();
	 ob.currSpeedCheck();
    }
*/
interface Speed{
	public int SPEED = 10;
	public int speedUp(int inc);
	public int speedDown(int dec);
}

interface CurrentSpeed{
	public void currSpeedCheck();
}

class SportsCar implements CurrentSpeed ,Speed{
	public int velocity;            
	public int currVelocity; 
	Scanner sc = new Scanner(System.in);
	public SportsCar() {
		this.currVelocity = SPEED;
	}
	public void inVelocity() {
		System.out.println("속도를 입력 하세요.");
		velocity = sc.nextInt();
	}

	public void outVelocity() {
		if(velocity > 0) {
			speedUp(velocity);
			System.out.println("현재 속도는 " + currVelocity + "km 입니다.");
		}else if (velocity < 0){
			speedDown(velocity);
			System.out.println("현재 속도는 " + currVelocity + "km 입니다.");
		}
	}
	@Override
	public int speedUp(int inc) {
		
		return currVelocity += inc;
	}

	@Override
	public int speedDown(int dec) {
		return currVelocity += dec;
	}

	@Override
	public void currSpeedCheck() {
		if(currVelocity <= 0) {
			System.out.println("정지하셨습니다");
			System.exit(0);
		}
	}
	
}

class Test47  {

	public static void main(String[] args) {
		SportsCar ob=new SportsCar();
		   System.out.println("**출발 속도는 10km/h입니다 **");
		    while(true) {
		         ob.inVelocity();
		         ob.outVelocity();
		         ob.currSpeedCheck();
		    }

	}
}
