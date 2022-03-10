package exception;

//사용자 정의 익셉션

class MyException extends Exception{
	public MyException() {
		System.out.println("미성년자 출입금지\n집으로 가셔~\n");
	}
	
}
public class ExceptionEx4 {

	public static void main (String[] args) /*throws MyException*/{
		int age = Integer.parseInt(args[0]);
		
		if (age < 19) {
			try {
				throw new MyException();
				
			} catch (Exception e) {
				
			}
		}else {
			System.out.println("어서오세요 고객님~");
		}
	}

}
