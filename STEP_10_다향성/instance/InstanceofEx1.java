package instance;

class Family{}
class Father extends Family{}
class Mother extends Family{}
class Son extends Family{}
public class InstanceofEx1 {

	public static void main(String[] args) {
		Family family = new Family();
		Father father = new Father();
//		Mother mother = new Mother();
		Son son = new Son();
		
		System.out.println(father  instanceof Family);//true
		
		Family fm1 = new Father();
//		Family fm2 = (Family)(new Father());
//		Family fm3 = (Family)father;
		
		
		
		//검사 대상이 상속 관계에 있을때  instanceof 검사를 할수 있다.
		System.out.println(son instanceof Family);
		//true 상속 관계에 있으므로 인스턴트 변수 사용가능
		
		System.out.println(son instanceof Son);
		//true 같은 객체 이므로 인스턴스 변수 사용가능
		
		System.out.println(fm1 instanceof Father);
		//true 같은 레벨의 객체 이므로 인스턴스 변수 사용가능
		
		System.out.println(family instanceof Father);
		//false 상속 관계에 있으나 family 가 상위 객체 이므로 인스턴트 변수 사용불가능
		
		//System.out.println(mother instanceof son);
		//error 같은 
		
		
	}

}
