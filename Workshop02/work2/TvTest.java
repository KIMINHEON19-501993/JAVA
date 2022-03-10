package work2;

public class TvTest {

	public static void main(String[] args) {
		String max = " ";
		String min = " ";
		
		Tv tvArray[] = new Tv[3];
		tvArray[0] = new Tv("INFINIA", 1500000, "LED TV");
		tvArray[1] = new Tv("XCANVAS", 1000000, "LCD TV");
		tvArray[2] = new Tv("CINEMA", 2000000, "3D TV");
		for (int i = 0; i < 3; i++) {
			
			System.out.println(tvArray[i].toString());
			if(tvArray[0].getPrice() <= tvArray[i].getPrice()) {
				max = tvArray[i].getName();
			}
			if(tvArray[0].getPrice() >= tvArray[i].getPrice()) {
				min = tvArray[i].getName();
			}
		}
		
		System.out.println("가장 비싼 제품 : " + max);
		System.out.println("가장 저렴한 제품 : " + min);
			
	}

}
