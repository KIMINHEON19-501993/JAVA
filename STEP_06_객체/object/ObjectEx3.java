package object;

//setter : 멤버변수 하나당 하나씩 값을 대입하는 함수
//getter : 멤버변수 하나당 하나씩 값(대입한값)을 리턴하는 함수 

class Member {
	private String name;
	private int age;
	private double tall;
 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getTall() {
		return tall;
	}

	public void setTall(double tall) {
		this.tall = tall;
	}

}

public class ObjectEx3 {

	public static void main(String[] args) {
		Member mb = new Member();
		mb.setName("뽀로로");
		System.out.println("이름 : " + mb.getName());
		mb.setAge(20);
		System.out.println("나이 : " +mb.getAge());
		mb.setTall(160.0);
		System.out.println("신장 : " + mb.getTall());
		
	}

}
