package methodex;

public class MethodEx1 {
//함수 : 동작
//함수, function, procedure, method

	public static void view() {
		System.out.println("hello world");
	}
	public static void star() {
		System.out.println("******");
	}
	public static void main(String[] args) {
		view();//함수 호출, 함수 내부에서 다른 함수 호출.
		star();
	}
	
	

}
