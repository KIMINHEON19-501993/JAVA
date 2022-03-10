
public class Test02 {

	public static void main(String[] args) {
//		[ 문제 2 ] 다음과 같은 조건을 만족하는 프로그램을 작성 하시오 
//		1. 조건 
//		다음의 for문을 while문으로 변경 하시오 
//		public class Test02 { 
//			public static void main(String[] args) { 
//				for(int i=0; i<=10; i++) { 
//					for(int j=0; j<=i; j++) { 
//						System.out.print("*"); 
//						} 
//					System.out.println(); 
//				}  
//			} 
//		} 
		int i = 0;
		
		while(i<=10) {
			int j = 0;
			while(j <= i) {
				j++;
				System.out.print("*");
				}
			System.out.println(); 
			i++;
			
		}


	}

}
