package animal;
//���� ���ε�
//������(Compile) �ð��� ȣ�� �����ȴ�.
//������ Ÿ���� ���� Ŭ�����̴� ���� Ŭ������ �޼ҵ带 ȣ���Ѵ�.

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
			System.out.print("1.Dog 2.Cat 3.Duck 4.Fish 5.Exit \n�����ϼ���. : ");
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
				System.out.println("*****�����մϴ�*****");
				sc.close();
				System.exit(0);
			
			}

		}
	}

}
