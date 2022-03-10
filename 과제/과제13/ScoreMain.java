package 과제13;
/*
 * ﻿[문제 57]
(1)클래스명:ScoreTable
  필드명 : -name:String    ==> 이름
              -sol:int            ==> 맞은수
              -s:int              ==> 배점(20), final
              -score:int         ==> 점수=맞은수*배점

  메서드 : +ScoreTable()
              +ScoreTable(name:String,sol:int)  
              +calcScore():void             <---- 계산
              +printView():void             <---- 출력  

(2) 클래스명:ScoreMain   <--- main()이 있는 클래스

(3) main()함수에서 아래와 같은 객체를 객체 배열로 만들고 나머지를 완성하시오.
   ScoreTable  s1 = new ScoreTable("민들래",5);
   ScoreTable  s2 = new ScoreTable("진달래",3);
   ScoreTable  s2 = new ScoreTable("개나리",0);
   ===>  객체 배열로 바꾸시오
 */

class ScoreTable {
	private String name;
	private int sol;
	private final int s = 20;
	private int score;

	public ScoreTable() {
		// TODO 자동 생성된 생성자 스텁
	}

	public ScoreTable(String name, int sol) {
		super();
		this.name = name;
		this.sol = sol;
	}

	public void calcScore() {
		this.score = s * sol;
		System.out.println(score);
	}
	

	public void printView() {
		System.out.print(name + "\t");
	}

}

public class ScoreMain {
	public static void main(String[] args) {
		ScoreTable s1 = new ScoreTable("민들래", 5);
		ScoreTable s2 = new ScoreTable("진달래", 3);
		ScoreTable s3 = new ScoreTable("개나리", 0);
		
		ScoreTable[] s = new ScoreTable[3];
		
		s[0] = s1;
		s[1] = s2;
		s[2] = s3;
		
		System.out.println("이름\t점수");
		System.out.println("--------------------------");
		for (ScoreTable scoreTable : s) {
			scoreTable.printView();
			scoreTable.calcScore();
		}
	}
}
