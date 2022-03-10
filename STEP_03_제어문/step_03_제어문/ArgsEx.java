package step_03_제어문;
//실행 -> 실행 구성 -> ArgsEx -> 인수 -> 프로그램 인수


public class ArgsEx {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		System.out.println("세 수의 합은 : " + (a + b + c));
	}

}
