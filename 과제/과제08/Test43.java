package 과제08;

/*
문제 43] 오버라이드(override)를 이용하여 다음 프로그램을 작성하시오
(1)클래스명: Circle
   #r:int        
   #size :double        ==> 계산된 결괏값을 저장하는 변수
   #PI:double            ==> 초기값 3.141592, final
   +Circle(r:int)         ==> 반지름 대입
   +compute():void       
   +output():void 

(2)클래스명 :  CircleArea     ==> Circle클래스를 상속하시오
   +CircleArea(r:int)
   +compute():void            ==> 원의 넓이=반지름 *반지름*3.141592
   +output():void               ==> 출력      
       
(3)클래스명 :  CircleRound    ==> Circle클래스를 상속하시오
   +CircleRound(r:int)
   +compute():void              ==>원의둘레=반지름 * 2 * 3.141592
   +output():void                 ==>출력

(4)Test43클래스 main()에서
   CircleArea   ob1 = new CircleArea(10);
   CircleRound  ob2 = new CircleRound(10);
   ob1.compute();
   ob1.output();
   ob2.compute();
   ob2.output();
*/
class Circle {
	protected int r;
	protected double size;
	final protected double PI = 3.141592;

	public Circle(int r) {
		this.r = r;
	}

	public  void compute() {
		
	}

	public  void output() {
		
	}

}

class CircleArea extends Circle {

	public CircleArea(int r) {
		super(r);
	}

	@Override
	public void compute() {
		size = r * r * PI;
	}

	@Override
	public void output() {
		System.out.println("원의넓이 : " + size);
	}

}

class CircleRound extends Circle {

	public CircleRound(int r) {
		super(r);
	}

	@Override
	public void compute() {
		size = r * 2 * PI;
	}

	@Override
	public void output() {
		System.out.println("원의둘레 : " + size);
	}

}

class Test43 {

	public static void main(String[] args) {
		CircleArea ob1 = new CircleArea(10);
		CircleRound ob2 = new CircleRound(10);
		ob1.compute();
		ob1.output();
		ob2.compute();
		ob2.output();

	}
}
