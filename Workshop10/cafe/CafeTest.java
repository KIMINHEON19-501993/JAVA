package cafe;
/*
Americano 4000
Caffelatte 5000
Macchiato 6000
 */
public class CafeTest {

	public static void main(String[] args) {
		Cafe cafe = new Cafe();
		// Coffee 객체를 3개 생성하고, setCoffee()이용하여 Coffee 배열에 넣는다.
		Coffee[] coffee = new Coffee[3];
		
		coffee[0] = new Coffee("Americano",4000);
		coffee[1] = new Coffee("Caffelatte",5000);
		coffee[2] = new Coffee("Macchiato",6000);
		cafe.setCoffee(coffee[0]);
		cafe.setCoffee(coffee[1]);
		cafe.setCoffee(coffee[2]);
		
		// Coffee 배열에 있는 객체 정보를 모두 출력 한다 – for 문을 이용 할 것
		
		for (Coffee coffee2 : coffee) {
			System.out.println(coffee2);
		}
		System.out.println();
		// Coffee 가격의 합을 출력 한다
		System.out.print("Coffee 가격의 합 :" +cafe.totalPrice() + "원");
		
	}

	

}
