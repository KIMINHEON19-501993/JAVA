package methodex;


//call by  reference : ������ ���� ȣ��, �Լ��� �Ű������� �����ּҷ� ����
public class MethodEx7 {

	public static void view1(int[] num) {
		System.out.print("\nview1 ������ : ");
		for (int n : num) {
			System.out.print(n + " ");
		}
		System.out.print("\nview1 ������ : ");
		num[0] = 100;
		for (int n : num) {
			System.out.print(n + " ");
		}
	}
	
	public static void view2(String str) {
		System.out.println("vise2 ������ : " + str);
		str = "hello";
		System.out.println("vise2 ������ : " + str);
	}

	public static void main(String[] args) {
		int[] num = { 10, 20, 30, 40, 50 };
		System.out.print("view1 ȣ���� : ");
		for (int n : num) {
			System.out.print(n + " ");
		}
		
		view1(num);
		
		System.out.print("\nview1 ȣ���� : ");
		for (int n : num) {
			System.out.print(n + " ");
		}
		
		
		System.out.println();
		String str = "happy";
		System.out.println("view2 ȣ���� : " + str);
		view2(str);
		System.out.println("view2 ȣ���� : " + str);
		
	}

	

}
