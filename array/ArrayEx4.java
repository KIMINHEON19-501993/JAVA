package array;
//arsg�� �̿��Ͽ� ������ �Է� �� �ִ� �ּڰ� ���
public class ArrayEx4 {
//�迭 : ������ �ڷ����� ���ӵ� ������
	public static void main(String[] args) {
		int[] num = new int[3];	
		num[0] = Integer.parseInt(args[0]);
		num[1] = Integer.parseInt(args[1]);
		num[2] = Integer.parseInt(args[2]);
		int max = num[0];
		int min = num[0];
		
		
		for(int i = 0; i < num.length; i++) {
			
			if(max <= num[i]) {
				max = num[i];
			}
			if(min >= num[i]) {
				min = num[i];
			}
		}
		
		System.out.println("max = " + max);
		System.out.println("min = " + min);
	}

}
