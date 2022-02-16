package override;
//오버라이드 : 함수 재정의

class Test1{
	public void view1() {System.out.println("view1 method");}
	public void view3() {System.out.println("view3 method");}
}
class Test2 extends Test1 {

	@Override
	public void view1() {/*super.view1();*/ System.out.println("view11 method");}
	public void view2() {System.out.println("view22 method");}
	
}

public class OverrideEx1 {

	public static void main(String[] args) {
		
		Test1 ob = new Test2();//부모 클래스의 참조변수로 자식객체 생성
		ob.view1();//v11
		ob.view3();//v3
//		ob.vise2() 부모 클래스에 존재하지 않는 매소드 이기 때문에 오류 발생
//		Test2 ob = new Test2(); // 클래스 변수명 = new 생성자();
//		ob.view1();//v11
//		ob.view2();//v22
//		ob.view3();//v3
	}

}
