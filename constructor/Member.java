package constructor;

public class Member {
	private String name = "뽀로로";
	private int age = 25;
	public Member() {
		
	}
	
	public Member(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	public void view() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
	
	
}
