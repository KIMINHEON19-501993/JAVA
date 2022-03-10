package vehicle;

public class Vehicle {
	private int maxWeight;
	private double oilTankSize;
	private double efficiency;
	
	public Vehicle() {
		// TODO 자동 생성된 생성자 스텁
	}

	public Vehicle(int maxWeight, double oilTankSize, double efficiency) {
		super();
		this.maxWeight = maxWeight;
		this.oilTankSize = oilTankSize;
		this.efficiency = efficiency;
	}
	
	@Override
	public String toString() {
		return "   "+getMaxWeight() + "\t\t  " + getOilTankSize();
	}

	public int getMaxWeight() {
		return maxWeight;
	}

	public double getOilTankSize() {
		return oilTankSize;
	}

	public double getEfficiency() {
		return efficiency;
	}

	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}

	public void setOilTankSize(double oilTankSize) {
		this.oilTankSize = oilTankSize;
	}

	public void setEfficiency(double efficiency) {
		this.efficiency = efficiency;
	}
	
}
