package interfaceex;

interface Cryable{
	abstract public void cry();
	
}
interface Flyable{
	abstract public void fly();
}

class Eagle implements Flyable,Cryable{ //클래스 다중 상속 불가

	@Override
	public void fly() {
		System.out.println("독수리가 날아 다녀요~");
	}

	@Override
	public void cry() {
		System.out.println("까악까악~");
	}

	
}

public class InterfaceEx2 {

	public static void main(String[] args) {
		Eagle ea = new Eagle();
		ea.fly();
		ea.cry();
	}

}

//abstract class Cryable{
//	abstract public void cry();
//	
//}
//abstract class Flyable{
//	abstract public void fly();
//}
//
//class Eagle extends Flyable{//클래스 다중 상속 불가
//
//	@Override
//	public void fly() {
//		System.out.println("독수리가 날아 다녀요~");
//		new CryableEx().cry();
//	} 
//	class CryableEx extends Cryable{
//
//		@Override
//		public void cry() {
//			System.out.println("까악까악~");
//		}
//		
//	}
//}
//
//public class InterfaceEx2 {
//
//	public static void main(String[] args) {
//		new Eagle().fly();
//	}
//
//}
