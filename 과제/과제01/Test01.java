package 과제01;

public class Test01 {

	public static void main(String[] args) {
		// [문제1] a 와 b의 값을 형변환해서 두수의 곱을 구하시오

		  String a = "100"; String b = "200";
		  
		  int a1 = Integer.parseInt(a); int b1 = Integer.parseInt(b);
		  
		  System.out.println(a + " + " + b + " = " + (a1 * b1));
	}

}
