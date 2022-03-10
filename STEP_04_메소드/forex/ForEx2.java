package forex;

public class ForEx2 {

	public static void main(String[] args) {
//		int[] num = { 10, 20, 30, 40, 50 };
//		
//		for (int i = 0; i < num.length; i++) {
//			System.out.print(num[i] + " ");
//		}
//		System.out.println();
//		for (int n : num) {// 향상된 for문
//			System.out.print(n + " ");
//		}
//		System.out.println();
//		String[] color = { "red", "green", "blue" };
//		for (int n = color.length - 1; n >= 0; n--) {
//			System.out.print(color[n] + " ");
//		}
//		System.out.println();
//		for (String n : color) {// 향상된 for문
//			System.out.print(n + " ");
//		}
		
		//continue,break;
		
		for (int a= 0; a < 10; a++) { 
			if(a==5) {
				//break; break는 조건 만족시 현재 하던 동작 을 멈추고 종료
				//1 2 3 4
				continue; //continue 는 조건 만족시 현재 하던 동작을 멈추고 다시 조건문으로 돌아간다.
				//1 2 3 4 6 7 8 9
			}
			System.out.println(a);
		}
			
			
			
			
			
			
	}

}
