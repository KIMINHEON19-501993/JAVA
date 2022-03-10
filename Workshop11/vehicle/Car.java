package vehicle;

public class Car extends Vehicle{
	private double restOil;
	private int curWeight;
	public Car() {
		// TODO 자동 생성된 생성자 스텁
	}
	
	
	
	public Car(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
		// TODO 자동 생성된 생성자 스텁
	}

	public String toString() {
		return super.toString()+ "\t\t   " + getRestOil() +"\t\t   " + getCurWeight();
	}
	public void addOil(int oile) { //오일 추가 단 최대 오일량 초과 X
		if (getOilTankSize() > (getRestOil()+oile)) {
			setRestOil(getRestOil() + oile);
		}else {
			System.out.println("최대 오일량을 초과 하였습니다.");
		}
		
	}
	public void moving(int distance) {
		setRestOil(getRestOil() - (distance*getEfficiency()));		
	}
	public void addWeight(int weight) {//현재 적재량 추가 단 최대 적재량 초과 X
		if (getMaxWeight() > (getCurWeight()+weight)) {
			setCurWeight(getCurWeight() + weight);
		}else {
			System.out.println("최대 적재량을 초과 하였습니다.");
		}
	}


	public double getRestOil() {//현재 오일량
		return restOil;
	}


	public int getCurWeight() {//현재 무게
		return curWeight;
	}


	public void setRestOil(double restOil) {//현재 오일량 병경
		this.restOil = restOil;
	}


	public void setCurWeight(int curWeight) {//현재 무게 변경
		this.curWeight = curWeight;
	}

}
