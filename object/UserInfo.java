package object;

import java.io.Serializable;

public class UserInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private double score;
	
	public UserInfo() {
		// TODO �ڵ� ������ ������ ����
	}

	public UserInfo(String name, int age, double score)  {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	public void disp(){
		System.out.print("�̸� : " + name);
		System.out.print(" ���� : " + age);
		System.out.print(" ���� : " + score);
	}
	
	
	
}
