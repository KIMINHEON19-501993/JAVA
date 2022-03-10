package animal;
//동적 바인딩
//다형성을 사용하여 메소드를 호출할 때, 발생하는 현상이다.
//실행 시간(Runtime) 즉, 파일을 실행하는 시점에 성격이 결정된다.
//실제 참조하는 객체는 서브 클래스이니 서브 클래스의 메소드를 호출한다.
import java.util.Scanner;

public class AnimalMain2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Animal ani = null;
		int n;

		while (true) {
			System.out.print("1.Dog 2.Cat 3.Duck 4.Fish 5.Exit \n선택하세요. : ");
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
				System.out.println("*****종료합니다*****");
				sc.close();
				System.exit(0);	
			}
			ani.speak();
			ani.walk();
		}
	}

}
