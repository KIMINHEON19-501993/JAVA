package 과제10;

/*
﻿[문제 49] 다음프로그램을 완성하시오
(1)클래스명 : Profile
    +name:String
    +phone:String

    +Profile()
    +Profile(name:String,phone:String)
    +printView():void         //이름,연락처출력

(2)인터페이스명 : Score
   +num:int (초기값: 10)
   +scoreResult(sol:int):void //점수를 계산해서 출력(sol*num)

(3)인터페이스명:Display
   메서드 : +display():void        
  
(4)Test49클래스 main()에서  Profile, Score, Display를 상속받아 처리하시오
      -score:int;             // 점수
              :
		
      public static void main(String[] args){   // main()안에 더이상 코드는 추가하지 마시오
            Test46  ob = new Test46("홍길동","123-4567", 5);
            ob.display();
      }
*/
class Profile {
	public String name;
	public String phone;

	public Profile() {
		// TODO 자동 생성된 생성자 스텁
	}

	public Profile(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	public void printView() {
		System.out.println("이름: " + name + "\n연락처: " + phone);
	}
}

interface Score {
	public int num = 10;

	public void scoreResult(int sol);
}

interface Display {
	public void display();
}

class Test49 extends Profile implements Display, Score {
	int score;

	public Test49(String name, String phone, int sol) {
		super(name, phone);
		this.score = sol;
	}

	public static void main(String[] args) {
		Test49 ob = new Test49("홍길동", "123-4567", 5);
		ob.display();
	}

	@Override
	public void scoreResult(int sol) {
		
		System.out.println("점수 : " + sol * num);
	}

	@Override
	public void display() {
		printView();
		scoreResult(score);
	}
}
