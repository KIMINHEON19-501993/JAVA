package inheritance;

class NumberEx1{
	/* private */ int a, b;
	public NumberEx1(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public void view1() {
		System.out.println(a+"  "+b);
	}
}
class NumberEx2 extends NumberEx1{
	int c;
	public NumberEx2(int a, int b, int c) {
		super(a, b);
		this.c=c;
	}
	public void view2() {
		/* System.out.println(a+" "+b+"\n"+c); */ // 부모클래스의 변수가 private이면 에러 
		super.view1();
		System.out.println(c);
	}
	
}

public class InheritanceEx4 {

	public static void main(String[] args) {
		new NumberEx1(100, 200).view1();

		System.out.println();
		new NumberEx2(10, 20, 30).view2();
		//10 20
		//30
		
	}

}

