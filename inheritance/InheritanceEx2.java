package inheritance;
//생성자 

class ParentEx{
	public ParentEx() {
		super();
		System.out.println("parent class");
	}
}

class ChildEx extends ParentEx{
	public ChildEx() {
		super(); 	// 생략가능, 없어도 동작됨 
		System.out.println("child class");
	}
}
public class InheritanceEx2 {

	public static void main(String[] args) {
		new ChildEx();
	}

}
/* this.변수
 * this.메서드()
 * this()
 * this(인자, 인자, ..)  ---생성자(자기 자신의 객체가 가진 생성자 호출)
 * 
 * super.변수
 * super.메서드()
 * super()
 * super(인자, 인자, ..)  ---생성자(부모 클래스의 생성자 호출)
 */














































