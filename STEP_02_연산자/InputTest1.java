package STEP_02_������;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest1 {

	public static void main(String[] args) throws IOException{
		
		  InputStreamReader isr = new InputStreamReader(System.in);//�Է� ��Ʈ�� ó��
		  BufferedReader br = new BufferedReader(isr);
		  
		  //ǥ�� �Է� ��ġ : Ű���� , ǥ�� ��� ��ġ : ����� 
		  //System.in �ַܼ� �Է� --> Ű���� //System.out �ַܼ�
		  //��� --> �����
		  
		  String name;
		  char gender;
		  int age;
		  float tall;
		  double weight;
		  
		  System.out.print("�̸��� �Է� �ϼ��� : "); 
		  name = br.readLine();
		  
		  System.out.print("������ �Է� �ϼ���(M or W) : "); 
		  gender = br.readLine().charAt(0);
		  
		  System.out.print("���̸� �Է� �ϼ��� : "); 
		  age = Integer.parseInt(br.readLine());
		  
		  System.out.print("������ �Է� �ϼ��� : "); 
		  tall = Float.parseFloat(br.readLine());
		  
		  System.out.print("ü���� �Է� �ϼ��� : "); 
		  weight = Double.parseDouble(br.readLine());
		  
		  /* charAt(index) �ε����� �־��� ��ġ���� �ش��ϴ� ���ڸ� ����
		   * �ε����� 0 ���� ���� ���� ū ���� ���ڿ� -1(������ �ε����� �ǹ�)
		   * . �� �ΰ��� �ǹ̸� ����
		   * 1. ���� :Ư�� ��ü ������ �Լ��� ȣ�� �Ҷ� ��ü��.�Լ���  ex) System �� ~~
		   * 2. �Է� ex) charAt()
		   */
		  
		  System.out.println("�̸� : " + name);
		  System.out.println("���� : " + gender);
		  System.out.println("���� : " + age);
		  System.out.println("���� : " + tall);
		  System.out.println("ü�� : " + weight);
		  // . �� �ΰ��� �ǹ̸� ����
		  //1. ���� ex) System �� ~~
		  //2. �Է� ex) charAt
		  
		  isr.close();
		 
		
	
	}

}