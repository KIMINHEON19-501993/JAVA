package animal;
//���� ���ε�
//�������� ����Ͽ� �޼ҵ带 ȣ���� ��, �߻��ϴ� �����̴�.
//���� �ð�(Runtime) ��, ������ �����ϴ� ������ ������ �����ȴ�.
//���� �����ϴ� ��ü�� ���� Ŭ�����̴� ���� Ŭ������ �޼ҵ带 ȣ���Ѵ�.
import java.util.Scanner;

public class AnimalMain2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Animal ani = null;
		int n;

		while (true) {
			System.out.print("1.Dog 2.Cat 3.Duck 4.Fish 5.Exit \n�����ϼ���. : ");
			n = sc.nextInt();

			switch (n) {
			case 1:
				ani = new Dog();
				break;
			case 2:
				ani = new Cat();
				break;
			case 3:
				ani = new Duck();
				break;
			case 4:
				ani = new Fish();
				break;
			default :
				System.out.println("*****�����մϴ�*****");
				sc.close();
				System.exit(0);	
			}
			ani.speak();
			ani.walk();
		}
	}

}
