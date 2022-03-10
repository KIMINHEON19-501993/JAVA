package test4;

import java.io.Serializable;

public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private double tall;
	

	public User(String name, int age, double tall) {
		super();
		this.name = name;
		this.age = age;
		this.tall = tall;
	}
	
	public void disp(){
		System.out.print("이름 : " + name);
		System.out.print(" 나이 : " + age);
		System.out.print(" 신장 : " + tall);
	}
	
	public String toString(){
		return "이름 : " + name + " 나이 : " + age + " 신장 : " + tall + "\n";
	}
}
