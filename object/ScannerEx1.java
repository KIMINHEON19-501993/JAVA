package object;

import java.util.Scanner;

//scanner : �Է�ó�� ��ü
public class ScannerEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� : ");  String str = sc.nextLine();
		System.out.print("���� : ");  int a = sc.nextInt();
		System.out.print("�Ǽ� : ");  double b = sc.nextDouble();
		System.out.print("���� : ");  char c = sc.next().charAt(0);
		System.out.println(str);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		sc.close();
	}

}