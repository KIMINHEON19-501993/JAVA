package 과제07;
//	[문제 38] 다음과 같은 결과가 나오도록 수정하시오
//    (단, main()안의 내용수정과 새로운 Method추가하지마시오)
/*
	class Parent
	{
		String name;
		public Parent(){	
			System.out.println("###인적사항###");
		}
		public Parent(String name){	

		}
		public void printView(){
			System.out.println("이름 : " + name);
		}
	}
	class Child extends Parent
	{
		int age;
		float tall;
		
		public Child(String name, int age, float tall){

		}
		public void printView(){
			System.out.println("나이 : " + age);
			System.out.println("신장 : " + tall);
		}
	}
	public class Test38 {
		public static void main(String[] args) {
			new Child("민들래", 23, 165.3f).printView();
		}
	}
 */
class Parent
{
	String name;
	
	public Parent(){	
		System.out.println("###인적사항###");
	}
	public Parent(String name){	
		this.name = name;
	}
	public void printView(){
		
		System.out.println("이름 : " + name);
	}
}
class Child extends Parent
{
	int age;
	float tall;
	
	public Child(String name, int age, float tall){
		this.name = name;
		this.age = age;
		this.tall = tall;
	}
	public void printView(){
		new Parent(name).printView();
		System.out.println("나이 : " + age);
		System.out.println("신장 : " + tall);
	}
}
public class Test38 {
	public static void main(String[] args) {
		new Child("민들래", 23, 165.3f).printView();
	}
}

