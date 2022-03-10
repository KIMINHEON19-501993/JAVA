package vehicle;

public class Truck extends Car{
	public Truck() {
		// TODO 자동 생성된 생성자 스텁
	}
	
	public Truck(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
		// TODO 자동 생성된 생성자 스텁
	}

	public double getEfficiency() {
		//현재 적재량 5kg 당 연비 0.2km 감소
		return 5.0 - ((getCurWeight() / 5 )* 0.2);
		
	}
	
	public void moving(int distance) {//이동시 오일 감소량
		setRestOil(getRestOil()-calcOil(distance)); 
	}
	
	private double calcOil(int distance) {//연비에 따른 오일 사용량
		return distance / getEfficiency();
		
	}
	public int getCost(int distance) {//요금
		int oil = (int) calcOil(distance); 
		return   oil * 3000;
		
	}
	
	@Override
	public String toString() {
		return super.toString()+"\t\t"+getEfficiency();
	}
	
}
