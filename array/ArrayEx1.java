package array;

public class ArrayEx1 {
//배열 : 동일한 자료형의 연속된 기억공간
	public static void main(String[] args) {
			String[] car = {"쏘나타", "스파크", "모닝", "스타렉스"};
			car[3] = "카렌서";
			
			for(String CAR : car) {
				System.out.println(CAR);
		}
		
	}

}
