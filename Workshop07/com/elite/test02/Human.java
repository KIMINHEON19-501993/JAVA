package com.elite.test02;

public class Human {
	protected String name;
	protected int age;
	protected int height;
	protected int weight;

	public Human() {
		// TODO 자동 생성된 생성자 스텁
	}

	public Human(String name, int age, int height, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public String printInformation() {
		return name + " " + age + " " + height + " " + weight;

	}
}
