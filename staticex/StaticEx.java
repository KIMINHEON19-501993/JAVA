package staticex;
//인스턴스 메서드 관련되는 작업을 하는 메스트를 인스턴스 메서드(static이 붙지 않은 메서드)
//static변수(클래스 변수)와 관련되는 작업을 하는 메서드를 static메스드(클래스메서드)

class Test{
	int x;
	int y;
	static int z;
	
	static {
		z=100;
		System.out.println("static 초기화 영역");
	}
	public Test() {
		// TODO 자동 생성된 생성자 스텁
	}
	public Test(int x, int y, int z1) {
		this.x = x;
		this.y = y;
		//static 변수는 this. 사용X
		//클래스.변수 로 접근 가능 또는 스태틱 변수 = 변수(스태틱변수X) 형태
		//Test.z = z;
		z = z1;
	}
	public void view() {
		System.out.println(x + "\t" + y + "\t" + z);
	}
}
public class StaticEx {

	public static void main(String[] args) {
//		new Test().view();
		
//		Test ob1 = new Test(1,2,3);
//		ob1.view();
//		Test ob2 = new Test(4,5,6);
//		ob2.view();
		
		Test ob1 = new Test(1,2,3);
		Test ob2 = new Test(4,5,6);//static 변수에 6이 전역 변수로 대입 됨으로써 ob1과 ob2 둘다 z값이 6이 된다.
		ob1.view();
		ob2.view();
		
	}

}
