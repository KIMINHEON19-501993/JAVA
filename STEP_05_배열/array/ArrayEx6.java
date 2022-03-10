package array;


public class ArrayEx6 {
//배열 : 동일한 자료형의 연속된 기억공간
	public static void main(String[] args) {
		//2차원 배열
		int[][] arr = new int[][] 
				{{1,2,3,4,5},
				 {6,7,8,9,10},
				 {11,12,13,14,15}
		};
		
		//System.out.println(arr.length); //행의 개수 : 3
		
		for(int i = 0; i <arr.length; i++) {
			for(int j = 0; j <arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
