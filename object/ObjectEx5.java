package object;
/*
 * 클래스명 : Sales
 * -item :  String
 * -qty : int
 * cost : int
 * +setter
 * +getter
 * +toString() : String <-- 출력 문장
 * +getPrice : int <--수량 * 단가 를 출력
 * 
 * 품목 : apple  <--toString를 이용하여 main()에서 출력
 * 수량 : 5
 * 단가 : 1200원
 * 금액 : 6000원
 *
 * apple 1200원 짜리를 5개 구입하려면 6000이 필요함 <-- getter을 이용하여 main()에서 출력
 */


public class ObjectEx5 {

	public static void main(String[] args) {
		Sales sa = new Sales();
		
		sa.setItem("apple");
		sa.setQty(5);
		sa.setCost(1200);
		 
		System.out.println(sa.toString()); //toString 생략가능
		System.out.printf("%s %d원 짜리 %d개 구입하려면 %d원이 필요함.",
						sa.getItem(),sa.getCost(),sa.getQty(),sa.getPrice());
		
	}

}
