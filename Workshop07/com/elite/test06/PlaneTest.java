package com.elite.test06;

public class PlaneTest {

	public static void main(String[] args) {
		// Airplane과 Cargoplane 객체 생성
		Airplane air = new Airplane("L747", 1000);
		Cargoplane car = new Cargoplane("C40", 1000);
		// 생성된 객체의 정보 출력
		System.out.println(air.getClass().toString().substring(
				air.getClass().toString().lastIndexOf(".")+1)+"\t"+car.getClass().toString().substring(
						car.getClass().toString().lastIndexOf(".")+1));
		System.out.println("-----------------------------");
		System.out.println(air.getPlaneName() + "\t\t" + air.getFuelSize());
		System.out.println(car.getPlaneName() + "\t\t" + car.getFuelSize());
		System.out.println();
		// Airplane과 Cargoplane 객체에 100씩 운항
		air.flight(-100);
		car.flight(-100);
		// 운항 후 객체의 변경된 정보 출력
		System.out.println(air.getClass().toString().substring(
				air.getClass().toString().lastIndexOf(".")+1)+"\t"+car.getClass().toString().substring(
						car.getClass().toString().lastIndexOf(".")+1));
		System.out.println("-----------------------------");
		System.out.println(air.getPlaneName() + "\t\t" + air.getFuelSize());
		System.out.println(car.getPlaneName() + "\t\t" + car.getFuelSize());
		System.out.println();
		// Airplane과 Cargoplane 객체에 200씩 주유
		air.flight(200);
		car.flight(200);
		// 주유 후 객체의 변경된 정보 출력
		System.out.println(air.getClass().toString().substring(
				air.getClass().toString().lastIndexOf(".")+1)+"\t"+car.getClass().toString().substring(
						car.getClass().toString().lastIndexOf(".")+1));
		System.out.println("-----------------------------");
		System.out.println(air.getPlaneName() + "\t\t" + air.getFuelSize());
		System.out.println(car.getPlaneName() + "\t\t" + car.getFuelSize());
	}

}
