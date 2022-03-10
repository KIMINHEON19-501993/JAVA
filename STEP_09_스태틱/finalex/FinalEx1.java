package finalex;


//상수 :  이름을 가지는 고정값, 매개변수를 주고 받을때 사용
class Final {
	final int n = 100; //변수의 상수화 , final 변수 n
	final public void view(final int a) {
		//n=200; final 변수는 값이 변경 불가능
		//a= 200; 지역 변수 a는 final 변수이기 때문에 변경 불가
		System.out.println(a);
	}
}

class FonalEx extends Final{
	
//	@Override
//	public void view(final int a) { //final 메서드는 오버라이드 불가
//		
//}
}

public class FinalEx1 {

	public static void main(String[] args) {
		Final ob = new Final();
		ob.view(200);
	}
}
