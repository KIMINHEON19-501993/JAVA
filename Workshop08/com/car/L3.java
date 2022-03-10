package com.car;

public class L3 extends Car implements Temp {

	public L3() {
		// TODO 자동 생성된 생성자 스텁
	}
	
	
	public L3(String name, String engine, int oilTank, int intoilSize, int distance) {
		super(name, engine, oilTank, intoilSize, distance);
		// TODO 자동 생성된 생성자 스텁
	}

	@Override
	public void go(int distance) {
		setDistance(getDistance()+distance);
		int count = distance / 10;
		setIntoilSize(getIntoilSize() - count);
		
	}
	@Override//오일충전
	public void setOil(int oilSize) {
		setIntoilSize(getIntoilSize() + oilSize);
	}
	@Override//엔진온도측정
	public int getTempGage() {
		int tempgage = getDistance() / 10;
		return tempgage;
	}

}
