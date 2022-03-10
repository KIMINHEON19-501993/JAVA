	package array;
	//arsg를 이용하여 세수를 입력 후 최댓값 최솟값 출력
	public class ArrayEx4 {
	//배열 : 동일한 자료형의 연속된 기억공간
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
