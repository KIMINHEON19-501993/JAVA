package array;

public class ArrayEx3 {
//배열 : 동일한 자료형의 연속된 기억공간
	public static void main(String[] args) {
		System.out.println("args의 길이 : " + args.length);

		for (int i = 0; i < args.length; i++) {
			System.out.println("args [" + i + "] : " + args[i]);
			System.out.println("args [" + i + "]의 길이 : " + args[i].length() + "\n");
		}
	}

}
