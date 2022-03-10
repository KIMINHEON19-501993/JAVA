package com.car;
/*
 * [ 문제 2 ] 아래 조건에 맞는 프로그램을 작성 하시오.
Abstract 클래스에서 상속받고 Interface를 구현한 두 개의 클래스를 구현 하여
실행 결과가 나오도록 프로그램을 작성 한다
1. 사용 데이터
vehicleName engineSize oilTank oilSize distance
L3 1500 50 25 0
L5 2000 70 35 0
l oilTank는 자동차의 기본적인 주유 가능 사이즈 이다
l oilSize는 자동차에 현재 주유 되어진 양을 의미한다, 최초에는 반만 주유 되어 있다
l distance는 자동차의 주행 거리 이며 초기 값은 0이다
 */
public class CarTest {

	public static void main(String[] args) {
		// Car type의 객체 배열을 2개 만든다
		Car[] car = new Car[2];
		// 배열에 사용데이터에서 제공된 2개의 Car 객체를 넣는다.
		car[0] = new L3("L3", "1500", 50, 25, 0);
		car[1] = new L5("L5", "2000", 70, 35, 0);
		// 생성된 자동차의 기본 정보 출력
		
		System.out.println("vehicleName engineSize\toilTank\toilSize\tdistance   temperature");
		System.out.println("--------------------------------------------------------------");
		System.out.println("     "+car[0].getName() +"    \t"+ car[0].getEngine() +"\t   "
							+car[0].getOilTank()+"\t   "+car[0].getIntoilSize() +"\t   "
							+ car[0].getDistance()+"\t\t"+((L3) car[0]).getTempGage());
		System.out.println("     "+car[1].getName() +"    \t"+ car[1].getEngine() +"\t   "
							+car[1].getOilTank()+"\t   "+car[1].getIntoilSize() +"\t   "
							+ car[1].getDistance()+"\t\t"+((L5) car[1]).getTempGage());
		// 각각의 자동차에 25씩 주유 한다.
		car[0].setOil(25);
		car[1].setOil(25);
		// 25씩 주유한 자동차의 정보를 출력 한다
		System.out.println("\nvehicleName engineSize\toilTank\toilSize\tdistance   temperature");
		System.out.println("--------------------------------------------------------------");
		System.out.println("     "+car[0].getName() +"    \t"+ car[0].getEngine() +"\t   "
							+car[0].getOilTank()+"\t   "+car[0].getIntoilSize() +"\t   "
							+ car[0].getDistance()+"\t\t"+((L3) car[0]).getTempGage());
		System.out.println("     "+car[1].getName() +"    \t"+ car[1].getEngine() +"\t   "
							+car[1].getOilTank()+"\t   "+car[1].getIntoilSize() +"\t   "
							+ car[1].getDistance()+"\t\t"+((L5) car[1]).getTempGage());
		// 각각의 자동차에 80씩 주행 한다
		car[0].go(80);
		car[1].go(80);
		// 80씩 주행한 정보를 출력 하며 엔진온도 정보를 출력 한다
		System.out.println("\nvehicleName engineSize\toilTank\toilSize\tdistance   temperature");
		System.out.println("--------------------------------------------------------------");
		System.out.println("     "+car[0].getName() +"    \t"+ car[0].getEngine() +"\t   "
							+car[0].getOilTank()+"\t   "+car[0].getIntoilSize() +"\t   "
							+ car[0].getDistance()+"\t\t"+((L3) car[0]).getTempGage());
		System.out.println("     "+car[1].getName() +"    \t"+ car[1].getEngine() +"\t   "
							+car[1].getOilTank()+"\t   "+car[1].getIntoilSize() +"\t   "
							+ car[1].getDistance()+"\t\t"+((L5) car[1]).getTempGage());
	}

}
