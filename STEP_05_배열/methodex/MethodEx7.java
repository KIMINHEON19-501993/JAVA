	package methodex;
	
	
	//call by  reference : 참조에 의한 호출, 함수의 매개변수를 참조주소로 전달
	public class MethodEx7 {
	
		public static void view1(int[] num) {
			System.out.print("\nview1 수정전 : ");
			for (int n : num) {
				System.out.print(n + " ");
			}
			System.out.print("\nview1 수정후 : ");
			num[0] = 100;
			for (int n : num) {
				System.out.print(n + " ");
			}
		}
		
		public static void view2(String str) {
			System.out.println("vise2 수정전 : " + str);
			str = "hello";
			System.out.println("vise2 수정후 : " + str);
		}
	
		public static void main(String[] args) {
			int[] num = { 10, 20, 30, 40, 50 };
			System.out.print("view1 호출전 : ");
			for (int n : num) {
				System.out.print(n + " ");
			}
			
			view1(num);
			
			System.out.print("\nview1 호출후 : ");
			for (int n : num) {
				System.out.print(n + " ");
			}
			
			
			System.out.println();
			String str = "happy";
			System.out.println("view2 호출전 : " + str);
			view2(str);
			System.out.println("view2 호출후 : " + str);
			
		}
	
		
	
	}
