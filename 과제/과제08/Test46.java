package 과제08;

import java.util.Scanner;

/*
[문제46] 동적바인딩(Dynamic Binding)을 이용하여 다음 프로그램을 완성하시오
(1)클래스명 : Shape
   -nData1:int
   -nData2:int
   +Shape(int data1, int data2)
    +getter    
    +getArea():double            ==> abstract 
(2)클래스명 : Triangle              ==> Shape를 상속받음
   +Triangle(data1:int, data2:int)
   +getArea():double 
(4)클래스명 : Rectangle           ==> Shape를 상속받음
   +Rectangle(data1:int, data2:int)
   +getArea():double

(5)Test46클래스의 main()메서드에서 아래코드외에 나머지를 완성하시오
   Shape ob=null;
   Scanner sc=new Scanner(System.in);
   while(true){
             System.out.print("1.삼각형 2. 사각형  3. 종  료\n선택(1-3)");
             int n=sc.nextInt();
	                 :
   }
*/
abstract class Shape {
	private int nData1;
	private int nData2;
	
	public Shape() {
		// TODO 자동 생성된 생성자 스텁
	}

	public Shape(int data1, int data2) {
		this.nData1 = data1;
		this.nData2 = data2;
	}

	public int getnData1() {
		return nData1;
	}

	public int getnData2() {
		return nData2;
	}

	abstract public double getArea();
}

class Triangle extends Shape {

	public Triangle() {
	}

	public Triangle(int data1, int data2) {
		super(data1, data2);
		
		// TODO 자동 생성된 생성자 스텁
	}

	@Override
	public double getArea() {
		return (getnData1() * getnData2()) / 2.0;
	}
}

class Rectangle extends Shape {
	public Rectangle() {
		// TODO 자동 생성된 생성자 스텁
	}

	public Rectangle(int data1, int data2) {
		super(data1, data2);
	}

	@Override
	public double getArea() {
		return (double)getnData1() * getnData2();
	}

}

class Test46 {

	public static void main(String[] args) {
		Shape ob = null;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("1.삼각형 2. 사각형  3. 종  료\n선택(1-3)");
			int n = sc.nextInt();
			int a,b;
			switch (n) {
			case 1:
				System.out.print("밑변 입력 : ");a = sc.nextInt();
				System.out.print("높이 입력 : ");b = sc.nextInt();
				ob = new Triangle(a,b);
				break;
			case 2:
				System.out.print("가로 입력 : ");a = sc.nextInt();
				System.out.print("세로 입력 : ");b = sc.nextInt();
				ob = new Rectangle(a,b);
				break;
			case 3:
				sc.close();
				System.exit(0);
				break;
			}
			System.out.println(ob.getArea());
			
		}
	
	}
}
