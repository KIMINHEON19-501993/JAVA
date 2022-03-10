package tv2;

public class SamsungTv implements Tv{
	public void powerOn() {
		System.out.println("Samsung TV - 전원을 켠다.");
	}

	public void powerOff() {
		System.out.println("Samsung TV - 전원을 끈다.");
	}

	public void soundUp() {
		System.out.println("Samsung TV - 소리를 높인다.");
	}

	public void soundDown() {
		System.out.println("Samsung TV - 소리를 줄인다.");
	}
}
