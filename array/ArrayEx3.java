package array;

public class ArrayEx3 {
//�迭 : ������ �ڷ����� ���ӵ� ������
	public static void main(String[] args) {
		System.out.println("args�� ���� : " + args.length);

		for (int i = 0; i < args.length; i++) {
			System.out.println("args [" + i + "] : " + args[i]);
			System.out.println("args [" + i + "]�� ���� : " + args[i].length() + "\n");
		}
	}

}
