package exception;
//입력값이 숫자인지 검사하는 방법 --> 실수 변환 시도.
/*
 * 예외처리
 * $ java EexceptionEx1 2 --->
 * $ java EexceptionEx1 0 --->0으로 나눌수 없습니다.
 * $ java EexceptionEx1 A --->숫자로 바꿀수 없습니다.
 * $ java EexceptionEx1   --->입력값이 없습니다.
 */
public class ExceptionEx1 {
	
	public static void main(String[] args) {
//		int var = 5;
//		try {
//			int n = Integer.parseInt(args[0]);
//			System.out.println(var/n);
//		} catch (Exception e) {
//			System.out.println("입력값에 문제가 있습니다.");
//		} finally {
//			System.out.println("익셉션과 관련없이 항상 실행.");
//		}
		
		
//----------------------------------------------------------1
/*
 * 예외처리
 * $ java EexceptionEx1 2 --->
 * $ java EexceptionEx1 0 --->0으로 나눌수 없습니다.
 * $ java EexceptionEx1 A --->숫자로 바꿀수 없습니다.
 * $ java EexceptionEx1   --->입력값이 없습니다.
 */
		int var = 5;
		System.out.println("-----------------------");
		try {
			int n = Integer.parseInt(args[0]);
			System.out.println(var/n);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");
		} catch (NumberFormatException e) {
			System.out.println("숫자로 바꿀수 없습니다.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("입력값이 없습니다.");
		}finally {
			System.out.println("-----------------------");
		}
		
		
		
	}

}
