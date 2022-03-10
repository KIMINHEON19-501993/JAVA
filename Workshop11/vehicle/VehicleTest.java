package vehicle;
/*
 * maxWeight (Kg) oilTankSize (L) Efficiency (Km/L) 
 * 1000            100             5
 */
public class VehicleTest {

	public static void main(String[] args) {
		Truck car = new Truck(1000,100,5);
		System.out.println("최대적재중량\t오일탱크크기\t잔여오일량 \t현재적재중량\t연비\r\n"
				+ "====================================================================");
		// 초기 트럭의 정보를 출력한다.
		System.out.println(car.toString());
		
		// 50L 주유 후 트럭의 정보를 출력한다.
		car.addOil(50);
		System.out.println(car.toString());
		
		// 50Km 주행 후 트럭의 정보를 출력한다.
		car.moving(50);
		System.out.println(car.toString());
		
		// 100Kg을 적재한 후 트럭의 정보를 출력한다.
		car.addWeight(100);
		System.out.println(car.toString());
		
		// 30Km 주행 후 트럭의 정보를 출력한다.
		car.moving(30);
		System.out.println(car.toString());
		// 100Kg을 탑재하고 30Km를 주행하면 요금이 얼마인지 출력한다.
		System.out.println("요금 : " + (car.getCost(30)) +"원" );
	}

}
