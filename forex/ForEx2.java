package forex;

public class ForEx2 {

	public static void main(String[] args) {
//		int[] num = { 10, 20, 30, 40, 50 };
//		
//		for (int i = 0; i < num.length; i++) {
//			System.out.print(num[i] + " ");
//		}
//		System.out.println();
//		for (int n : num) {// ���� for��
//			System.out.print(n + " ");
//		}
//		System.out.println();
//		String[] color = { "red", "green", "blue" };
//		for (int n = color.length - 1; n >= 0; n--) {
//			System.out.print(color[n] + " ");
//		}
//		System.out.println();
//		for (String n : color) {// ���� for��
//			System.out.print(n + " ");
//		}
		
		//continue,break;
		
		for (int a= 0; a < 10; a++) { 
			if(a==5) {
				//break; break�� ���� ������ ���� �ϴ� ���� �� ���߰� ����
				//1 2 3 4
				continue; //continue �� ���� ������ ���� �ϴ� ������ ���߰� �ٽ� ���ǹ����� ���ư���.
				//1 2 3 4 6 7 8 9
			}
			System.out.println(a);
		}
			
			
			
			
			
			
	}

}
