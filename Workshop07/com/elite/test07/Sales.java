package com.elite.test07;

public class Sales extends Employee implements Bonus{
	public Sales() {
		// TODO 자동 생성된 생성자 스텁
	}

	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
		// TODO 자동 생성된 생성자 스텁
	}

	@Override
	public double tax() {
		return getSalary() * 0.13;
	}
	@Override
	public void incebtive(int pay) {
		setSalary(this.getSalary() + (int)(pay * 1.2));
	}

}
