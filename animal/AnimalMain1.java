package animal;
//정적 바인딩
//컴파일(Compile) 시간에 호출 결정된다.
//변수의 타입이 수퍼 클래스이니 수퍼 클래스의 메소드를 호출한다.

import java.util.Scanner;

public class AnimalMain1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dog dog = null;
		Cat cat = null;
		Duck duck = null;
		Fish fish = null;
		int n;

		while (true) {
			System.out.print("1.Dog 2.Cat 3.Duck 4.Fish 5.Exit \n선택하세요. : ");
			n = sc.nextInt();

			switch (n) {
			case 1:
				dog = new Dog();
				dog.speak();
				dog.walk();
				break;
			case 2:
				cat = new Cat();
				cat.speak();
				cat.walk();
				break;
			case 3:
				duck = new Duck();
				duck.speak();
				duck.walk();
				break;
			case 4:
				fish = new Fish();
				fish.speak();
				fish.walk();
				break;
			default :
				System.out.println("*****종료합니다*****");
				sc.close();
				System.exit(0);
			
			}

		}
	}

}
