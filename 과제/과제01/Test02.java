package 과제01;

public class Test02 {

	public static void main(String[] args) {
		// [문제2]65430원을 만들기 위한 화폐의 갯수를 구하시오.

		  int money = 65430; int 만, 천, 백, 십;
		  
		  만 = money / 10000; 
		  천 = (money % 10000) / 1000; 
		  백 = (money % 1000) / 100; 
		  십 = (money % 100) / 10; 
		  System.out.println("만원 : " + 만);
		  System.out.println("천원 : " + 천); 
		  System.out.println("백원 : " + 백);
		  System.out.println("십원 : " + 십);
	}

}
