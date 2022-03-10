package forex;

public class ForEx4 {
//1~100 사이의 수중 7의 배수를 출력
	public static void main(String[] args) {
//		int j = 0;
//		int[] arr = new int[100];

//		System.out.print("7의 배수는 : ");
//		for (int i = 1; i <= 100; i++) {
//			if (i % 7 == 0) {
//				System.out.print(i + " ");
//				arr[j] = i;
//				j++;
//				continue;
//
//			}
//		}
//		System.out.print("\n7의 배수는 : ");
//		for (j = 0; j < arr.length; j++) {
//			if(arr[j] == 0) {
//				break;
//			}
//			System.out.print(arr[j] + " ");
//		}
		System.out.print("7의 배수는 : ");
		for (int i = 1; i <= 100; i++) {
			if (i % 7 != 0) {
				continue;
			}
			System.out.print(i + " ");
		}

	}

}
