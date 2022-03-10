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
		// TODO 자동 생성된 생성자 스텁
	}

	public UserInfo(String name, int age, double score)  {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	public void disp(){
		System.out.print("이름 : " + name);
		System.out.print(" 나이 : " + age);
		System.out.print(" 점수 : " + score);
	}
	
	
	
}
