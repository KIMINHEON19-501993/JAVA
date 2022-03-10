package tv2;

public class LgTv implements Tv{
	public void powerOn() {
		System.out.println("LG TV - 전원을 켠다.");
	}

	public void powerOff() {
		System.out.println("LG TV - 전원을 끈다.");
	}

	public void soundUp() {
		System.out.println("LG TV - 소리를 높인다.");
	}

	public void soundDown() {
		System.out.println("LG TV - 소리를 줄인다.");
	}
}
