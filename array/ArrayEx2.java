package array;

public class ArrayEx2 {
//�迭 : ������ �ڷ����� ���ӵ� ������
	public static void main(String[] args) {
//		1���� �迭
		int[] num = new int[5];
		num[0] = 0;
		num[1] = 1;
		num[2] = 2;
		num[3] = 3;
		num[4] = 4;
		
//		for(int i = 0;  i < num.length; i++) {
//			System.out.printf("num[%d] = %d\n",i,num[i]);
//		}
		
		for(int n : num) {
			System.out.printf("num[%d] = %d\n",n,num[n]);
		}
		System.out.println();
		for(int i = num.length-1;  i >= 0; i--) {
			System.out.printf("num[%d] = %d\n",i,num[i]);
		}
		
	}

}
