package com.elite.test04;

public class Calc {
	double data;

	public double getSum(int data) {
		int sum = 0;

		if (data > 5 || data < 2) {
			sum = 0;
		}
		else {
			for (int i = 1; i <= data; i++) {
				sum += i;
			}

		}
		return sum;
	}
}
