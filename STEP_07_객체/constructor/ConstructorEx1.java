package constructor;

//constructor 생성자 :  객체 초기화 담당, 메모리 할당
//문법 ㅣ 접근지정자 클래스명(){}
public class ConstructorEx1 {

	public ConstructorEx1() { // 디폴트 생성자,리턴 타입 지정 X
		System.out.println("default constructor");
	}

	public ConstructorEx1(String str) { // 디폴트 생성자,리턴 타입 지정 X
		System.out.println(str + " constructor");
	}

	public ConstructorEx1(String str, int n) { // 디폴트 생성자,리턴 타입 지정 X
		System.out.println(str + " " + n + " constructor");
	}

	public static void main(String[] args) {
		new ConstructorEx1(); // 객체 생성,생성자 호출
		new ConstructorEx1("뽀로로");
		new ConstructorEx1("뽀로로", 5);
	}

}
