package com.car;

abstract public class Car {
	private String name;
	private String engine;
	private int oilTank; // Oil Tank 사이즈
	private int intoilSize; // 현재 주유된 Oil 양
	private int distance; // 주행 거리
	
	public Car() {
		// TODO 자동 생성된 생성자 스텁
	}

	public Car(String name, String engine, int oilTank, int intoilSize, int distance) {
		super();
		this.name = name;
		this.engine = engine;
		this.oilTank = oilTank;
		this.intoilSize = intoilSize;
		this.distance = distance;
	}
	
	public void go(int distance) {
		// 주행
	}
	public void setOil(int oilSize) {
		 //주유
	}

	public String getName() {
		return name;
	}

	public String getEngine() {
		return engine;
	}

	public int getOilTank() {
		return oilTank;
	}

	public int getIntoilSize() {
		return intoilSize;
	}

	public int getDistance() {
		return distance;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public void setOilTank(int oilTank) {
		this.oilTank = oilTank;
	}

	public void setIntoilSize(int intoilSize) {
		this.intoilSize = intoilSize;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	
}
