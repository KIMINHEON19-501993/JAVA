package com.elite.test04;

public class InvalidException extends Exception {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidException() {
		super();
		System.out.println("입력 값에 오류가 있습니다.");
	}
}
