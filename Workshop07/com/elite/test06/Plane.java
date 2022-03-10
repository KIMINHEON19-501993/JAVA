package com.elite.test06;

abstract public class Plane {
	private String planeName;
	private int fuelSize;

	public Plane() {

	}

	public Plane(String planeName, int fuelSize) {
		this.planeName  = planeName;
		this.fuelSize = fuelSize;
	}

	public void refuel(int fuel) {
		// 주유
	}

	public void flight(int distance) {
		// 운항
	}

	public String getPlaneName() {
		return planeName;
	}

	public int getFuelSize() {
		return fuelSize;
	}

	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}
	
}
