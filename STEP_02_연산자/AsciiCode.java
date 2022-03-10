package STEP_02_연산자;

/*ascii 코드
 * A 65
 * a 97
*/
public class AsciiCode {

	public static void main(String[] args) {

		System.out.println("-------------------------\n");

		System.out.println('A' + " : " + (int) 'A');
		System.out.println('a' + " : " + (int) 'a');
		System.out.println('ㄱ' + " : " + (int) 'ㄱ');

		System.out.println("\n-------------------------\n");

		System.out.println(65 + " : " + (char) 65);
		System.out.println(97 + " : " + (char) 97);
		System.out.println(12593 + " : " + (char) 12593);

		System.out.println("\n-------------------------\n");

		// 연산의 우선 순위
		System.out.println("A + 1 : " + ('A' + 1)); // char + int = int
		System.out.println("(char)A + 1 : " + ((char)'A' + 1)); // char(char) + int = int
		System.out.println("A - 1 : " + ('A' - 1)); // char - int = int
		System.out.println("(char)'A' - 1 : " + ((char) 'A' - 1)); // char(char) - int = int

		System.out.println("\n-------------------------\n");

		// char 자체는 정수 형태라고 볼수 있다.
		System.out.println('A' + 'B'); // char + char = int
		System.out.println("A" + "B"); // String + String = String
	}

}
