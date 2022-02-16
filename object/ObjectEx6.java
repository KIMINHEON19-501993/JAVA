package object;

import java.util.Scanner;

class MemberPhone {

	String name;
	String phone;

	public void input() {
		// 스캐너
		
		Scanner sc = new Scanner(System.in);

		System.out.print("이름을 입력 하세요 : ");
		name = sc.nextLine();
		System.out.print("전화번호를 입력 하세요 : ");
		phone = sc.nextLine();
		
		sc.close();
		
	}

	public void output() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phone);
		System.out.println(name + "고객님의 전화번호는 " + phone + "입니다.");
	}

}

public class ObjectEx6 {

	public static void main(String[] args) {

		MemberPhone mp = new MemberPhone();

		mp.input();
		mp.output();
	}

}
