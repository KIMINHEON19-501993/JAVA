package com.elite.test02;

public class Student extends Human{
	private String number;
	private String major;
	
	public Student() {
		// TODO 자동 생성된 생성자 스텁
	}

	public Student(String name, int age, int height, int weight, String number, String major) {
		super(name, age, height, weight);
		this.number = number;
		this.major =major;
		// TODO 자동 생성된 생성자 스텁
	}
	
	@Override
	public String printInformation() {
		return super.printInformation() +" "+ number + " " + major;
	}


	
	
}
