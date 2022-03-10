package exception;
//unchecked exception : 명시적 예외 처리가 필요 없음.
public class ExceptionEx2 {
	
	public static void main(String[] args) {
		int[] num = {10,20,30};
		
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(num[i] + " ");
			}	
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 개수가 일치 하지 않음");
		}
	}
	
}
