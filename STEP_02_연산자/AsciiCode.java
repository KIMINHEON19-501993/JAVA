package STEP_02_������;

/*ascii �ڵ�
 * A 65
 * a 97
*/
public class AsciiCode {

	public static void main(String[] args) {

		System.out.println("-------------------------\n");

		System.out.println('A' + " : " + (int) 'A');
		System.out.println('a' + " : " + (int) 'a');
		System.out.println('��' + " : " + (int) '��');

		System.out.println("\n-------------------------\n");

		System.out.println(65 + " : " + (char) 65);
		System.out.println(97 + " : " + (char) 97);
		System.out.println(12593 + " : " + (char) 12593);

		System.out.println("\n-------------------------\n");

		// ������ �켱 ����
		System.out.println("A + 1 : " + ('A' + 1)); // char + int = int
		System.out.println("(char)A + 1 : " + ((char)'A' + 1)); // char(char) + int = int
		System.out.println("A - 1 : " + ('A' - 1)); // char - int = int
		System.out.println("(char)'A' - 1 : " + ((char) 'A' - 1)); // char(char) - int = int

		System.out.println("\n-------------------------\n");

		// char ��ü�� ���� ���¶�� ���� �ִ�.
		System.out.println('A' + 'B'); // char + char = int
		System.out.println("A" + "B"); // String + String = String
	}

}
