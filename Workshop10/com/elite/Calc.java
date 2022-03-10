package com.elite;

public class Calc {

	public int calculate(int data) {
		int i = 1;
		int sum = 0;
		while (data >= i) {
			if (i % 2 == 0) {
				sum += i;
			}
			i++;
		}
		return sum;
	}

}
