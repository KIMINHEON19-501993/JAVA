package object;

/* 접근 지정자
 * +(public), -(private), #(protected), (default)
 * 클래스명 : Person
 * +name : String
 * +age : int
 * +score : float
 * 
 * +setPerson(name:String, a:int, s:flaat) : void
 * +viewPerson() : void
 */
class Person {
	// 적역 변수,멤버변수 : 클래스 내에서 동작 하는 변수(클래스가 가지고 있는 변수) --> 필드(객체지향 언어의 표현)
	public String name;
	public int age;
	public float score;
	
	public void setPerson(String name, int age, float score) {//멤버함수 --> 메서드
		// this. 자기 자신의 객체
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public void viewPerson() {
		System.out.println("이름 : " + name + "\n나이 : " + age + "\n점수 : " + score);
	}
}

public class ObjectEx1 {

	public static void main(String[] args) {
		Person ps = new Person(); // 객체 생성, 변수 선언
		// 객체(오브젝트), 오브젝트, 인스턴트, 클래스 --> 변수와 함수의 조합
		// 클래스의 오브젝트는 인스턴스 --> 객체
		ps.setPerson("뽀로로", 23, 100.0f);
		ps.viewPerson();
		System.out.println("뽀로로 해시 코드 : " + ps.hashCode());
		// 해시코드(hashCode) : 객체를 구분하기 위한 고유의 정수값을 출력 해주는 메소드

		//새로운 객체를 만들면 해시코드가 달라진다.
		ps = new Person();
		ps.setPerson("크롱", 20, 10.0f);
		ps.viewPerson();
		System.out.println("크롱 해시 코드 : " + ps.hashCode());
		System.out.println(ps);
		
		
	}

}
