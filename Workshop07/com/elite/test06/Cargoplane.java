package com.elite.test06;

public class Cargoplane extends Plane {
	public Cargoplane() {
		// TODO 자동 생성된 생성자 스텁
	}

	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
		// TODO 자동 생성된 생성자 스텁
	}

	@Override
	public void flight(int distance) {
		if(distance < 0) {
			int count = (distance / 10) *50;
			this.setFuelSize(getFuelSize() + count);
		}else this.setFuelSize(getFuelSize() + distance);
	}
}
