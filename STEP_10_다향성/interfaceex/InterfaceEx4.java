package interfaceex;
/*클래스와 인터페이스를 이용한 성적 처리
 * 클래스 명 : User
 * -name :  String
 * +User()
 * +User(name) : String
 * +toString(): String
 * 
 * 인터페이스 명 : Score
 * +sol : int (초기값 : 20),<--- 배점
 * +getScore() : int <----- 맞은수 * sol리턴
 * 
 * 인터페이스 명 : Print
 * toPrint() : String
 * 
 * 
 * -----InterfaceEx4 에서 User,Score,Print 상속 받아서 처리
 * 이름 : 홍길동
 * 점수 : 60점
 * 
 */
class User {
	private String name;

	public User() {

	}

	public User(String name) {
		this.name = name;
	}

	public String toString() {
		
		return "이름 : " + name;
	}

}

interface Score {
	final public int sql = 20;
	public int getScore();
}

interface Print {

	public String toPrint();
}

public class InterfaceEx4 extends User implements Print, Score {
	int n;
	
	public InterfaceEx4() {
		// TODO 자동 생성된 생성자 스텁
	}
	
	public InterfaceEx4(String name, int n) {
		super(name);
		this.n = n;
	}
	@Override
	public int getScore() {
		return sql * n;
	}

	@Override
	public String toPrint() {
		
		return toString()  + "\n점수 : " + getScore() + "점";
	}

	public static void main(String[] args) {
		InterfaceEx4 ob = new InterfaceEx4("홍길동", 3);
		System.out.println(ob.toPrint());
	}

	

}
//class User {
//	private String name;
//
//	public User() {
//
//	}
//
//	public User(String name) {
//		this.name = name;
//	}
//
//	public String toString() {
//		
//		return "이름 : " + name;
//	}
//
//}
//
//interface Score {
//	final public int sql = 20;
//	public int getScore();
//}
//
//interface Print {
//
//	public String toPrint();
//}
//
//public class InterfaceEx4 extends User implements Print, Score {
//	int i;
//	public InterfaceEx4() {
//		
//	}	
//	public InterfaceEx4(String name, int i) {
//		super(name);
//		this.i = i;//getScore가 i를 사용할수 있도록 전역변수에 대입
//		
//	}
//
//	public static void main(String[] args) {
//		InterfaceEx4 ob = new InterfaceEx4("홍길동", 3);
//		System.out.println(ob.toPrint());
//	}
//
//	@Override
//	public int getScore() {
//		return sql * i;
//	}
//
//	@Override
//	public String toPrint() {
//		
//		return toString()  + "\n점수 : " + getScore();
//	}
//
//}
