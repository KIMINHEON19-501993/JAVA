package animal;

public class Duck extends Animal{
	@Override
	public void walk() {
		System.out.println("두발로 걸어요.");
	}
	
	@Override
	public void speak() {
		System.out.println("꽥 꽥");
	}

}
