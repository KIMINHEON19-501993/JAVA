package com.elite.test07;

abstract public class Employee {
	private String name;
	private int number; 
	private String department; // 부서
	private int salary; // 월급
	
	public Employee() {
		// TODO 자동 생성된 생성자 스텁
	}

	public Employee(String name, int number, String department, int salary) {
		super();
		this.name = name;
		this.number = number;
		this.department = department;
		this.salary = salary;
	}
	
	public double tax() {
		return 0;
		
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public String getDepartment() {
		return department;
	}

	public int getSalary() {
		return salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
