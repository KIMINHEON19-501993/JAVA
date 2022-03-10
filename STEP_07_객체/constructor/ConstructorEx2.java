package constructor;

//생성자가 여러개 일때 다른 생성자의 호출이 가능
//this() 사용
//객체가 자기자신을 참조할때 사용하는 this는 생성자를 호출하기 위한 this() 형태로 사용, 메서드는 아님
//this() 생성자 호출은 생성자 에서만 가능
//생성자 내부에서 최상단에 위치 해야한다.

//--------------------------------------------------------------4
public class ConstructorEx2 {

	public ConstructorEx2() {
		
		System.out.println("default constructor");//4 출력 후 호출한 곳으로 되돌아감
	}
	public ConstructorEx2(int n) {
		this("가나다", n);//2 this() 생성자 호출 매개변수 2개인곳 이로 이동
		System.out.println(n + " constructor");//6 출력 후 호출한 곳으로 되돌아감
	}
	
	public ConstructorEx2(String str, int n) {
		this();//3. this() 생성자 호출 매개변수 0개인곳 이로 이동
		System.out.println(str + " " + n +" constructor");//5 출력 후 호출한 곳으로 되돌아감
	}

	public static void main(String[] args) {
		
		new ConstructorEx2(10);//1, 7
		//1.시작(매개변수 1개인곳으로 이동), 7.종료
	}
}	


//--------------------------------------------------------------3
//public class ConstructorEx2 {
//
//	public ConstructorEx2() {
//		this("가나다", 10);//2. this()생성자 호출, 매개변수 2개인(String,int)곳으로 이동
//		System.out.println("default constructor");//6 출력 후 호출한 곳으로 되돌아감
//	}
//
//	public ConstructorEx2(String str) {
//		
//		System.out.println(str + " constructor");//4 출력 후 호출한 곳으로 되돌아감
//	}
//
//	public ConstructorEx2(String str, int n) {
//		this(str);//3.this()생성자 호출 매개변수가 1개인(String)곳 이로 이동
//		System.out.println(str + " " + n +" constructor");//5 출력 후 호출한 곳으로 되돌아감
//	}
//
//	public static void main(String[] args) {
//		
//		new ConstructorEx2();//1, 7
//		//1.시작, 7.종료
//	}
//	


//--------------------------------------------------------------2
//	public class ConstructorEx2 {
//
//		public ConstructorEx2() {
//			this("가나다", 10);//2
//			System.out.println("default constructor");//6
//		}
//
//		public ConstructorEx2(String str) {
//			
//			System.out.println(str + " constructor");//4
//		}
//
//		public ConstructorEx2(String str, int n) {
//			this(str);//3
//			System.out.println(str + " " + n +" constructor");//5
//		}
//
//		public static void main(String[] args) {
//			
//			new ConstructorEx2();//1, 7
//		}
//}	


//--------------------------------------------------------------1
//public class ConstructorEx2 {
//	public ConstructorEx2() {
//		System.out.println("default constructor");//4
//	}
//
//	public ConstructorEx2(String str) {
//		this();//3
//		System.out.println(str + " constructor");//5
//	}
//
//	public ConstructorEx2(String str, int n) {
//		this(str);//2
//		System.out.println(str + " " + n +" constructor");//6
//	}
//
//	public static void main(String[] args) {
//		
//		new ConstructorEx2("가나다",10);//1, 7
//	}
//}
